package fr.univtln.m2dapm.stock.managerbean;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Maxime Gajovski on 12/01/2017.
 */
@Qualifier
@ApplicationScoped
@Target({TYPE, METHOD, PARAMETER, FIELD})
@Retention(RUNTIME)
public @interface ManagerBean {

}
