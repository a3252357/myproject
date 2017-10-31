package com.hi;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by wan on 2017/1/17.
 */
@Controller
@RequestMapping("/")
@EnableAutoConfiguration
public class HibernateController {

    @Autowired
    UserMapper userMapperTest;


   /* @RequestMapping("getUserById")
    public String getUserById(Long id, Model model ) {
        User u = userRepository.findOne(id);
        System.out.println("userRepository: " + userRepository);
        System.out.println("id: " + id);
        model.addAttribute("aa",u);
        return "user";
    }*/
    @RequestMapping("findUserByName1")
    public String findUserByName1(String name, Model model) {
        //分页处理，显示第一页的2条数据
        PageHelper.startPage(1, 1);
        ArrayList<User> u = userMapperTest.findUserByName(name);
        // 取商品列表
        for(User item : u) {
            System.out.println(item.getUser_name());
        }
        // 取分页信息
        PageInfo<User> pageInfo = new PageInfo<User>(u);
        long total = pageInfo.getTotal(); //获取总记录数
        System.out.println(total);
        System.out.println("共有商品信息：" + total);
        System.out.println("userMapper: " + userMapperTest);
        System.out.println("name: " + name);
        model.addAttribute("aa",u);
        return "/jsp/users.jsp";
    }


    @RequestMapping("saveUser")
    @ResponseBody
    public int saveUser(String name) {
        User u = new User();
        u.setUser_name("wan");
        u.setAddress("江西省上饶市鄱阳县");
        u.setBirthDay(new Date());
        u.setSex("男");
        int a=userMapperTest.save(name);
        return a;
    }
/*
    @RequestMapping("findUserByName")
    public String  findUserByName(String name,Model model ) {
        ArrayList<User> u =userRepository.findUserByName(name);
        System.out.println("userRepository: " + userRepository);
        System.out.println("id: " + name);
        model.addAttribute("aa",u);
        return "/jsp/user";

    }
*/
public static void main(String[] args) throws Exception {
    SpringApplication.run(HibernateController.class, args);
}
}
