package com.crazy.rain.pojo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName: Schedule
 * @Description: Schedule
 * @author: CrazyRain
 * @date: 2024/1/21 15:21
 */

public class Schedule implements Serializable {
    private String id;
    private String userId;
    private String scheduleName;
    private String scheduleTime;
    private String remarks;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return "Schedule{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", scheduleName='" + scheduleName + '\'' +
                ", scheduleTime='" + scheduleTime + '\'' +
                ", remarks='" + remarks + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Schedule() {
    }

    public Schedule(String id, String userId, String scheduleName, String scheduleTime, String remarks, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.userId = userId;
        this.scheduleName = scheduleName;
        this.scheduleTime = scheduleTime;
        this.remarks = remarks;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
