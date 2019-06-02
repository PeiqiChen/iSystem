package com.chenpeiqi.mybatis.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Information {
    @JsonProperty("student_id")
    private String student_id;
    @JsonProperty("course_id")
    private String course_id;
    @JsonProperty("involved_year")
    private int involved_year;
    @JsonProperty("score")
    private int score;

    public void setStudent_id(String student_id) { this.student_id = student_id; }
    public void setCourse_id(String course_id) { this.course_id = course_id; }
    public void setInvolved_year(int involved_year) { this.involved_year = involved_year; }
    public void setScore(int score) { this.score = score; }

    public String getCourse_id() { return course_id; }
    public String getStudent_id() { return student_id; }
    public int getInvolved_year() { return involved_year; }
    public int getScore() { return score; }

    @Override
    public String toString() {
        return "Information{" +
                "student_id=" + this.student_id+
                ", course_id='" + this.course_id + '\'' +
                ", involved_year='" + this.involved_year + '\'' +
                ", score='" + this.score + '\'' +
                '}';
    }
}
