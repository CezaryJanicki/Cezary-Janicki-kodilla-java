package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooksShallowCopy() throws CloneNotSupportedException {
        //Given
        Library library = new Library("Library of Alexandria");
        Book book = new Book("My life with Donald Trump", "Mike Pence", LocalDate.of(2020,10,3));

        Library clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Library of Egypt");

        //When
        clonedLibrary.getBooks().add(book);

        //Then
        Assert.assertEquals("Library of Alexandria", library.getName());
        Assert.assertEquals("Library of Egypt", clonedLibrary.getName());
        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(1, clonedLibrary.getBooks().size());
        Assert.assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testGetBooksDeepCopy() throws CloneNotSupportedException {
        //Given
        Library library = new Library("Library of Alexandria");
        Book book = new Book("My life with Donald Trump", "Mike Pence", LocalDate.of(2020,10,3));

        Library clonedLibrary = library.deepCopy();
        clonedLibrary.setName("Library of Egypt");

        //When
        clonedLibrary.getBooks().add(book);

        //Then
        Assert.assertEquals("Library of Alexandria", library.getName());
        Assert.assertEquals("Library of Egypt", clonedLibrary.getName());
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(1, clonedLibrary.getBooks().size());
    }
}
