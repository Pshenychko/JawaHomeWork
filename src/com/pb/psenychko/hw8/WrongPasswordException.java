package com.pb.psenychko.hw8;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Password incorrect!");
    }
}
