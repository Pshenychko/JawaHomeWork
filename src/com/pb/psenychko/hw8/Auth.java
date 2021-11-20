package com.pb.psenychko.hw8;
 import java.util.*;
    public class Auth {
        private String username;
        private String password;
        private String repeatPassword;
        HashMap<String, String> userData = new HashMap<String, String>();
        public String getUsername() {
            return username;
        }
        public  String getPassword() {
            return password;
        }
        public boolean isEng(char ch) {
            return (ch >= 'a' && ch <= 'z');
        }

        public void signUp() throws WrongLoginException,
                WrongPasswordException {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome! before we start. Create your account");
            System.out.println("Imagine login: ");
            username = scan.nextLine();
            boolean correct_username = false;

            char[] un = getUsername().toLowerCase().toCharArray();
            if (un.length >= 5 && un.length <= 20)
                for (char ch : un) {
                    if (isEng(ch) || Character.isDigit(ch)) {
                        correct_username = true;
                    } else throw new WrongLoginException(username);
                }
            else throw new WrongLoginException(username);
            System.out.println("Imagine password ");
            password = scan.nextLine();
            System.out.println("Repeat password: ");
            repeatPassword = scan.nextLine();
            boolean correct_password = false;

            char[] x = getPassword().toLowerCase().toCharArray();
            if ((x.length >= 5 && x.length <= 20)
                    && repeatPassword.equals(password)) {
                for (char ch : x) {
                    if (isEng(ch) || Character.isDigit(ch) || ch == '_') {
                        correct_password = true;
                    } else throw new WrongPasswordException();
                }
            } else throw new WrongPasswordException();
            if (correct_password && correct_username) {
                userData.put(username, password);
            }
        }

        public void signIn() throws WrongLoginException {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your login: ");
            String username_in = scan.nextLine();
            System.out.println("Enter your password: ");
            String password_in = scan.nextLine();
            if (userData.containsValue(password_in) &&
                    userData.containsKey(username_in))
                System.out.println("We`re glad to see you again");
            else throw new WrongLoginException(username_in);
        }
    }
