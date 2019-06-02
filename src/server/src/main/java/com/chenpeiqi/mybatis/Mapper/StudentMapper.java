package com.chenpeiqi.mybatis.Mapper;

import org.apache.ibatis.annotations.Mapper;
import com.chenpeiqi.mybatis.Bean.Student;
import java.util.List;

@Mapper
public interface StudentMapper {
    Student getStudentBySid(String sid);
    Student getStudentBySname(String sname);
    int updateStudentBySid(Student student);
    int addStudent(Student student);
    int deleteStudentBySid(String sid);
    List<Student> getAllStudent();
}
