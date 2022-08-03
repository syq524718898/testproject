package com.sunyuqi.controller;

import com.sunyuqi.dao.StudentDao;
import com.sunyuqi.pojo.Result;
import com.sunyuqi.pojo.Student;
import com.sunyuqi.service.StudentService;
import com.sunyuqi.uitil.FastSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private StudentService studentService;

    @GetMapping("findall")
    public List<Student> findall()
    {
        return studentDao.selectAll();
    }

    @GetMapping("findone/{id}")
    public Student findone(@PathVariable("id") Integer id)
    {
        return studentDao.selectByPrimaryKey(id);
    }
    @GetMapping("findone")
    public Student finonebyid(@RequestParam("id") Integer id)
    {
        return studentDao.selectByPrimaryKey(id);
    }


    @PostMapping(value = "update")
    public Student updateTest(@RequestBody Student student)
    {
        System.out.println(student);
        studentService.updateStudent(student);
        return student;
    }

    @PostMapping("test")
    public Result test(String ids)
    {
        String[] split = ids.split(",");
        int[] sort_ids = new int[split.length];
        for(int i=0;i<split.length;i++)
        {
            sort_ids[i] = Integer.valueOf(split[i]);
        }
        int left = 0;
        int right = split.length-1;
        FastSort.fastsort(sort_ids,left,right);
        Result result = new Result();
        result.setList(sort_ids);
        return result;
    }

    @PostMapping("testpost")
    public Student testpost(Integer id,String name)
    {
        System.out.println(id);
        System.out.println(name);
        return new Student();
    }

}
