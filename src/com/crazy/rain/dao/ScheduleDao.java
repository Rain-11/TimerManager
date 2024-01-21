package com.crazy.rain.dao;

import com.crazy.rain.pojo.Schedule;

import java.util.List;

public interface ScheduleDao {
    List<Object> scheduleList();

    boolean deleteSchedule(String id);

    Schedule queryById(String id);

    boolean updateSchedule(Schedule schedule);

}
