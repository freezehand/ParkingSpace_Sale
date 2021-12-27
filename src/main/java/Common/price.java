package Common;

import Pojo.ParkingSpace;

public class price {
    public static double getprice(ParkingSpace parkingSpace){
        if(parkingSpace.getDiscount().equals("无折扣")){
            return parkingSpace.getPrice();
        }
        else if(parkingSpace.getDiscount().equals("九五折")){
            return 0.95*parkingSpace.getPrice();
        }
        else if(parkingSpace.getDiscount().equals("九折")){
            return 0.9*parkingSpace.getPrice();
        }
        else return  parkingSpace.getPrice();
    }
}
