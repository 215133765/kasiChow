package za.ac.cput.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
@CrossOrigin
@Controller
public class HomeController {

    @RequestMapping({"/", "/home", "/index"})
    public String home() {
        System.out.println("Home Page");
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("About Page");
        return "about";
    }
    @RequestMapping("/landing")
    public String landing() {
        System.out.println("Landing Page");
        return "landing";
    }
    @RequestMapping("/dashboard")
    public String dashboard() {
        System.out.println("Dashboard Page");
        return "dashboard";
    }

//    @RequestMapping("/contact")
//    public String contact() {
//        System.out.println("Contact Page");
//        return "contact";
//    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("Login Page");
        return "login";
    }

    @RequestMapping("/adminlogin")
    public String adminLogin() {
        System.out.println("Admin Login Page");
        return "adminLogin";
    }
//
//    @RequestMapping("/services")
//    public String services() {
//        System.out.println("Services Page");
//        return "services";
//    }
}
