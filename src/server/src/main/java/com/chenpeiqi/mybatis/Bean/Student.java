package com.chenpeiqi.mybatis.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("sid")
    private String sid;
    @JsonProperty("sname")
    private String sname;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("entry_age")
    private int entry_age;
    @JsonProperty("entry_year")
    private int entry_year;
    @JsonProperty("clazz")
    private int clazz;

    public void setSid(String sid){ this.sid=sid; }
    public void setSname(String sname) { this.sname = sname; }
    public void setSex(String sex) { this.sex = sex; }
    public void setEntry_age(int entry_age) { this.entry_age = entry_age; }
    public void setEntry_year(int entry_year) { this.entry_year = entry_year; }
    public void setClazz(int clazz) { this.clazz = clazz; }

    public String getSid(){ return this.sid; }
    public String getSname() { return this.sname; }
    public String getSex() { return this.sex = sex; }
    public int setEntry_age() { return this.entry_age; }
    public int setEntry_year() { return this.entry_year; }
    public int setClazz() { return this.clazz; }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + this.sid +
                ", sname='" + this.sname + '\'' +
                ", sex='" + this.sex + '\'' +
                ", entry_age='" + this.entry_age + '\'' +
                ", entry_year='" + this.entry_year + '\'' +
                ", clazz='" + this.clazz + '\'' +
                '}';
    }
}
