package Service;

import Pojo.Account;
import Pojo.Message;
import Pojo.ParkingSpace;

import java.util.List;

public interface BusinessService {
    List<ParkingSpace> GetBusinessParkingSpace(Account account);
    ParkingSpace AddParkingSpace(ParkingSpace parkingSpace);
    int ModifyParkingSpaceById(ParkingSpace ParkingSpace);
    int AddMessage(Message message);
}
