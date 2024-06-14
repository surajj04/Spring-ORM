package com.byetech.SpringBootMVC.controller;

import com.byetech.SpringBootMVC.model.Alien;
import com.byetech.SpringBootMVC.repository.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("getAliens")
    public String getAliens(Model m) {
        m.addAttribute("result", repo.findAll());
        return "show";
    }

    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien, Model model) {
        repo.save(alien);

        model.addAttribute("result", alien);
        return "show";
    }

    @GetMapping("getById")
    public String getById(@RequestParam int id, Model m) {
        m.addAttribute("result", repo.getOne(id));
        return "show";
    }

    @GetMapping("getByName")
    public String getByName(@RequestParam String name, Model m) {
//        m.addAttribute("result", repo.findByName(name));
        m.addAttribute("result", repo.find(name));

        return "show";
    }


}
