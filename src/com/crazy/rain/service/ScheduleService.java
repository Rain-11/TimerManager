package com.crazy.rain.service;

import com.crazy.rain.pojo.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Object> scheduleList();

    boolean deleteSchedule(String id);

    Schedule queryById(String id);

    boolean updateSchedule(Schedule schedule);
}
