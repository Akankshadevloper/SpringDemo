package com.Luv2code.sprinboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {




    //inject properties for coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for teaminfo
    @GetMapping("/teaminfo")
    public String teamInfo() {
        return coachName + " " + teamName;
    }



    //expose "/" that return "hello world "
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }


    //Expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run hard ";
    }

    @GetMapping("/eathealthy")
    public String getDailyEathealthy() {
        return "Have fruits ";
    }

    @GetMapping("/havesmile")
    public String getDailyHavesmile() {
        return "Have smiles ";
    }
}
