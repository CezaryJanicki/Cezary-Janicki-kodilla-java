package com.koilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library of Alexandria");
        IntStream.iterate(0, n -> n + 1 )
                .limit(9)
                .forEach(n -> library.getBooks().add(new Book("Ulysses" + n, "James Joyce" + n, LocalDate.of(2020 - n, 10 - n, 30 - n))));
        //When
        Library libraryTest = new Library("Library of Alexandria");
        //Then
        Assert.assertEquals(libraryTest.getName(), library.getName());
        Assert.assertEquals(9, library.getBooks().size());
    }

    @Test
    public void testGetBooksShallowCopy() {
        //Given
        Library library = new Library("Library of Alexandria");
        IntStream.iterate(0, n -> n + 1 )
                .limit(9)
                .forEach(n -> library.getBooks().add(new Book("Ulysses" + n, "James Joyce" + n, LocalDate.of(2020 - n, 10 - n, 30 - n))));

        Book lastBook = new Book("My life with Donald Trump", "Mike Pence", LocalDate.of(2020,10,3));
        library.getBooks().add(lastBook);
        System.out.println("Library book count before removal : " + library.getBooks().size());

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library of Egypt");
        } catch (CloneNotSupportedException e ) {
            e.printStackTrace();
            System.out.println(e);
        }
        //When
        library.getBooks().remove(lastBook);
        //Then
        System.out.println("Library book count after Removal " + library.getBooks().size());
        System.out.println("Cloned Library book after Library book Removal " + clonedLibrary.getBooks().size());
        Assert.assertEquals(9, clonedLibrary.getBooks().size());
    }

    @Test
    public void testGetBooksDeepCopy() {
        //Given
        Library library = new Library("Library of Alexandria");
        IntStream.iterate(0, n -> n + 1 )
                .limit(9)
                .forEach(n -> library.getBooks().add(new Book("Ulysses" + n, "James Joyce" + n, LocalDate.of(2020 - n, 10 - n, 30 - n))));

        Book lastBook = new Book("My life with Donald Trump", "Mike Pence", LocalDate.of(2020,10,3));
        library.getBooks().add(lastBook);
        System.out.println("Library book count before removal : " + library.getBooks().size());

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library of Egypt");
        } catch (CloneNotSupportedException e ) {
            e.printStackTrace();
            System.out.println(e);
        }
        //When
        library.getBooks().remove(lastBook);

        //Then
        System.out.println("Library book count after Removal " + library.getBooks().size());
        System.out.println("DeepCloned Library book after Library book Removal " + deepClonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
