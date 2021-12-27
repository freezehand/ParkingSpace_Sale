package Service;

import Common.price;
import Dao.*;
import Pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("UserService")
public class UserServiceImpl implements UserService{

    @Resource
    private AccountMapper accountMapper;
    @Resource
    private AddressMapper addressMapper;
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private MessageMapper messageMapper;
    @Resource
    private CouponsMapper couponsMapper;
    @Resource
    private ParkingSpaceMapper parkingSpaceMapper;

    @Override
    public int userlogin(Account account){
        if(accountMapper.UserLogin(account)==null)
            return 0;
        return 1;
    }

    @Override
    public int userregister(Account account, Address address) {
        if(addressMapper.UserRegister(address)==null)
            return 0;
        else{
            if(accountMapper.UserRegister(account)==1)
            {
                addressMapper.IsRegister(address);
                return 1;
            }
            else {
                return 0;
            }
        }
    }

    @Override
    public List<Order> getOrder(Account account){
//        List<Order> order=orderMapper.GetOrderByUsername(account);
        return orderMapper.GetOrderByUsername(account);
    }

    @Override
    public List<Message> usergetmessage(Account account) {
        return messageMapper.UserGetMessage(account);
    }

    @Override
    public List<Coupons> usergetcoupons(Account account) {
        return couponsMapper.UserGetCoupons(account);
    }

    @Override
    public void addorder(Account account, ParkingSpace parkingSpace) {
        Order order=new Order();
        order.setUsername(account.getUsername());
        Date now=new Date();
        DateFormat dateFormat=DateFormat.getDateTimeInstance();
        String str=dateFormat.format(now);
        order.setOrderTime(str);
        order.setState("已预订");
        parkingSpace=parkingSpaceMapper.GetAllParkingSpaceById(parkingSpace.getId());
        order.setPrice(price.getprice(parkingSpace));
        parkingSpace.setState("已预订");
        order.setParkingSpace(parkingSpace);
        parkingSpaceMapper.SetParkingsSpace(parkingSpace);
        orderMapper.AddOrder(order);
    }
}
