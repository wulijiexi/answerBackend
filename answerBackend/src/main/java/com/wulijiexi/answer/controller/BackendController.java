package com.wulijiexi.answer.controller;

import com.wulijiexi.answer.dao.ArticleDao;
import com.wulijiexi.answer.model.Article;
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

    //后台首页
    @RequestMapping(value="/articles",method= RequestMethod.GET)
    public  String articles(){
        return "backend/articles.jsp";
    }

    //分页加载图文
    @RequestMapping(value="/loadarticles",method = RequestMethod.GET)
    public @ResponseBody ArrayList<Article> backendUpdateArticleById(@RequestParam("page") int page, @RequestParam("articleType") String  articleType) {
        return articleDao.getArticles(page,articleType);
    }

}
