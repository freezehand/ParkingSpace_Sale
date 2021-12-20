package Controller;

import Pojo.Account;
import Pojo.ParkingSpace;
import Service.ParkingSpaceService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parkingspace")
public class ParkingSpaceController {
    private static final Log logger = LogFactory.getLog(ParkingSpaceController.class);

    @Autowired
    private ParkingSpaceService parkingSpaceService;

    @RequestMapping("/getparkingspacebyid")
    public String GetParkingSpaceById(String id, Model model)
    {
        model.addAttribute("ParkingSpace",parkingSpaceService.GetAllParkingSpaceById(id));
        return "parkingspace_info";
    }

}
