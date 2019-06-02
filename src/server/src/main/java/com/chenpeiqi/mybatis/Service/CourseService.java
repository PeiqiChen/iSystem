package com.chenpeiqi.mybatis.Service;

import com.chenpeiqi.mybatis.Bean.Course;
import com.chenpeiqi.mybatis.Mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseMapper courseMapper;

    public Course getCourseByCid(String cid){ return courseMapper.getCourseByCid(cid);}
    public Course getCourseByCname(String cname){ return courseMapper.getCourseByCname(cname);}
    public int updateCourseByCid(Course course){ return courseMapper.updateCourseByCid(course);}
    public int addCourse(Course course){ return courseMapper.addCourse(course);}
    public int deleteCourseByCid(String cid){ return courseMapper.deleteCourseByCid(cid);}
    public List<Course> getAllCourse(){ return courseMapper.getAllCourse();}
}
