package com.itheima.web.controller.store.company;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.store.Company;
import com.itheima.utils.BeanUtil;
import com.itheima.web.controller.BaseServlet;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// uri:/store/company?operation=list
@WebServlet("/store/company")
public class CompanyServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("operation");
        if("list".equals(operation)){
            list(request,response);
        }else if("toAdd".equals(operation)){
            toAdd(request,response);
        }else if("save".equals(operation)){
            save(request,response);
        }else if("delete".equals(operation)){
            delete(request,response);
        }else if("toEdit".equals(operation)){
            toEdit(request,response);
        }else if("edit".equals(operation)){
            edit(request,response);
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        Company company = BeanUtil.fillBean(request, Company.class, "yyyy-MM-dd");
        companyService.update(company);
        response.sendRedirect(request.getContextPath()+"/store/company?operation=list");
    }

    private void toEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String id = request.getParameter("id");
        Company company = companyService.findById(id);
        request.setAttribute("company",company);
        request.getRequestDispatcher("/WEB-INF/pages/store/company/update.jsp").forward(request,response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        String id = request.getParameter("id");
        Company company = companyService.findById(id);
        companyService.delete(company);
        System.out.println(request.getContextPath());
        response.sendRedirect(request.getContextPath()+"/store/company?operation=list");
    }

    private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Company company = BeanUtil.fillBean(request, Company.class, "yyyy-MM-dd");
        companyService.save(company);
        response.sendRedirect(request.getContextPath()+"/store/company?operation=list");

    }

    private void toAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/store/company/add.jsp").forward(request,response);
    }

    private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int page=1;
        int size=5;
        if(StringUtils.isNotBlank(request.getParameter("page"))){
            page = Integer.parseInt(request.getParameter("page"));
        }
        if(StringUtils.isNotBlank(request.getParameter("size"))){
            size = Integer.parseInt(request.getParameter("size"));
        }
        PageInfo all = companyService.findAll(page, size);
        //将数据保存到指定的位置
        request.setAttribute("page",all);
        //跳转页面
        request.getRequestDispatcher("/WEB-INF/pages/store/company/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}