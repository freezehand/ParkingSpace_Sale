package Dao;

import Pojo.Account;
import Pojo.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> GetOrderByUsername(Account account);

    List<Order> GetOrderBusiness(Account account);
}
