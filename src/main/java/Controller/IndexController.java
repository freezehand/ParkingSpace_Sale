package Controller;

import Pojo.Account;
import Service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class IndexController {
    private static final Log logger = LogFactory.getLog(IndexController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String userlogin(@ModelAttribute("account") Account account, Model model) {
       if(userService.userlogin(account)==1)
       {
           model.addAttribute("account",account);
           return "product";
       }
       else {
           model.addAttribute("message","登录失败");
           return "login";
       }
    }
}
