package com.jk.controller;

import com.jk.model.Itree;
import com.jk.model.JsonUtils;
import com.jk.model.User;
import java.util.List;
import com.jk.service.TestIdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 罗小贩 on 2017/11/15.
 */
@RestController
public class TestIdeaController {

    @Autowired
    private TestIdeaService testIdeaService;

    @RequestMapping("/userList")
    public List<User> userList(){
        List<User> list = testIdeaService.userList();
        return list;
    }

    @RequestMapping("/showForPage")
    public String showForPage(String callback){
        List<Itree> tree = testIdeaService.showPage();
        String treeJson = JsonUtils.toJson(tree);
        return treeJson;
    }
}
