package com.crazy.rain.dao.impl;

import com.crazy.rain.dao.BaseDao;
import com.crazy.rain.dao.UserDao;
import com.crazy.rain.pojo.Schedule;
import com.crazy.rain.pojo.User;

import java.util.List;

/**
 * @ClassName: UserDaoImpl
 * @Description:
 * @author: CrazyRain
 * @date: 2024/1/21 17:12
 */

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryByEmail(String email, String password) {
        String sql = "select * from user where email=? and password=?";
        List<User> users = baseQuery(User.class, sql, email, password);
        return users.get(0);
    }

    @Override
    public boolean addSchedule(Schedule schedule) {
        String sql = "insert into Schedule values(?,?,?,?,?,?,?)";
        return baseUpdate(sql, schedule.getId(), schedule.getUserId(), schedule.getScheduleName(), schedule.getScheduleTime(),
                schedule.getRemarks(), schedule.getCreateTime(), schedule.getUpdateTime()) >= 0;
    }
}
