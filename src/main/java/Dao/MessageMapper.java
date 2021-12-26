package Dao;

import Pojo.Account;
import Pojo.Message;

import java.util.List;

public interface MessageMapper {
    List<Message> UserGetMessage(Account account);
    int AddMessage(Message message);
    List<Message> GetMessageBusiness(Account account);

    List<Message> AdminGetMessage();

    void CheckMessage(String id);
}
