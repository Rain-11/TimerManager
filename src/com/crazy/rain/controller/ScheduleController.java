package com.crazy.rain.controller;

import com.crazy.rain.common.Result;
import com.crazy.rain.pojo.Schedule;
import com.crazy.rain.service.ScheduleService;
import com.crazy.rain.service.impl.ScheduleServiceImpl;
import com.crazy.rain.util.WebUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.interfaces.RSAKey;
import java.util.List;

/**
 * @ClassName: ScheduleController
 * @Description: Schedule控制器
 * @author: CrazyRain
 * @date: 2024/1/21 19:13
 */
@WebServlet("/schedule/*")
public class ScheduleController extends BaseController {
    private ScheduleService scheduleService = new ScheduleServiceImpl();

    public void scheduleList(HttpServletRequest request, HttpServletResponse response) {
        List<Object> objects = scheduleService.scheduleList();
        if (objects.isEmpty()) {
            WebUtil.writeJson(response, Result.fail());
        }
        WebUtil.writeJson(response, Result.success(objects));
    }

    public void deleteSchedule(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        boolean flag = scheduleService.deleteSchedule(id);
        if (!flag) {
            WebUtil.writeJson(response, Result.fail());
        }
        WebUtil.writeJson(response, Result.success());
    }

    public void queryById(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Schedule schedule = scheduleService.queryById(id);
        if (schedule == null) {
            WebUtil.writeJson(response, Result.fail());
        }
        WebUtil.writeJson(response, Result.success(schedule));
    }

    public void updateSchedule(HttpServletRequest request, HttpServletResponse response){
        boolean flag = scheduleService.updateSchedule(WebUtil.readJson(request, Schedule.class));
        if (!flag) {
            WebUtil.writeJson(response, Result.fail());
        }
        WebUtil.writeJson(response, Result.success());
    }
}
