/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.job;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class ScheduledTaskInfo
implements Serializable {
    private String key;
    private String taskName;
    private String taskRemark;
    private String type;
    private String beanClass;
    private String methodName;
    private String cron;
    private Long fixedDelayMs;
    private Long fixedRateMs;
    private Long initialDelayMs;
    private Date currentExecutionTime;
    private Date lastEndTime;
    private Long lastDurationMs;
    private Long runCount;
    private String lastError;
    private Date nextExecutionTime;

    @Generated
    public ScheduledTaskInfo() {
    }

    @Generated
    public String getKey() {
        return this.key;
    }

    @Generated
    public String getTaskName() {
        return this.taskName;
    }

    @Generated
    public String getTaskRemark() {
        return this.taskRemark;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public String getBeanClass() {
        return this.beanClass;
    }

    @Generated
    public String getMethodName() {
        return this.methodName;
    }

    @Generated
    public String getCron() {
        return this.cron;
    }

    @Generated
    public Long getFixedDelayMs() {
        return this.fixedDelayMs;
    }

    @Generated
    public Long getFixedRateMs() {
        return this.fixedRateMs;
    }

    @Generated
    public Long getInitialDelayMs() {
        return this.initialDelayMs;
    }

    @Generated
    public Date getCurrentExecutionTime() {
        return this.currentExecutionTime;
    }

    @Generated
    public Date getLastEndTime() {
        return this.lastEndTime;
    }

    @Generated
    public Long getLastDurationMs() {
        return this.lastDurationMs;
    }

    @Generated
    public Long getRunCount() {
        return this.runCount;
    }

    @Generated
    public String getLastError() {
        return this.lastError;
    }

    @Generated
    public Date getNextExecutionTime() {
        return this.nextExecutionTime;
    }

    @Generated
    public void setKey(String key) {
        this.key = key;
    }

    @Generated
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Generated
    public void setTaskRemark(String taskRemark) {
        this.taskRemark = taskRemark;
    }

    @Generated
    public void setType(String type) {
        this.type = type;
    }

    @Generated
    public void setBeanClass(String beanClass) {
        this.beanClass = beanClass;
    }

    @Generated
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Generated
    public void setCron(String cron) {
        this.cron = cron;
    }

    @Generated
    public void setFixedDelayMs(Long fixedDelayMs) {
        this.fixedDelayMs = fixedDelayMs;
    }

    @Generated
    public void setFixedRateMs(Long fixedRateMs) {
        this.fixedRateMs = fixedRateMs;
    }

    @Generated
    public void setInitialDelayMs(Long initialDelayMs) {
        this.initialDelayMs = initialDelayMs;
    }

    @Generated
    public void setCurrentExecutionTime(Date currentExecutionTime) {
        this.currentExecutionTime = currentExecutionTime;
    }

    @Generated
    public void setLastEndTime(Date lastEndTime) {
        this.lastEndTime = lastEndTime;
    }

    @Generated
    public void setLastDurationMs(Long lastDurationMs) {
        this.lastDurationMs = lastDurationMs;
    }

    @Generated
    public void setRunCount(Long runCount) {
        this.runCount = runCount;
    }

    @Generated
    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    @Generated
    public void setNextExecutionTime(Date nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ScheduledTaskInfo)) {
            return false;
        }
        ScheduledTaskInfo other = (ScheduledTaskInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$fixedDelayMs = this.getFixedDelayMs();
        Long other$fixedDelayMs = other.getFixedDelayMs();
        if (this$fixedDelayMs == null ? other$fixedDelayMs != null : !((Object)this$fixedDelayMs).equals(other$fixedDelayMs)) {
            return false;
        }
        Long this$fixedRateMs = this.getFixedRateMs();
        Long other$fixedRateMs = other.getFixedRateMs();
        if (this$fixedRateMs == null ? other$fixedRateMs != null : !((Object)this$fixedRateMs).equals(other$fixedRateMs)) {
            return false;
        }
        Long this$initialDelayMs = this.getInitialDelayMs();
        Long other$initialDelayMs = other.getInitialDelayMs();
        if (this$initialDelayMs == null ? other$initialDelayMs != null : !((Object)this$initialDelayMs).equals(other$initialDelayMs)) {
            return false;
        }
        Long this$lastDurationMs = this.getLastDurationMs();
        Long other$lastDurationMs = other.getLastDurationMs();
        if (this$lastDurationMs == null ? other$lastDurationMs != null : !((Object)this$lastDurationMs).equals(other$lastDurationMs)) {
            return false;
        }
        Long this$runCount = this.getRunCount();
        Long other$runCount = other.getRunCount();
        if (this$runCount == null ? other$runCount != null : !((Object)this$runCount).equals(other$runCount)) {
            return false;
        }
        String this$key = this.getKey();
        String other$key = other.getKey();
        if (this$key == null ? other$key != null : !this$key.equals(other$key)) {
            return false;
        }
        String this$taskName = this.getTaskName();
        String other$taskName = other.getTaskName();
        if (this$taskName == null ? other$taskName != null : !this$taskName.equals(other$taskName)) {
            return false;
        }
        String this$taskRemark = this.getTaskRemark();
        String other$taskRemark = other.getTaskRemark();
        if (this$taskRemark == null ? other$taskRemark != null : !this$taskRemark.equals(other$taskRemark)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        String this$beanClass = this.getBeanClass();
        String other$beanClass = other.getBeanClass();
        if (this$beanClass == null ? other$beanClass != null : !this$beanClass.equals(other$beanClass)) {
            return false;
        }
        String this$methodName = this.getMethodName();
        String other$methodName = other.getMethodName();
        if (this$methodName == null ? other$methodName != null : !this$methodName.equals(other$methodName)) {
            return false;
        }
        String this$cron = this.getCron();
        String other$cron = other.getCron();
        if (this$cron == null ? other$cron != null : !this$cron.equals(other$cron)) {
            return false;
        }
        Date this$currentExecutionTime = this.getCurrentExecutionTime();
        Date other$currentExecutionTime = other.getCurrentExecutionTime();
        if (this$currentExecutionTime == null ? other$currentExecutionTime != null : !((Object)this$currentExecutionTime).equals(other$currentExecutionTime)) {
            return false;
        }
        Date this$lastEndTime = this.getLastEndTime();
        Date other$lastEndTime = other.getLastEndTime();
        if (this$lastEndTime == null ? other$lastEndTime != null : !((Object)this$lastEndTime).equals(other$lastEndTime)) {
            return false;
        }
        String this$lastError = this.getLastError();
        String other$lastError = other.getLastError();
        if (this$lastError == null ? other$lastError != null : !this$lastError.equals(other$lastError)) {
            return false;
        }
        Date this$nextExecutionTime = this.getNextExecutionTime();
        Date other$nextExecutionTime = other.getNextExecutionTime();
        return !(this$nextExecutionTime == null ? other$nextExecutionTime != null : !((Object)this$nextExecutionTime).equals(other$nextExecutionTime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ScheduledTaskInfo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $fixedDelayMs = this.getFixedDelayMs();
        result = result * 59 + ($fixedDelayMs == null ? 43 : ((Object)$fixedDelayMs).hashCode());
        Long $fixedRateMs = this.getFixedRateMs();
        result = result * 59 + ($fixedRateMs == null ? 43 : ((Object)$fixedRateMs).hashCode());
        Long $initialDelayMs = this.getInitialDelayMs();
        result = result * 59 + ($initialDelayMs == null ? 43 : ((Object)$initialDelayMs).hashCode());
        Long $lastDurationMs = this.getLastDurationMs();
        result = result * 59 + ($lastDurationMs == null ? 43 : ((Object)$lastDurationMs).hashCode());
        Long $runCount = this.getRunCount();
        result = result * 59 + ($runCount == null ? 43 : ((Object)$runCount).hashCode());
        String $key = this.getKey();
        result = result * 59 + ($key == null ? 43 : $key.hashCode());
        String $taskName = this.getTaskName();
        result = result * 59 + ($taskName == null ? 43 : $taskName.hashCode());
        String $taskRemark = this.getTaskRemark();
        result = result * 59 + ($taskRemark == null ? 43 : $taskRemark.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $beanClass = this.getBeanClass();
        result = result * 59 + ($beanClass == null ? 43 : $beanClass.hashCode());
        String $methodName = this.getMethodName();
        result = result * 59 + ($methodName == null ? 43 : $methodName.hashCode());
        String $cron = this.getCron();
        result = result * 59 + ($cron == null ? 43 : $cron.hashCode());
        Date $currentExecutionTime = this.getCurrentExecutionTime();
        result = result * 59 + ($currentExecutionTime == null ? 43 : ((Object)$currentExecutionTime).hashCode());
        Date $lastEndTime = this.getLastEndTime();
        result = result * 59 + ($lastEndTime == null ? 43 : ((Object)$lastEndTime).hashCode());
        String $lastError = this.getLastError();
        result = result * 59 + ($lastError == null ? 43 : $lastError.hashCode());
        Date $nextExecutionTime = this.getNextExecutionTime();
        result = result * 59 + ($nextExecutionTime == null ? 43 : ((Object)$nextExecutionTime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ScheduledTaskInfo(key=" + this.getKey() + ", taskName=" + this.getTaskName() + ", taskRemark=" + this.getTaskRemark() + ", type=" + this.getType() + ", beanClass=" + this.getBeanClass() + ", methodName=" + this.getMethodName() + ", cron=" + this.getCron() + ", fixedDelayMs=" + this.getFixedDelayMs() + ", fixedRateMs=" + this.getFixedRateMs() + ", initialDelayMs=" + this.getInitialDelayMs() + ", currentExecutionTime=" + String.valueOf(this.getCurrentExecutionTime()) + ", lastEndTime=" + String.valueOf(this.getLastEndTime()) + ", lastDurationMs=" + this.getLastDurationMs() + ", runCount=" + this.getRunCount() + ", lastError=" + this.getLastError() + ", nextExecutionTime=" + String.valueOf(this.getNextExecutionTime()) + ")";
    }
}
