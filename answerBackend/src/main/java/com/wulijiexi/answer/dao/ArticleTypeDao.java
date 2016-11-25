package com.wulijiexi.answer.dao;

import com.wulijiexi.answer.model.ArticleType;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by TP-LINK on 2016/11/22.
 */
@Repository
public class ArticleTypeDao extends Dao {
    /**
     * 获取所有的文章类型
     * @return
     */
    public ArrayList<ArticleType> getArticleTypes(){
        ArrayList<ArticleType> articleTypes=new ArrayList<ArticleType>();
        String sql="select articleTypeId,articleTypeContent  from articletype;";
        SqlRowSet rs=this.getJdbcTemplate().queryForRowSet(sql);
        while(rs.next()){
            ArticleType articleType=new ArticleType();
            articleType.setArticleTypeId(rs.getInt("articleTypeId"));
            articleType.setArticleTypeContent(rs.getString("articleTypeContent"));
            articleTypes.add(articleType);
        }
        return articleTypes;
    }
}
