package Service;

import Dao.ParkingSpaceMapper;
import Pojo.ParkingSpace;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ParkingSpaceService")
public class ParkingSpaceServiceImpl implements ParkingSpaceService{

    @Resource
    private ParkingSpaceMapper parkingSpaceMapper;

    @Override
    public List<ParkingSpace> getAllParkingSpace() {return parkingSpaceMapper.GetAllParkingSpace();}

    @Override
    public ParkingSpace GetAllParkingSpaceById(String id) {return parkingSpaceMapper.GetAllParkingSpaceById(id);}
}
