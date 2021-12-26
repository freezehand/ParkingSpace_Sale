package Dao;

import Pojo.Account;
import Pojo.Coupons;

import java.util.List;

public interface CouponsMapper {
    List<Coupons> UserGetCoupons(Account account);

    void AddCoupons(Coupons coupons);

    List<Coupons> GetCouponsBusiness(Account account);

    List<Coupons> AdminGetCoupons();

    void CheckCoupons(String id);
}
