package com.chinahitech.shop.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Brand {
    @TableId(type = IdType.AUTO)
    private Long sid;
    private Long radarnum;
    private Long datatime;
    private Float longitude;
    private Float latitude;
    private Float angle;
    private String pm25;
    private String pm10;
    private Float extinction;
    private Float depolarization;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getRadarnum() {
        return radarnum;
    }

    public void setRadarnum(Long radarnum) {
        this.radarnum = radarnum;
    }

    public Long getDatatime() {
        return datatime;
    }

    public void setDatatime(Long datatime) {
        this.datatime = datatime;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getAngle() {
        return angle;
    }

    public void setAngle(Float angle) {
        this.angle = angle;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public Float getExtinction() {
        return extinction;
    }

    public void setExtinction(Float extinction) {
        this.extinction = extinction;
    }

    public Float getDepolarization() {
        return depolarization;
    }

    public void setDepolarization(Float depolarization) {
        this.depolarization = depolarization;
    }
}
