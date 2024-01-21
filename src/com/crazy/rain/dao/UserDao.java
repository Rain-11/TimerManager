package com.crazy.rain.dao;

import com.crazy.rain.pojo.Schedule;
import com.crazy.rain.pojo.User;

public interface UserDao {
    User queryByEmail(String email, String password);

    boolean addSchedule(Schedule schedule);
}
