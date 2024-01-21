package com.crazy.rain.dao.impl;

import com.crazy.rain.dao.BaseDao;
import com.crazy.rain.dao.ScheduleDao;
import com.crazy.rain.pojo.Schedule;

import java.util.List;

/**
 * @ClassName: ScheduleDaoImpl
 * @Description:
 * @author: CrazyRain
 * @date: 2024/1/21 19:15
 */

public class ScheduleDaoImpl extends BaseDao implements ScheduleDao {
    @Override
    public List<Object> scheduleList() {
        String sql = "select id,userId,schedule_name as scheduleName,schedule_time as scheduleTime,remarks from Schedule";
        return baseQuery(Schedule.class, sql);
    }

    @Override
    public boolean deleteSchedule(String id) {
        String sql = "delete from Schedule where id=?";
        int i = baseUpdate(sql, id);
        return i == 1;
    }

    @Override
    public Schedule queryById(String id) {
        String sql = "select id,userId,schedule_name as scheduleName,schedule_time as scheduleTime,remarks from Schedule where id=?";
        return (Schedule) baseQuery(Schedule.class, sql, id).get(0);
    }

    @Override
    public boolean updateSchedule(Schedule schedule) {
        String sql = "update Schedule set schedule_name=?,schedule_time=?,remarks=?,update_time=? where id=?";
        return baseUpdate(sql, schedule.getScheduleName(), schedule.getScheduleTime(),
                schedule.getRemarks(), schedule.getUpdateTime(), schedule.getId()) == 1;
    }
}
