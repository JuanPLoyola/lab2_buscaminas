package org.example.lab2_buscaminas.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController{

    @RequestMapping(value = "/buscaminas", method = RequestMethod.GET)
    public String buscaminas(){
        return "buscaminas";
    }

}