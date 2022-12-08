package md.kidali.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
//@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello User!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!";
    }

    @GetMapping("/logoutSuccess")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "lOGGED OUT SUCCESSFULLY";
    }
}
