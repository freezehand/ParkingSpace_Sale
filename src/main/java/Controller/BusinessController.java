package Controller;

import Pojo.Account;
import Pojo.Message;
import Pojo.ParkingSpace;
import Service.BusinessService;
import Service.ParkingSpaceService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/business")
public class BusinessController {
    private static final Log logger = LogFactory.getLog(BusinessController.class);

    @Autowired
    private BusinessService businessService;

    @Autowired
    private ParkingSpaceService parkingSpaceService;

    @RequestMapping("/addParkingSpace")
    public String addParkingSpace(@ModelAttribute ParkingSpace parkingSpace,
                                  Model model, HttpSession session,
                                  HttpServletRequest request,
                                  MultipartFile file){

        Account account= (Account) session.getAttribute("account");
        parkingSpace.setPublisher(account.getUsername());
        parkingSpace= businessService.AddParkingSpace(parkingSpace);

        String filePath="G:\\JavaEE\\ParkingSpace_Sale\\src\\main\\webapp\\parkingspace";
        String newName=parkingSpace.getUrl();
        File targetFile=new File(filePath, newName);
        try{
            file.transferTo(targetFile);
        }catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/user/flash";
    }

    @RequestMapping("/addMessaage")
    public String addMessaage(@ModelAttribute ("message")Message message,
                              Model model,HttpSession session){
        Account account= (Account) session.getAttribute("account");
        message.setSender(account.getUsername());
        businessService.AddMessage(message);
        model.addAttribute("message","消息已发布，等待管理员审核");
        return "result_business";
    }

    @RequestMapping("/modifyparkingspacebyid")
    public String modifyparkingspacebyid(String id, Model model)
    {
        model.addAttribute("ParkingSpace",parkingSpaceService.GetAllParkingSpaceById(id));
        return "modifyparkingspace";
    }

    @RequestMapping("/modifyParkingSpace")
    public String queryParkingSpace(@ModelAttribute("parkingspace") ParkingSpace parkingSpace,Model model) {
        parkingSpace.setState(parkingSpaceService.GetAllParkingSpaceById( parkingSpace.getId()).getState());
        if(parkingSpace.getState().equals("已出售")||parkingSpace.getState().equals("已预订"))
        {
            model.addAttribute("message","车位已出售，无法修改");
            return "result_business";
        }
        else{
            int i=businessService.ModifyParkingSpaceById(parkingSpace);
            if(i==1) {
                model.addAttribute("message","修改成功，等待管理员审核");
                return "result_business";
            }
            else{
                model.addAttribute("message","修改失败，请联系管理员");
                return "result_business";
            }
        }

    }

}
