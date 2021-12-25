package Service;

import Dao.MessageMapper;
import Dao.ParkingSpaceMapper;
import Pojo.Account;
import Pojo.Message;
import Pojo.ParkingSpace;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("BusinessService")
public class BusinessServiceImpl implements BusinessService{

    @Resource
    private ParkingSpaceMapper parkingSpaceMapper;
    @Resource
    private MessageMapper messageMapper;

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
}
