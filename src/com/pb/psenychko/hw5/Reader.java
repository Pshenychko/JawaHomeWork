package com.pb.psenychko.hw5;
import java.util.Arrays;


public class Reader {
    private String name = "Инкогнито";
    private int ticketNumber;
    private String section;
    private String birthday;
    private String phoneNumber;

    public Reader(String name, int ticketNumber, String section, String birthday, String phoneNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.section = section;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(this.name + " Взял " + count + " Книг.");
    }

    public void takeBook(String[] names) {
        System.out.print(this.name + "Взял книги:");
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if(i != names.length-1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }

    public void takeBook(Book... book) {
        System.out.print(this.name + "Взял книги:");
        for(int i = 0; i < book.length; i++) {
            System.out.print(book[i].getName() + '(' + book[i].getAuthor() + ", " + book[i].getYear() + ')');
            if(i == book.length - 1) {
                System.out.println(".");
            } else {
                System.out.print(", ");
            }
        }
    }

    public void returnBook(int count) {
        System.out.println(this.name + " Вернул " + count + " Книг.");
    }

    public void returnBook(String... names) {
        System.out.print(this.name + "Вернул книги:");
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if (i == names.length - 1) {
                System.out.println(".");
            } else {
                System.out.print(", ");
            }
        }
        }

    public void returnBook(Book... book) {
        System.out.print(this.name + "Вернул книги:");
        for(int i = 0; i < book.length; i++) {
            System.out.print(book[i].getName() + '(' + book[i].getAuthor() + ", " + book[i].getYear() + ')');
            if(i == book.length - 1) {
                System.out.println(".");
            } else {
                System.out.print(", ");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getSection() {
        return section;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
