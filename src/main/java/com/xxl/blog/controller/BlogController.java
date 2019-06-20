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

    @RequestMapping(value = "/article/update", method = RequestMethod.POST)
    public Result updateArticle(@RequestBody Article article) {
        Object obj = new Object[2];
        Integer num =  articleService.updateArticle(article);
        System.out.println(num);

        return ResultUtil.success(num);
    }

    @RequestMapping(value = "/article/detail", method = RequestMethod.GET)
    public Result getArticleDetail(@RequestParam("id") Integer id) {
        Article article =  articleService.getArticleDetail(id);
        System.out.println(article);

        return ResultUtil.success(article);
    }

    @RequestMapping(value = "/article/detail_public", method = RequestMethod.GET)
    public Result getArticleDetailPublic(@RequestParam("id") Integer id) {
        Article article =  articleService.getArticleDetail(id);
        System.out.println(article);

        return ResultUtil.success(article);
    }
}