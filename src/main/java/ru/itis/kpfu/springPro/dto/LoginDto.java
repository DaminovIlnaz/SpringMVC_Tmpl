package ru.itis.kpfu.springPro.dto;

import java.util.Objects;
import lombok.Data;


@Data
public class LoginDto {

    private String login;
    private String passvord;

    public LoginDto(String login, String passvord) {
        this.login = login;
        this.passvord = passvord;
    }

    public LoginDto() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassvord() {
        return passvord;
    }

    public void setPassvord(String passvord) {
        this.passvord = passvord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginDto loginDto = (LoginDto) o;
        return Objects.equals(login, loginDto.login) &&
                Objects.equals(passvord, loginDto.passvord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, passvord);
    }

    @Override
    public String toString() {
        return "LoginDto{" +
                "login='" + login + '\'' +
                ", passvord='" + passvord + '\'' +
                '}';
    }
}
