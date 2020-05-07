package ru.itis.kpfu.springPro.services;

import ru.itis.kpfu.springPro.dto.LoginDto;
import ru.itis.kpfu.springPro.dto.RegDto;

public interface UserService {

    boolean login(LoginDto dto);

    void register(RegDto dto);

}
