package Controller;

import Common.encode;
import Pojo.Account;
import Pojo.Address;
import Service.BusinessService;
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

    @Autowired
    private BusinessService businessService;

    @RequestMapping("flash")
    public String flash(Model model,HttpSession session){
        Account account=(Account) session.getAttribute("account");
        session.setAttribute("ParkingSpaceList",businessService.GetBusinessParkingSpace(account));
        return "business_main";
    }

    @RequestMapping("/login")
    public String userlogin(@ModelAttribute("account") Account account, Model model, HttpSession session) {
        account.setPassword(encode.getcode(account.getPassword()));
       if(userService.userlogin(account)==1)
       {
           session.setAttribute("account",account);
           if(account.getUsertype().equals("业主用户")) {
               session.setAttribute("ParkingSpaceList",parkingSpaceService.getAllParkingSpace());
               return "product";
           }
         else if(account.getUsertype().equals("业务人员")) {
             session.setAttribute("ParkingSpaceList",businessService.GetBusinessParkingSpace(account));
             return "business_main";
           }
       }
       else {
           model.addAttribute("message","登录失败");
           return "login";
       }
        return "login";
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
    @RequestMapping("/logout")
    public String userlogout(HttpSession session){
        session.removeAttribute("account");
        return "login";
    }
    @RequestMapping("/getorder")
    public String usergetorder(@ModelAttribute("account")Account account,Model model){
        model.addAttribute("myorderlist",userService.getOrder(account));
        return "myorder";
    }
    @RequestMapping("/getmessage")
    public String usergetmessage(@ModelAttribute("account")Account account,Model model){
        model.addAttribute("mymessagelist",userService.usergetmessage(account));
        return "mymessage";
    }
    @RequestMapping("/getcoupons")
    public String usergetcoupons(@ModelAttribute("account")Account account,Model model){
        model.addAttribute("mycouponslist",userService.usergetcoupons(account));
        return "mycoupons";
    }
}
