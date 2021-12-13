package Controller;

import Common.encode;
import Pojo.Account;
import Pojo.Address;
import Service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class IndexController {
    private static final Log logger = LogFactory.getLog(IndexController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String userlogin(@ModelAttribute("account") Account account, Model model) {
        account.setPassword(encode.getcode(account.getPassword()));
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

    @RequestMapping("/register")
    public String userregister(HttpServletRequest request, Model model,
                               @ModelAttribute("account") Account account,
                               @ModelAttribute("address")Address address){
        account.setPassword(encode.getcode(account.getPassword()));
        if(userService.userregister(account,address)==1)
        {
            return "login";
        }
        else{
            model.addAttribute("message","地址信息错误或用户名已注册，请重试");
            return "register";
        }

    }
}
