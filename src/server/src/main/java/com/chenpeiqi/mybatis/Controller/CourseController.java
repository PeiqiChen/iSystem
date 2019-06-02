package com.chenpeiqi.mybatis.Controller;

import com.chenpeiqi.mybatis.Bean.Course;
import com.chenpeiqi.mybatis.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService=new CourseService();
    @GetMapping("/courseOps")
    public List<Course> courseOps(){
        List<Course> allCourses=courseService.getAllCourse();
        return allCourses;
    }
    @GetMapping("/baseInfoCid/{cid}")
    public Course baseInfoCid(@PathVariable("cid") String cid){
        return courseService.getCourseByCid(cid);
    }
    @GetMapping("/baseInfoCname/{cname}")
    public Course baseInfoCname(@PathVariable("cname") String cname){
        return courseService.getCourseByCname(cname);
    }
    @PostMapping("/addCourse/{cid}/{cname}/{tname}/{credit}/{fit_grade}/{cancel_year}")
    public int addCourse(@PathVariable("cid") String cid,@PathVariable("cname")String cname,@PathVariable("tname")String tname,@PathVariable("credit")int credit,@PathVariable("fit_grade")int fit_grade,@PathVariable("cancel_year")int cancel_year){
        Course course=new Course();
        course.setCid(cid);
        course.setCname(cname);
        course.setTname(tname);
        course.setCredit(credit);
        course.setFit_grade(fit_grade);
        course.setCancel_year(cancel_year);
        return courseService.addCourse(course);
    }
    @PostMapping("/updateCourse/{cid}/{cname}/{tname}/{credit}/{fit_grade}/{cancel_year}")
    public int updateCourse(@PathVariable("cid")String cid,@PathVariable("cname")String cname,@PathVariable("tname")String tname,@PathVariable("credit")int credit,@PathVariable("fit_grade")int fit_grade,@PathVariable("cancel_year")int cancel_year){
        Course course=new Course();
        course.setCid(cid);
        course.setCname(cname);
        course.setTname(tname);
        course.setCredit(credit);
        course.setFit_grade(fit_grade);
        course.setCancel_year(cancel_year);
        return courseService.updateCourseByCid(course);
    }
    @PostMapping("/deleteCourse/{cid}")
    public int deleteCourse(@PathVariable("cid") String cid){
        return courseService.deleteCourseByCid(cid);
    }

}

