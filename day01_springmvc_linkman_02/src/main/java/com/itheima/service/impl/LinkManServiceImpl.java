package com.itheima.service.impl;

import com.itheima.dao.LinkManDao;
import com.itheima.pojo.LinkMan;
import com.itheima.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LinkManServiceImpl implements LinkManService {
    @Autowired
    private LinkManDao linkManDao;
    @Override
    public List<LinkMan> findAll() {
        List<LinkMan> linkManList = linkManDao.findAll();

        return linkManList;
    }
}
