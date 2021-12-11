package Service;

import Dao.AccountMapper;
import Pojo.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService{

    @Resource
    private AccountMapper accountMapper;

    @Override
    public int userlogin(Account account){
        if(accountMapper.UserLogin(account)==null)
            return 0;
        return 1;
    }
}
