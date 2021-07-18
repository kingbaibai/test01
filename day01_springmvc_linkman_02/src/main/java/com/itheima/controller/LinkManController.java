package com.itheima.controller;

import com.itheima.entry.Result;
import com.itheima.pojo.LinkMan;
import com.itheima.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/linkman")
public class LinkManController {
    @Autowired
    private LinkManService linkManService;
    @RequestMapping("/findAll")
    public Result findAll(){
        List<LinkMan> all = linkManService.findAll();
        return new Result(true,"查询注册",all);
    }
}
