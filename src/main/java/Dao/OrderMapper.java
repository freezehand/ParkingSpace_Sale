package Dao;

import Pojo.Account;
import Pojo.Order;

public interface OrderMapper {
    Order GetOrderByUsername(Account account);
}
