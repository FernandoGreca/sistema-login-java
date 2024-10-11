package com.fernandogreca.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CadastroController {
    
    @GetMapping("/cadastro")
    public ModelAndView cadastroPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/cadastro");
        return mv;
    }
    
}
