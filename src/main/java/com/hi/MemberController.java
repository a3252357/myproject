package com.hi;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 * Created by wan on 2017/1/17.
 */
@Controller
@RequestMapping("/memberdata")
@EnableAutoConfiguration
public class MemberController {

    @Autowired
    MemberDao memberDao;


    @RequestMapping("")
    public String MemberMain() {
        return "memberdata/jsp/member.jsp";
    }

    @RequestMapping("memberAdd")
    public String MemberAdd() {
        return "memberdata/jsp/add.jsp";
    }

    @RequestMapping("findUserByName")
    public String findUserByName(String name,int pageNum,int pageSize, Model model) {
        //分页处理，显示第一页的2条数据
        if(pageNum==0)pageNum=1;
        if(pageSize==0)pageSize=10;
        PageHelper.startPage(pageNum, pageSize);
        ArrayList<Member> u = memberDao.findUserAll();
        // 取商品列表
        for(Member item : u) {
            System.out.println("id:"+item.getId());
        }
        // 取分页信息
        PageInfo<Member> pageInfo = new PageInfo<Member>(u);
        long total = pageInfo.getTotal(); //获取总记录数\
        System.out.println(total);
        System.out.println("共有用户信息：" + pageInfo.toString());
        System.out.println("userMapper: " + memberDao);
        System.out.println("name: " + name);
        model.addAttribute("aa",u);
        return "memberdata/jsp/content.jsp";
    }


    @RequestMapping("saveUser")
    @ResponseBody
    public Member saveUser(Model model,String name,String brithday,String sex,String email,String password,String phonenumber,String qqno) {
        Member u = new Member();
        model.asMap();
        u.setMembername(name);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟
        Date brithday1=new Date();
        try {
            brithday1=sdf.parse(brithday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        u.setMemberbrithday(brithday1);
        u.setSex(sex);
        u.setMemmberno("TA"+Util.get8UUID());
        u.setPhonenumber(phonenumber);
        u.setQqno(qqno);
        u.setPassword(password);
        u.setCreatedate(new Date());
        u.setEmail(email);
        Long a=memberDao.save(u);
        System.out.println(u.getId());
        return u;
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
    SpringApplication.run(MemberController.class, args);
}
}
