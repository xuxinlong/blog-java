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
        System.out.println("addArticle" + id);
        return;
    }
    public Integer deleteArticle(Integer id) {
        Integer num = articleDAO.deleteArticle(id);
        return num;
    }

    public Integer updateArticle(Article article) {
        Integer num = articleDAO.updateArticle(article);
        return num;
    }
    public Article getArticleDetail(Integer id) {
        Article article = articleDAO.getArticleDetail(id);
        return article;
    }

}

