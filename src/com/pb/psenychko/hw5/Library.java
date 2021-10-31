package com.pb.psenychko.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        Reader[] reader = new Reader[3];


        //заношу дані читачів
        reader[0] = new Reader("Ваня Г Г", 00340440, "Program", "2000.01.23", "09978787");
        reader[1] = new Reader("Назар М О", 003230440, "Teach", "1998.04.21", "09978545");
        reader[2] = new Reader("Петя Л О", 003424420, "Lean", "1991.07.22", "095435344");

        //заношу дані книжок
        books[0] = new Book("Лермонтов", "Люди", 1995);
        books[1] = new Book("Соломонов", "Миранда", 1896);
        books[2] = new Book("Гоголь", "Баланда", 1820);

        // виводжу всіх читачів
        for(int i = 0; i < reader.length; i++) {
            System.out.println(reader[i].getName() + ' ' + reader[i].getBirthday()
                    + ' ' + reader[i].getPhoneNumber() + ' ' + reader[i].getSection()
                    + ' ' + reader[i].getTicketNumber());
        }

        // Виводжу всі книжки
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + ' ' + books[i].getAuthor() + ' ' + books[i].getYear() + ' ');
        }

        reader[1].takeBook(1);
        String[] x = {books[1].getName(),books[2].getName()};
        reader[2].takeBook(x);
        reader[0].takeBook(books[1]);
        reader[2].returnBook(5);
        String[] y = {books[0].getName(),books[2].getName()};
        reader[1].returnBook(y);
        Book[] z = {books[0],books[2]};
        reader[0].returnBook(z);


    }
}
