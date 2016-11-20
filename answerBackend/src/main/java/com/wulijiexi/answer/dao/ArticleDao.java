package com.wulijiexi.answer.dao;

import com.wulijiexi.answer.model.Article;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by TP-LINK on 2016/11/20.
 */
@Repository
public class ArticleDao extends Dao  {

    /**
     * 根据页数和文章类型获取图文
     * @param page
     * @param articleType
     * @return
     */
    public ArrayList<Article> getArticles(int page , String articleType){
        ArrayList<Article> articles=new ArrayList<Article>();
        String sql="select  articleId,title,picUrl,description,articleType from article where articleType=? limit ?,20;";
        SqlRowSet rs=this.getJdbcTemplate().queryForRowSet(sql, new Object[]{articleType,(page-1)*20});
        while(rs.next()){
            Article article=new Article();
            article.setArticleId(rs.getInt("articleId"));
            article.setTitle(rs.getString("title"));
//            article.setPicUrl(rs.getString("picUrl"));
//            article.setDescription(rs.getString("description"));
            article.setArticleType(rs.getString("articleType"));
            articles.add(article);
        }
        return articles;
    }
}
