package org.example.lab2_buscaminas.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController{

    @RequestMapping(value = "/buscaminas", method = RequestMethod.GET)
    public String buscaminas(){
        return "buscaminas";
    }

    @RequestMapping(value = "/Jugar", method = RequestMethod.GET)
    public String Jugar(){
        return "Jugar";
    }
}