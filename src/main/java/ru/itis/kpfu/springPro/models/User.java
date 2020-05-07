package ru.itis.kpfu.springPro.models;

import java.util.Objects;

public class User {

    private String login;
    private String passvord;

    public User(String login, String passvord) {
        this.login = login;
        this.passvord = passvord;
    }

    public User() {
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
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(passvord, user.passvord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, passvord);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passvord='" + passvord + '\'' +
                '}';
    }
}

