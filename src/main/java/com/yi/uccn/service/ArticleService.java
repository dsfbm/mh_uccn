package com.yi.uccn.service;

import com.yi.uccn.model.ArticleExample;
import com.yi.uccn.model.ArticleWithBLOBs;

import java.util.List;

/**
 * 文章操作
 * @author YI
 */
public interface ArticleService {

    /**
     * 保存文章
     * @param article
     * @return
     */
    int save(ArticleWithBLOBs article);

    /**
     * 根据id查询文章详情
     * @param id
     * @return
     */
    ArticleWithBLOBs findArticle(Integer id);

    List<ArticleWithBLOBs> findHomeArticle(ArticleExample  example);
}
