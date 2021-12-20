package Service;

import Pojo.Account;
import Pojo.Address;
import Pojo.Order;

import java.util.Map;

public interface UserService {

    int userlogin(Account account);
    int userregister(Account account, Address address);
    public Order getOrder(Account account);
}
