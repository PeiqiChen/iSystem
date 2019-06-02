package com.chenpeiqi.mybatis.Controller;

import com.chenpeiqi.mybatis.Bean.Student;
import com.chenpeiqi.mybatis.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService=new StudentService();
    @GetMapping("/studentOps")
    public List<Student> studentOps(){
        List<Student> allStudents=studentService.getAllStudent();
        return allStudents;
    }
    @GetMapping("/baseInfoSid/{sid}")
    public Student baseInfoSid(@PathVariable("sid") String sid){
        return studentService.getStudentBySid(sid);
    }
    @GetMapping("/baseInfoSname/{sname}")
    public Student baseInfoSname(@PathVariable("sname") String sname){
        return studentService.getStudentBySname(sname);
    }
    @PostMapping("/addStudent/{sid}/{sname}/{sex}/{entry_age}/{entry_year}/{clazz}")
    public int addStudent(@PathVariable("sid")String sid,@PathVariable("sname")String sname,@PathVariable("sex")String sex,@PathVariable("entry_age")int entry_age,@PathVariable("entry_year")int entry_year,@PathVariable("clazz")int clazz){
        Student student=new Student();
        student.setSid(sid);
        student.setSname(sname);
        student.setSex(sex);
        student.setEntry_age(entry_age);
        student.setEntry_year(entry_year);
        student.setClazz(clazz);
        return studentService.addStudent(student);
    }
    @PostMapping("/updateStudent/{sid}/{sname}/{sex}/{entry_age}/{entry_year}/{clazz}")
    public int updateStudent(@PathVariable("sid")String sid,@PathVariable("sname")String sname,@PathVariable("sex")String sex,@PathVariable("entry_age")int entry_age,@PathVariable("entry_year")int entry_year,@PathVariable("clazz")int clazz){
        Student student=new Student();
        student.setSid(sid);
        student.setSname(sname);
        student.setSex(sex);
        student.setEntry_age(entry_age);
        student.setEntry_year(entry_year);
        student.setClazz(clazz);
        return studentService.updateStudentBySid(student);
    }
    @PostMapping("/deleteStudent/{sid}")
    public int deleteStudent(@PathVariable("sid") String sid){
        return studentService.deleteStudentBySid(sid);
    }

}