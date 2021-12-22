package Dao;

import Pojo.Account;
import Pojo.Message;

import java.util.List;

public interface MessageMapper {
    List<Message> UserGetMessage(Account account);
}
