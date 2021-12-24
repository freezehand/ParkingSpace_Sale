package Service;

import Dao.ParkingSpaceMapper;
import Pojo.Account;
import Pojo.ParkingSpace;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("BusinessService")
public class BusinessServiceImpl implements BusinessService{

    @Resource
    private ParkingSpaceMapper parkingSpaceMapper;

    @Override
    public List<ParkingSpace> GetBusinessParkingSpace(Account account) {
        return parkingSpaceMapper.GetBusinessParkingSpace(account);
    }
}
