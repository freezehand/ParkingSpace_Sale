package Service;

import Pojo.Coupons;
import Pojo.Message;
import Pojo.ParkingSpace;

import java.util.List;

public interface AdminService {
    List<ParkingSpace> AdminGetParkingSpace();

    void checkparkingspace(String id);

    List<Message> AdminGetMessage();

    void checkmessage(String id);

    List<Coupons> AdminGetCoupons();

    void CheckCoupons(String id);
}
