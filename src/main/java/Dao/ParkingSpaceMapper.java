package Dao;

import Pojo.Account;
import Pojo.ParkingSpace;

import java.util.List;

public interface ParkingSpaceMapper {
    List<ParkingSpace> GetAllParkingSpace();
    ParkingSpace GetAllParkingSpaceById(String id);
    List<ParkingSpace> GetBusinessParkingSpace(Account account);
}
