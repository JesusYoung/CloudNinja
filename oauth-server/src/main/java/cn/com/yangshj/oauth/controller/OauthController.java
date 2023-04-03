package cn.com.yangshj.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *
 * @author yangshj
 * @since 2023/3/30 14:23
 */
@Controller
@RequestMapping("/oauth")
public class OauthController {

    @GetMapping("/login")
    public String loginView(Model model) {
        model.addAttribute("action", "/oauth/login");
        return "form-login";
    }
}
