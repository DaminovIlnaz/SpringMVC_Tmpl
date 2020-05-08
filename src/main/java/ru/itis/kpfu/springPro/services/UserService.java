package ru.itis.kpfu.springPro.services;

import ru.itis.kpfu.springPro.dto.LoginDto;
import ru.itis.kpfu.springPro.dto.RegDto;

public interface UserService {

    boolean login(String login, String password);

    boolean register(String login, String password);

}
