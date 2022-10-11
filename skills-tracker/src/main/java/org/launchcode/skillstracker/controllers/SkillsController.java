package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String welcome() {
        return
            "<html>" +
            "<body>" +
            "<h1> Skills Tracker </h1>" +
            "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
            "<h3>" +
            "<ol type='1'>" +
            "<li> Javascript </li>" +
            "<li> Java </li>" +
            "<li> HTML </li>" +
            "</ol>" +
            "</body>" +
            "</html>";
    }

    @GetMapping("form")
    public String progLangForm() {
        return
            "<form>" +
            "Name: <br>" +
            "<input type='text' name='name'> <br><br>" +
            "<label for='favorite'>My favorite language:</label><br>" +
            "<select name='languages' id='languages'>" +
            "<option value='javascript'>Javascript</option>" +
            "<option value='java'>Java</option>" +
            "<option value='html'>HTML</option>" +
            "</select> <br><br>" +
            "<label for='favorite'>My second favorite language:</label><br>" +
            "<select name='languages' id='languages'>" +
            "<option value='javascript'>Javascript</option>" +
            "<option value='java'>Java</option>" +
            "<option value='html'>HTML</option>" +
            "</select> <br><br>" +
            "<label for='favorite'>My third favorite language:</label><br>" +
            "<select name='languages' id='languages'>" +
            "<option value='javascript'>Javascript</option>" +
            "<option value='java'>Java</option>" +
            "<option value='html'>HTML</option>" +
            "</select>" +
            "<br><br>" +
            "<input type='submit' value='Submit'>" +
            "</form>";
    }
}
