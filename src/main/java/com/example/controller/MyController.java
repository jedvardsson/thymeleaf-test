package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = "/thymeleaf/test", method = RequestMethod.GET)
    public String testThymeleaf(@ModelAttribute MyModel model) {
        model.setMessage("Hello, Thymeleaf!");
        return "thymeleaf/test";
    }

    @RequestMapping(value = "/jsp/test", method = RequestMethod.GET)
    public String testJsp(@ModelAttribute MyModel model) {
        model.setMessage("Hello, JSP!");
        return "jsp/test";
    }

    public static class MyModel {
        private String message;

        public MyModel() {
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
