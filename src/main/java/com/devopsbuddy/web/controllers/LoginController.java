/**
 * 
 */
package com.devopsbuddy.web.controllers;

/**
 * @author scmbld on 07-Nov-2017
 *
 */
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 
@Controller
public class LoginController {

    /** The login view name */
    public static final String LOGIN_VIEW_NAME = "user/login";

    @RequestMapping("/login")
    public String login() {
        return LOGIN_VIEW_NAME;
    }
}