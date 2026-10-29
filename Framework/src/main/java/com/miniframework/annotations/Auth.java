package com.miniframework.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Protège une route : l'utilisateur doit être connecté (présent en session).
 * - role vide (défaut) : être connecté suffit ;
 * - role renseigné (ex : "ADMIN") : le rôle en session doit être exactement identique.
 * Sur une méthode : cette route seule (et elle remplace l'@Auth de la classe).
 * Sur une classe : toutes ses routes.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Auth {
    String role() default "";
}