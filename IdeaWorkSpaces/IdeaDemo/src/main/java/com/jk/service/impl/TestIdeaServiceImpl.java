package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.model.Itree;
import com.jk.model.User;
import com.jk.service.TestIdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 罗小贩 on 2017/11/15.
 */
@Service
public class TestIdeaServiceImpl implements TestIdeaService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public java.util.List<User> userList() {
        List<User> list = userMapper.userList();
        return list;
    }

//    public List<Itree> showPage(){
//        List<Itree> tree = userMapper.showPage();
//        return tree;
//    }

    @Override
    public List<Itree> showPage() {
        List<Itree> tree = userMapper.showPage();
        return tree;
    }
}
