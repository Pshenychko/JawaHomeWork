package com.pb.psenychko.hw8;


public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();
        try {
            auth.signUp();
        } catch (WrongLoginException e1) {
            System.out.println("Login have to exist between 5 and 20 symbols and only English letter!");
            return;
        } catch (WrongPasswordException e2) {
            System.out.println("Login have to exist between 5 and 20 symbols only English letter!");
            return;
        }
        try {
            auth.signIn();
        } catch (WrongLoginException e3) {
            System.out.println("Oops. Perhaps you entered something wrong. Try again");
        }
    }
}