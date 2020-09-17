package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String programmingLanguages(){
        String languages =
                "<h1>Skills Tracker</h1>" +
                    "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                    "</ol>";

        return languages;
    }

    @GetMapping("form")
    public String languageForm(){
        String form = "<form method='post'>" +
                "Name: " +
                "<input type= 'text' name='name'>" +
                "<br>" +
                "<label>My favorite language:" +
                    "<select name='favorite1'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript </option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                "<br>" +
                "</label>" +
                "<label>My second favorite language:" +
                    "<select name='favorite2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript </option>" +
                        "<option value='Python'>Python</option>" +
                "</label>" +
                "</select>" +
                "<br>" +
                "<label>My third favorite language:" +
                    "<select name='favorite3'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript </option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                "</label>" +
                "<br>" +
                "<input type='submit' value='Submit'>";
        return form;


    }

    @PostMapping("form")
    public String skillTracker(@RequestParam String name, @RequestParam String favorite1, @RequestParam String favorite2, @RequestParam String favorite3 ){
        String display =
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite1 +"</li>" +
                "<li>" + favorite2 +"</li>" +
                "<li>" + favorite3 +"</li>" +
                "</ol>";

        return display;
    }



}
