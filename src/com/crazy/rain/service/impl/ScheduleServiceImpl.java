package com.crazy.rain.service.impl;

import com.crazy.rain.dao.ScheduleDao;
import com.crazy.rain.dao.impl.ScheduleDaoImpl;
import com.crazy.rain.pojo.Schedule;
import com.crazy.rain.service.ScheduleService;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName: ScheduleServiceImpl
 * @Description:
 * @author: CrazyRain
 * @date: 2024/1/21 19:15
 */

public class ScheduleServiceImpl implements ScheduleService {
    private ScheduleDao scheduleDao = new ScheduleDaoImpl();

    @Override
    public List<Object> scheduleList() {
        return scheduleDao.scheduleList();
    }

    @Override
    public boolean deleteSchedule(String id) {
        return scheduleDao.deleteSchedule(id);
    }

    @Override
    public Schedule queryById(String id) {
        return scheduleDao.queryById(id);
    }

    @Override
    public boolean updateSchedule(Schedule schedule) {
        schedule.setUpdateTime(LocalDateTime.now());
        return scheduleDao.updateSchedule(schedule);
    }
}
