package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{number}/and/{number1}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable int number, @PathVariable int number1) {
        int total = number + number1;
        return number + " plus " + (number1) + " is " + (total) + "!";
    }

    @RequestMapping(path = "/subtract/{number}/from/{number1}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable int number, @PathVariable int number1) {
        int total = number1 - number;
        return number1 + " minus " + (number) + " is " + (total) + "!";
    }

    @RequestMapping(path = "/multiply/{number}/and/{number1}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int number, @PathVariable int number1) {
        int total = number1 * number;
        return number1 + " times " + (number) + " is " + (total) + "!";
    }

    @RequestMapping(path = "/divide/{number}/by/{number1}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable int number, @PathVariable int number1) {
        int total = number / number1;
        return number + " divided by " + (number1) + " is " + (total) + "!";
    }

}
