package com.karan.portfolio;

//import com.karan.portfolio.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
//    @Autowired
//    private EmailService emailService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

//    @GetMapping(value = "/sendmail")
//    public String sendmail() {
//
//        emailService.sendMail("kate@example.com", "Test Subject", "Test mail");
//
//        return "emailsent";
//    }
}
