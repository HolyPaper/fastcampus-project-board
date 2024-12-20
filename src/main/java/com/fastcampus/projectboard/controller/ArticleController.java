package com.fastcampus.projectboard.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/articles")
@Controller
public class ArticleController {

    @GetMapping
    public String articles(ModelMap map) {
        map.addAttribute("articles", List.of());
        return "articles/index";
    }

    @GetMapping("/{articleId}")
    public String article(@PathVariable long articleId, ModelMap map) {
        map.addAttribute("article", "article"); // TODO: 구현할 때 여기에 실제 데이터 넣어줘야 한다. 
        map.addAttribute("articleComments", List.of());
        return "articles/detail";
    }
}
