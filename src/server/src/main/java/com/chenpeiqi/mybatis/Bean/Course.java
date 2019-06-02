package com.chenpeiqi.mybatis.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
    @JsonProperty("cid")
    private String cid;
    @JsonProperty("cname")
    private String cname;
    @JsonProperty("tname")
    private String tname;
    @JsonProperty("credit")
    private int credit;
    @JsonProperty("fit_grade")
    private int fit_grade;
    @JsonProperty("cancel_year")
    private int cancel_year;

    public void setCid(String cid) { this.cid = cid; }
    public void setCname(String cname) { this.cname = cname; }
    public void setTname(String tname) { this.tname = tname; }
    public void setCredit(int credit) { this.credit = credit; }
    public void setFit_grade(int fit_grade) { this.fit_grade = fit_grade; }
    public void setCancel_year(int cancel_year) { this.cancel_year = cancel_year; }

    public String getCid() { return cid; }
    public String getCname() { return cname; }
    public String getTname() { return tname; }
    public int getCredit() { return credit; }
    public int getFit_grade() { return fit_grade; }
    public int getCancel_year() { return cancel_year; }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + this.cid +
                ", cname='" + this.cname + '\'' +
                ", tname='" + this.tname + '\'' +
                ", credit='" + this.credit + '\'' +
                ", fit_grade='" + this.fit_grade + '\'' +
                ", cancel_year='" + this.cancel_year + '\'' +
                '}';
    }
}
