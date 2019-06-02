package com.chenpeiqi.mybatis.Mapper;

import org.apache.ibatis.annotations.Mapper;
import com.chenpeiqi.mybatis.Bean.Course;
import java.util.List;

@Mapper
public interface CourseMapper {
    Course getCourseByCid(String cid);
    // 根据课程名称查询课程的基本信息
    Course getCourseByCname(String cname);
    // 修改课程中的所有信息
    int updateCourseByCid(Course course);
    int addCourse(Course course);
    int deleteCourseByCid(String cid);
    List<Course> getAllCourse();
}
