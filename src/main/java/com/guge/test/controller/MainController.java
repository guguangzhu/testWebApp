package com.guge.test.controller;

import com.guge.test.model.Students;
import com.guge.test.service.ListObject;
import com.guge.test.service.student.StudentService;
import com.guge.test.service.student.impl.StudentServiceImpl;
import com.guge.test.utils.JackJsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Guge on 2017/4/7.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "home";
    }

    @RequestMapping(value = "student",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public @ResponseBody String getStudentList(HttpServletRequest request, HttpServletResponse response){
        StudentService service=new StudentServiceImpl();
        List<Students> list=service.getAllStudents();
        ListObject object=new ListObject();
        object.setItems(list);
        object.setCode("200");
        object.setMsg("OK");
        return JackJsonUtils.toJson(object);
    }
}