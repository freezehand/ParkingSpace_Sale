package Dao;

import Pojo.Account;
import Pojo.Coupons;

import java.util.List;

public interface CouponsMapper {
    List<Coupons> UserGetCoupons(Account account);
}
