package com.kodilla.spring.reader;

public final class Reader {
    private final Book theBook;

    public Reader(final Book TheBook) {
        this.theBook = TheBook;
    }

   public void read() {
       System.out.println("I am reading this book: " + this.theBook.getTitle());
   }
}
