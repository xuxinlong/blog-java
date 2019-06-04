package com.xxl.blog.controller;

import com.xxl.blog.domain.Article;
import com.xxl.blog.util.ResultUtil;
import com.xxl.blog.domain.Result;
import com.xxl.blog.service.impl.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")

@EnableAutoConfiguration
public class BlogController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/article/list", method = RequestMethod.GET)
    public Result getArticleList() {

        return ResultUtil.success(articleService.getArticleList());
    }

    @RequestMapping(value = "/article/list_public", method = RequestMethod.GET)
    public Result getPublicArticleList() {

        return ResultUtil.success(articleService.getArticleList());
    }

    @RequestMapping(value = "/article/add", method = RequestMethod.POST)
    @ResponseBody
    public Result addArticle(@RequestBody Article article) {
        Object obj = new Object[1];
        articleService.addArticle(article);

        System.out.println(obj);

        return ResultUtil.success(obj);
    }

    @RequestMapping(value = "/article/delete")
    public Result deleteArticle(@RequestParam("id") Integer id) {
        Object obj = new Object[1];
        System.out.println(articleService.deleteArticle(id));

        return ResultUtil.success(obj);
    }
}