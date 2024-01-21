package com.crazy.rain.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: loginController
 * @Description: 登录控制器
 * @author: CrazyRain
 * @date: 2024/1/21 16:00
 */
@WebServlet("/user/*")
public class UserController extends BaseController {

    public void login(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getOutputStream().print("hello");
            System.out.println("123455");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
