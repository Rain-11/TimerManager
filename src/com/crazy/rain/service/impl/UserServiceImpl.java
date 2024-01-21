package com.crazy.rain.service.impl;

import com.crazy.rain.dao.UserDao;
import com.crazy.rain.dao.impl.UserDaoImpl;
import com.crazy.rain.pojo.Schedule;
import com.crazy.rain.pojo.User;
import com.crazy.rain.service.UserService;

import java.time.LocalDateTime;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @author: CrazyRain
 * @date: 2024/1/21 16:30
 */

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public User login(String email, String password) {
        return userDao.queryByEmail(email, password);
    }

    @Override
    public boolean addSchedule(Schedule schedule) {
        schedule.setCreateTime(LocalDateTime.now());
        schedule.setUpdateTime(LocalDateTime.now());
        schedule.setId(String.valueOf(System.currentTimeMillis()));
        return userDao.addSchedule(schedule);
    }
}
