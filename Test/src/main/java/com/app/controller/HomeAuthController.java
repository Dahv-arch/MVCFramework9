package com.app.controller;

import com.miniframework.annotations.Auth;
import com.miniframework.annotations.Controller;
import com.miniframework.annotations.GetMapping;
import com.miniframework.model.ModelView;

@Auth
@Controller
public class HomeAuthController {

    @GetMapping("/auth/home")
    public ModelView index() {
        ModelView mv = new ModelView("home");
        mv.addObject("message", "Bienvenue sur le Mini Framework MVC");
        return mv;
    }

    @GetMapping("/auth/homemessage")
    public ModelView home() {
        ModelView mv = new ModelView("home");
        mv.addObject("message", "Page /home");
        return mv;
    }

    @Auth(role = "ADMIN")
    @GetMapping("/auth/home/admin")
    public String admin() {
        return "Zone admin : accès autorisé";
    }

    @Auth(role = "USER")
    @GetMapping("/auth/home/user")
    public String simpleUser() {
        return "Zone user : accès autorisé";
    }
}