package Service;

import Pojo.*;

import java.util.List;

public interface BusinessService {
    List<ParkingSpace> GetBusinessParkingSpace(Account account);
    ParkingSpace AddParkingSpace(ParkingSpace parkingSpace);
    int ModifyParkingSpaceById(ParkingSpace ParkingSpace);
    int AddMessage(Message message);
    List<Message> GetMessageBusiness(Account account);
    void AddCoupons(Coupons coupons);
    List<Coupons> GetBusinessCoupons(Account account);
    List<Order> GetOrderBusiness(Account account);
}
