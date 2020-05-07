package ru.itis.kpfu.springPro.services;

import org.springframework.stereotype.Service;
import ru.itis.kpfu.springPro.dto.LoginDto;
import ru.itis.kpfu.springPro.dto.RegDto;
import ru.itis.kpfu.springPro.models.User;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl  implements UserService{

    Set<User> users = new HashSet<>();

    @Override
    public boolean login(LoginDto dto) {
        User user = new User(dto.getLogin(), dto.getPassvord());
        for (User usr: users) {
            if(usr.getLogin().equals(user.getLogin()) && usr.getPassvord().equals(user.getPassvord())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void register(RegDto dto) {
        User usr = new User(dto.getLogin(), dto.getPassvord());
        users.add(usr);
    }
}
