package com.xxl.blog.dao;

import com.xxl.blog.domain.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleDAO {
   List<Article> getArticleList();
   Integer addArticle(Article article);
   Integer deleteArticle(Integer id);
}
