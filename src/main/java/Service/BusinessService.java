package Service;

import Pojo.Account;
import Pojo.ParkingSpace;

import java.util.List;

public interface BusinessService {
    List<ParkingSpace> GetBusinessParkingSpace(Account account);
}
