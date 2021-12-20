package Service;

import Pojo.ParkingSpace;

import java.util.List;

public interface ParkingSpaceService {
    List<ParkingSpace> getAllParkingSpace();
    ParkingSpace GetAllParkingSpaceById(String id);
}
