package com.pb.psenychko.hw8;

public class WrongLoginException extends Exception {
    private String login;
    public WrongLoginException(String login) {
        this.login = login;
    }
}