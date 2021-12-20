package com.zzz.testVerifyCode.servlet;
/**
 * author:zhouzhongzhong
 * date:2021/12/19,20:31
 */

import com.zzz.verifycode.VerifyCode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class VerifyCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //验证码生成路径
        String path = "D:\\testVerifyCode\\src\\main\\resources\\imgs";
        String code = VerifyCode.outputVerifyCodeImgToHtml(path, response);
        System.out.println(code);
    }
}
