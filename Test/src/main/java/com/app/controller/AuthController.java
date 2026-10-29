package com.app.controller;

import com.app.model.Eleve;
import com.miniframework.annotations.*;
import com.miniframework.core.CustomSession;
import com.miniframework.core.FrontController;
import com.miniframework.model.ModelView;

import java.util.List;

@Controller
public class AuthController {

    @PostMapping("/login")
    public String login(@Param("login") String login,
                        @Param("password") String password,
                        CustomSession session) {

        String role = null;
        if ("admin".equals(login) && "1234".equals(password)) {
            role = "ADMIN";
        } else if ("user".equals(login) && "1234".equals(password)) {
            role = "USER";
        }

        if (role == null) {
            return "Identifiants invalides";
        }

        session.set(FrontController.SESSION_USER_KEY, login);
        session.set(FrontController.SESSION_ROLE_KEY, role);
        return "Connecté : " + login + " (rôle " + role + ")";
    }

    @PostMapping("/logout")
    public String logout(CustomSession session) {
        session.invalidate();
        return "Déconnecté";
    }

    @Auth
    @GetMapping("/eleve/prive")
    public String prive() {
        return "Zone privée : accès autorisé";
    }
}