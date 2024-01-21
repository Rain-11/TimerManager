package com.crazy.rain.controller;

import com.crazy.rain.common.Result;
import com.crazy.rain.pojo.Schedule;
import com.crazy.rain.pojo.User;
import com.crazy.rain.service.UserService;
import com.crazy.rain.service.impl.UserServiceImpl;
import com.crazy.rain.util.WebUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

/**
 * @ClassName: loginController
 * @Description: 登录控制器
 * @author: CrazyRain
 * @date: 2024/1/21 16:00
 */
@WebServlet("/user/*")
public class UserController extends BaseController {
    private UserService userService = new UserServiceImpl();

    public void login(HttpServletRequest request, HttpServletResponse response) {
        User user = WebUtil.readJson(request, User.class);
        User userInfo = userService.login(user.getEmail(), user.getPassword());
        if (userInfo == null) {
            WebUtil.writeJson(response, Result.fail());
        }
        WebUtil.writeJson(response, Result.success());
    }

    public void addSchedule(HttpServletRequest request, HttpServletResponse response) {
        boolean flag = userService.addSchedule(WebUtil.readJson(request, Schedule.class));
        if (!flag) {
            WebUtil.writeJson(response, Result.fail());
        }
        WebUtil.writeJson(response, Result.success());
    }
}
