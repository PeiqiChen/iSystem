package com.chenpeiqi.mybatis.Mapper;

import org.apache.ibatis.annotations.Mapper;
import com.chenpeiqi.mybatis.Bean.Information;
import java.util.List;

@Mapper
public interface InformationMapper {
    List<Information> getInformationByStudent_id(String student_id);
    List<Information> getInformationByCourse_id(String course_id);
    List<Information> getInformationByStudent_name(String student_name);
    List<Information> getInformationByCourse_name(String course_name);

    Information getInformationByStudent_idAndCourse_id(String student_id,String course_id);
    Information getInformationByStudent_nameAndCourse_id(String student_name,String course_id);
    Information getInformationByStudent_idAndCourse_name(String student_id,String course_name);
    Information getInformationByStudent_nameAndCourse_name(String student_name,String course_name);

    int updateInformationByStudent_idAndCourse_id(Information information);
    int addInformation(Information information);
    int deleteInformationByStudent_idAndCourse_id(String student_id,String course_id);
    List<Information> getAllInformation();


    int getAverageScoreByStudent_name(String student_name);
    int getAverageScoreByEntry_yearAndClazz(int entry_year,int clazz);
    int getNumOfStudentbyCourse_nameandScoreRange(String course_name, int low,int high);
    int getAverageScoreByCourse_name(String course_name);
}
