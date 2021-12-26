package Service;

import Dao.CouponsMapper;
import Dao.MessageMapper;
import Dao.OrderMapper;
import Dao.ParkingSpaceMapper;
import Pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("BusinessService")
public class BusinessServiceImpl implements BusinessService{

    @Resource
    private ParkingSpaceMapper parkingSpaceMapper;
    @Resource
    private MessageMapper messageMapper;
    @Resource
    private CouponsMapper couponsMapper;
    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<ParkingSpace> GetBusinessParkingSpace(Account account) {
        return parkingSpaceMapper.GetBusinessParkingSpace(account);
    }

    @Override
    public ParkingSpace AddParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaceMapper.AddParkingSpace(parkingSpace);
        ParkingSpace parkingSpace1=parkingSpaceMapper.AddParkingSpaceGetId();
        parkingSpace1.setUrl(parkingSpace1.getId()+".jpg");
        parkingSpaceMapper.AddParkingSpaceUrl(parkingSpace1);
        return parkingSpace1;
    }

    @Override
    public int ModifyParkingSpaceById(ParkingSpace parkingSpace) {
        return parkingSpaceMapper.ModifyParkingSpaceById(parkingSpace);
    }

    @Override
    public int AddMessage(Message message) {
        messageMapper.AddMessage(message);
        return 0;
    }

    @Override
    public List<Message> GetMessageBusiness(Account account) {
        return messageMapper.GetMessageBusiness(account);
    }

    @Override
    public void AddCoupons(Coupons coupons) {
        couponsMapper.AddCoupons(coupons);
    }

    @Override
    public List<Coupons> GetBusinessCoupons(Account account) {
        return couponsMapper.GetCouponsBusiness(account);
    }

    @Override
    public List<Order> GetOrderBusiness(Account account) {
        return orderMapper.GetOrderBusiness(account);
    }
}
