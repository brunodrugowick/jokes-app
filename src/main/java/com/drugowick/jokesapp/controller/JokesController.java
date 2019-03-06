package com.drugowick.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @RequestMapping("/")
    public String getJoke(Model model) {

        model.addAttribute("joke", "<Some Joke Here>");

        return "jokes";
    }
}
