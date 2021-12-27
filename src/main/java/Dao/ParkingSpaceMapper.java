package Dao;

import Pojo.Account;
import Pojo.ParkingSpace;

import java.util.List;

public interface ParkingSpaceMapper {
    List<ParkingSpace> GetAllParkingSpace();
    ParkingSpace GetAllParkingSpaceById(String id);
    List<ParkingSpace> GetBusinessParkingSpace(Account account);

    int AddParkingSpace(ParkingSpace parkingSpace);
    int AddParkingSpaceUrl(ParkingSpace parkingSpace);
    ParkingSpace AddParkingSpaceGetId();

    int ModifyParkingSpaceById(ParkingSpace parkingSpace);

    List<ParkingSpace> AdminGetParkingSpace();

    void CheckParkingSpace(String id);

    void SetParkingsSpace(ParkingSpace parkingSpace);
}
