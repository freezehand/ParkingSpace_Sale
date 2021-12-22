package Service;

import Pojo.*;

import java.util.List;
import java.util.Map;

public interface UserService {

    int userlogin(Account account);
    int userregister(Account account, Address address);
    List<Order> getOrder(Account account);
    List<Message> usergetmessage(Account account);
    List<Coupons> usergetcoupons(Account account);
}
