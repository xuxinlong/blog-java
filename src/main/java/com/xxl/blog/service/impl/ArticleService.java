package com.xxl.blog.service.impl;

import java.util.List;
import com.xxl.blog.dao.ArticleDAO;
import com.xxl.blog.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    /**
     *
     */
    @Autowired
    private ArticleDAO articleDAO;

    public List<Article> getArticleList() {

        return articleDAO.getArticleList();
    }

    public void addArticle(Article article) {
        Integer id = articleDAO.addArticle(article);
        System.out.println(id);
        return;
    }
    public Integer deleteArticle(Integer id) {
        return articleDAO.deleteArticle(id);
    }

}

