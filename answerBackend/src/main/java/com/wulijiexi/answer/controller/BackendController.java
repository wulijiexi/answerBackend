package com.wulijiexi.answer.controller;

import com.wulijiexi.answer.dao.ArticleDao;
import com.wulijiexi.answer.dao.ArticleTypeDao;
import com.wulijiexi.answer.model.Article;
import com.wulijiexi.answer.model.ArticleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by fujiaxiaoshao on 2016/11/12.
 */
@Controller
@RequestMapping("/backend")
public class BackendController {
    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private ArticleTypeDao articleTypeDao;

    //后台首页
    @RequestMapping(value="/articles",method= RequestMethod.GET)
    public  String articles(){
        return "backend/articles.jsp";
    }

    @RequestMapping(value="/articleContent",method= RequestMethod.GET)
    public  String articleContent(){
        return "backend/articleContent.jsp";
    }
    //加载图文类型
    @RequestMapping(value="/loadarticleTypes",method= RequestMethod.GET)
    public @ResponseBody ArrayList<ArticleType> loadarticleTypes(){
        return articleTypeDao.getArticleTypes();
    }


    //分页加载图文
    @RequestMapping(value="/loadarticles",method = RequestMethod.GET)
    public @ResponseBody ArrayList<Article> loadarticles(@RequestParam("page") int page, @RequestParam("articleType") String  articleType) {
        return articleDao.getArticles(page,articleType);
    }



}
