package cn.harryai.testfindbugplugin.controller;

import cn.harryai.testfindbugplugin.service.TestFindbugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFindbugController {
    @Autowired
    private TestFindbugService testFindbugService;

    @GetMapping("get")
    public String print(String data){
        testFindbugService.print(data);
        return data;
    }

}
