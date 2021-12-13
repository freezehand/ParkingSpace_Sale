package Dao;

import Pojo.Account;

import java.util.Map;

public interface AccountMapper {
    Account UserLogin(Account account);
    int UserRegister(Account account);
}
