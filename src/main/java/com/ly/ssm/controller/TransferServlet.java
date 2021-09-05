package com.ly.ssm.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 在servlet3.0以后，我们可以不用再web.xml里面配置servlet，
 * 只需要加上@WebServlet注解就可以修改该servlet的属性了。
 * web.xml可以配置的servlet属性，在@WebServlet中都可以配置。
 */
@WebServlet(name="transferServlet",urlPatterns = "/q")
public class TransferServlet extends HttpServlet {

    // 直接重写doGet方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println("收到请求");
        // 响应
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().print("成功");
    }
}
