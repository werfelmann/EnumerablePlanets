package org.launchcode.controllers;

import org.launchcode.data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(Model model) {
        System.out.println(Arrays.toString(Planets.values()));
        model.addAttribute("planets", Planets.values());
        return "index";
    }
}
