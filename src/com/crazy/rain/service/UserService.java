package com.crazy.rain.service;

import com.crazy.rain.pojo.Schedule;
import com.crazy.rain.pojo.User;

public interface UserService {
    User login(String email, String password);

    boolean addSchedule(Schedule schedule);
}
