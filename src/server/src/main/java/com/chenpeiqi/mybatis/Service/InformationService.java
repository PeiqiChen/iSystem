package com.chenpeiqi.mybatis.Service;

import com.chenpeiqi.mybatis.Bean.Information;
import com.chenpeiqi.mybatis.Mapper.InformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {
    @Autowired
    InformationMapper informationMapper;

    public List<Information> getInformationByStudent_id(String student_id){ return informationMapper.getInformationByStudent_id(student_id);}
    public List<Information> getInformationByCourse_id(String course_id){ return informationMapper.getInformationByCourse_id(course_id);}
    public List<Information> getInformationByStudent_name(String student_name){ return informationMapper.getInformationByStudent_name(student_name);}
    public List<Information> getInformationByCourse_name(String course_name){ return informationMapper.getInformationByCourse_name(course_name);}

    public Information getInformationByStudent_idAndCourse_id(String student_id,String course_id){ return informationMapper.getInformationByStudent_idAndCourse_id(student_id, course_id);}
    public Information getInformationByStudent_nameAndCourse_id(String student_name,String course_id){ return informationMapper.getInformationByStudent_nameAndCourse_id(student_name, course_id);}
    public Information getInformationByStudent_idAndCourse_name(String student_id,String course_name){ return informationMapper.getInformationByStudent_idAndCourse_name(student_id, course_name);}
    public Information getInformationByStudent_nameAndCourse_name(String student_name,String course_name){ return informationMapper.getInformationByStudent_nameAndCourse_name(student_name, course_name);}

    public int updateInformationByStudent_idAndCourse_id(Information information){return informationMapper.updateInformationByStudent_idAndCourse_id(information);}
    public int addInformation(Information information){ return informationMapper.addInformation(information);}
    public int deleteInformationByStudent_idAndCourse_id(String student_id,String course_id){return informationMapper.deleteInformationByStudent_idAndCourse_id(student_id, course_id);}

    public List<Information> getAllInformation(){ return informationMapper.getAllInformation();}

    public int getAverageScoreByStudent_name(String student_name){ return informationMapper.getAverageScoreByStudent_name(student_name);}
    public int getAverageScoreByEntry_yearAndClazz(int entry_year,int clazz){ return informationMapper.getAverageScoreByEntry_yearAndClazz(entry_year,clazz); }
    public int getNumOfStudentbyCourse_nameandScoreRange(String course_name, int low,int high){ return informationMapper.getNumOfStudentbyCourse_nameandScoreRange(course_name, low, high);}
    public int getAverageScoreByCourse_name(String course_name){ return informationMapper.getAverageScoreByCourse_name(course_name);}
}
