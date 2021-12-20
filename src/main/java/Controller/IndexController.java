package Controller;

import Common.encode;
import Pojo.Account;
import Pojo.Address;
import Service.ParkingSpaceService;
import Service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class IndexController {
    private static final Log logger = LogFactory.getLog(IndexController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private ParkingSpaceService parkingSpaceService;


    @RequestMapping("/login")
    public String userlogin(@ModelAttribute("account") Account account, Model model, HttpSession session) {
        account.setPassword(encode.getcode(account.getPassword()));
       if(userService.userlogin(account)==1)
       {
           session.setAttribute("account",account);
           session.setAttribute("ParkingSpaceList",parkingSpaceService.getAllParkingSpace());
           return "product";
       }
       else {
           model.addAttribute("message","登录失败");
           return "login";
       }
    }

    @RequestMapping("/register")
    public String userregister( Model model,
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
    @RequestMapping("/getorder")
    public String usergetorder(@ModelAttribute("account")Account account,Model model){
        model.addAttribute("myorder",userService.getOrder(account));
        return "myorder";
    }
}
