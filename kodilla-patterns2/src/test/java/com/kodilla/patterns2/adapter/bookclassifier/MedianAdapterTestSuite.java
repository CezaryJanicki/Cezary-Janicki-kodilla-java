package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTestEven() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Saul Bellow", "The Adventures of Augie March", 1953, "Signature 1"));
        books.add(new Book("Robert Penn Warren", "All the King's Men",  1946,"Signature 2"));
        books.add(new Book("Philip Roth", "American Pastoral", 2007, "Signature 3"));
        books.add(new Book("John O'Hara", "Appointment in Sammara", 1934, "Signature 4"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(median);
        assertEquals(1949.5, median, 0.5);
    }

    @Test
    public void publicationYearMedianTestOdd() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Saul Bellow", "The Adventures of Augie March", 1953, "Signature 1"));
        books.add(new Book("Robert Penn Warren", "All the King's Men",  1946,"Signature 2"));
        books.add(new Book("Philip Roth", "American Pastoral", 2007, "Signature 3"));
        books.add(new Book("John O'Hara", "Appointment in Sammara", 1934, "Signature 4"));
        books.add(new Book("William Gibson", "Neuromancer", 1984, "Signature 5"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(median);
        assertEquals(1953, median, 0.05);
    }
}
