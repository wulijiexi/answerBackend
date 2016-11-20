package com.wulijiexi.answer.controller;

import com.wulijiexi.answer.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by fujiaxiaoshao on 2016/11/12.
 */
@Controller
@RequestMapping("/login")
public class AuthenticationController {
    @Autowired
    private UserDao userDao;

    //武理解析答案后台的登录首页
    @RequestMapping(value="/index",method=RequestMethod.GET)
    public  String getCampusName(){

        return "login/index.jsp";

    }


    //用户登录
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String adminLogin(@RequestParam("account") String  username, @RequestParam("password") String password, HttpSession session) throws NoSuchAlgorithmException, InvalidKeySpecException {

        if(userDao.userLogin(username,password)){
            session.setAttribute("authentication","pass");
            return "redirect:/backend/articles";
        }else
            return "redirect:/login/index";
    }

}
