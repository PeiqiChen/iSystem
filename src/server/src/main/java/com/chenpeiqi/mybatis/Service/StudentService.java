package com.chenpeiqi.mybatis.Service;

import com.chenpeiqi.mybatis.Bean.Student;
import com.chenpeiqi.mybatis.Mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student getStudentBySid(String sid){ return studentMapper.getStudentBySid(sid);}
    public Student getStudentBySname(String sname){ return studentMapper.getStudentBySname(sname);}
    public int updateStudentBySid(Student student){return studentMapper.updateStudentBySid(student);}
    public int addStudent(Student student){ return studentMapper.addStudent(student);}
    public int deleteStudentBySid(String sid){ return studentMapper.deleteStudentBySid(sid);}
    public List<Student> getAllStudent(){ return studentMapper.getAllStudent();}
}
