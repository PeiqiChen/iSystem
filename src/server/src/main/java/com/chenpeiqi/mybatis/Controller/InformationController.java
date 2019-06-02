package com.chenpeiqi.mybatis.Controller;

import com.chenpeiqi.mybatis.Bean.Information;
import com.chenpeiqi.mybatis.Service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class InformationController {
    @Autowired
    InformationService informationService=new InformationService();
    @GetMapping("/informationOps")
    public List<Information> informationOps(){
        List<Information> allInformations=informationService.getAllInformation();
        return allInformations;
    }

    @GetMapping("/infoSidCid/{sid}/{cid}")
    public Information infoSidCid(@PathVariable("sid") String sid,@PathVariable("cid") String cid){
        return informationService.getInformationByStudent_idAndCourse_id(sid,cid);
    }
    @GetMapping("/infoSnameCid/{sname}/{cid}")
    public Information infoSnameCid(@PathVariable("sname") String sname,@PathVariable("cid") String cid){
        return informationService.getInformationByStudent_nameAndCourse_id(sname,cid);
    }
    @GetMapping("/infoSidCname/{sid}/{cname}")
    public Information infoSidCname(@PathVariable("sid") String sid,@PathVariable("cname") String cname){
        return informationService.getInformationByStudent_idAndCourse_name(sid,cname);
    }
    @GetMapping("/infoSnameCname/{sname}/{cname}")
    public Information infoSnameCname(@PathVariable("sname") String sname,@PathVariable("cname") String cname){
        return informationService.getInformationByStudent_nameAndCourse_name(sname,cname);
    }
    @GetMapping("/infoSid/{sid}")
    public List<Information> infoSid(@PathVariable("sid") String sid){
        return informationService.getInformationByStudent_id(sid);
    }
    @GetMapping("/infoCid/{cid}")
    public List<Information> infoCid(@PathVariable("cid") String cid){
        return informationService.getInformationByCourse_id(cid);
    }
    @GetMapping("/infoSname/{sname}")
    public List<Information> infoSname(@PathVariable("sname") String sname){
        return informationService.getInformationByStudent_name(sname);
    }

    @GetMapping("/infoCname/{cname}")
    public List<Information> infoCname(@PathVariable("cname") String cname){
        return informationService.getInformationByCourse_name(cname);
    }
    @PostMapping("addInformation/{student_id}/{course_id}/{involved_year}/{score}")
    public int addInformation(@PathVariable("student_id")String student_id,@PathVariable("course_id")String course_id,@PathVariable("involved_year") int involved_year,@PathVariable("score")int score){
        Information information=new Information();
        information.setStudent_id(student_id);
        information.setCourse_id(course_id);
        information.setInvolved_year(involved_year);
        information.setScore(score);
        return informationService.addInformation(information);
    }
    @PostMapping("updateInformation/{student_id}/{course_id}/{involved_year}/{score}")
    public int updateInformation(@PathVariable("student_id")String student_id,@PathVariable("course_id")String course_id,@PathVariable("involved_year") int involved_year,@PathVariable("score")int score){
        Information information=new Information();
        information.setStudent_id(student_id);
        information.setCourse_id(course_id);
        information.setInvolved_year(involved_year);
        information.setScore(score);
        return informationService.updateInformationByStudent_idAndCourse_id(information);
    }
    @PostMapping("deleteInformation/{student_id}/{course_id}")
    public int deleteInformation(@PathVariable("student_id")String student_id,@PathVariable("course_id")String course_id){
        return informationService.deleteInformationByStudent_idAndCourse_id(student_id,course_id);
    }
    @GetMapping("avgScoreSname/{sname}")
    public int avgScoreSname(@PathVariable("sname")String sname){
        return informationService.getAverageScoreByStudent_name(sname);
    }
    @GetMapping("avgScoreCname/{cname}")
    public int avgScoreCname(@PathVariable("cname")String cname){
        return informationService.getAverageScoreByCourse_name(cname);
    }
    @GetMapping("avgScoreEyClazz/{entry_year}/{clazz}")
    public int avgScoreEyClazz(@PathVariable("entry_year") int entry_year,@PathVariable("clazz")int clazz){
        return informationService.getAverageScoreByEntry_yearAndClazz(entry_year,clazz);
    }
    @GetMapping("distrScore/{cname}/{low}/{high}")
    public int distrScore(@PathVariable("cname")String cname,@PathVariable("low")int low,@PathVariable("high")int high){
        return informationService.getNumOfStudentbyCourse_nameandScoreRange(cname, low, high);
    }
}