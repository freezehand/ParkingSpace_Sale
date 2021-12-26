package Controller;

import Service.AdminService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private static final Log logger= LogFactory.getLog(AdminController.class);

    @Autowired
    private AdminService adminService;

    @RequestMapping("/admingetparkingspace")
    public String admingetparkingspace(Model model){
        model.addAttribute("adminparkingspacelist",adminService.AdminGetParkingSpace());
        return "admin_checkparkingspace";
    }
    @RequestMapping("/checkparkingspace")
    public String checkparkingspace(String id){
        adminService.checkparkingspace(id);
        return "redirect:/admin/admingetparkingspace";
    }
    @RequestMapping("/admingetmessage")
    public String admingetmessage(Model model){
        model.addAttribute("adminmessagelist",adminService.AdminGetMessage());
        return "admin_checkmessage";
    }
    @RequestMapping("/checkmessage")
    public String checkmessage(String id){
        adminService.checkmessage(id);
        return "redirect:/admin/checkmessage";
    }
    @RequestMapping("/admingetcoupons")
    public String admingetcoupons(Model model){
        model.addAttribute("admincouponslist",adminService.AdminGetCoupons());
        return "admin_checkcoupons";
    }
    @RequestMapping("/checkcoupons")
    public String checkcoupons(String id){
        adminService.CheckCoupons(id);
        return "redirect:/admin/admingetcoupons";
    }
}
