package Service;

import Dao.CouponsMapper;
import Dao.MessageMapper;
import Dao.ParkingSpaceMapper;
import Pojo.Coupons;
import Pojo.Message;
import Pojo.ParkingSpace;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("AdminService")
public class AdminServiceImpl implements AdminService{

    @Resource
    ParkingSpaceMapper parkingSpaceMapper;
    @Resource
    MessageMapper messageMapper;
    @Resource
    CouponsMapper couponsMapper;

    @Override
    public List<ParkingSpace> AdminGetParkingSpace() {
        return parkingSpaceMapper.AdminGetParkingSpace();
    }

    @Override
    public void checkparkingspace(String id) {
        parkingSpaceMapper.CheckParkingSpace(id);
    }

    @Override
    public List<Message> AdminGetMessage() {
        return messageMapper.AdminGetMessage();
    }

    @Override
    public void checkmessage(String id) {
        messageMapper.CheckMessage(id);
    }

    @Override
    public List<Coupons> AdminGetCoupons() {
        return couponsMapper.AdminGetCoupons();
    }

    @Override
    public void CheckCoupons(String id) {
        couponsMapper.CheckCoupons(id);
    }
}
