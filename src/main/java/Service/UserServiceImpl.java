package Service;

import Dao.AccountMapper;
import Dao.AddressMapper;
import Pojo.Account;
import Pojo.Address;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("UserService")
public class UserServiceImpl implements UserService{

    @Resource
    private AccountMapper accountMapper;
    @Resource
    private AddressMapper addressMapper;

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

}
