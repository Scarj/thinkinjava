package ru.arcticweb.initialization;

class Book {
    boolean checkedOut = false;
    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
    void checkIn(){
        checkedOut = false;
    }

    public void finalize() {
        if(checkedOut) {
            System.out.println("Ошибка, checkedOut");
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
