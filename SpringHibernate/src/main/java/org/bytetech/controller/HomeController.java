package org.bytetech.controller;

import org.bytetech.Dao.AlienDao;
import org.bytetech.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private AlienDao alienDao;

    @GetMapping("/")
    public String home(Model m) {
        return "index";
    }

    @GetMapping("/showAliens")
    public String show(Model m) {
        m.addAttribute("result", alienDao.getAliens());
        return "show";
    }

    @PostMapping("/addAlien")
    public String addAlien(@ModelAttribute("result") Alien a, Model m) {
        alienDao.addAlien(a);
        m.addAttribute("result", a);
        return "show";
    }

    @GetMapping("/getAlien")
    public String getAlienById(@RequestParam int id, Model m) {
        Alien a = alienDao.getById(id);
        m.addAttribute("result", a);
        return "show";
    }

}
