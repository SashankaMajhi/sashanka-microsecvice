package com.example.school.Controller;


import com.example.school.Entity.School;
import com.example.school.Repository.SchoolRepository;
import com.example.school.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
@CrossOrigin("*")
public class SchoolController {

    @Autowired
    private  SchoolService schoolService;

    @PostMapping("/add")
    public School addSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }
    @GetMapping
    public List<School> fetchSchools(){
        return  schoolService.fetchSchools();
    }
    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable int id){
        return schoolService.fetchSchoolById(id);
    }
}
