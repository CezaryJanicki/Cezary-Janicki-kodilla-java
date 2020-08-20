package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void libraryUserWithZeroBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfZeroBooks = generateListOfNBooks(0);
        LibraryUser libraryUser = new LibraryUser("Cezary", "Janicki", "8008221540");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfZeroBooks);

        //When
        List<Book> usersBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(0, usersBooks.size());
    }

    @Test
    public void libraryUserWithOneBook() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfOneBook = generateListOfNBooks(1);
        LibraryUser libraryUser = new LibraryUser("Cezary", "Janicki", "8008221540");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfOneBook);

        //When
        List<Book> usersBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, usersBooks.size());
    }

    @Test
    public void libraryUserWithFiveBook() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfOneBook = generateListOfNBooks(5);
        LibraryUser libraryUser = new LibraryUser("Cezary", "Janicki", "8008221540");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfOneBook);

        //When
        List<Book> usersBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, usersBooks.size());
    }

    @Test
    public void testGetSpecificData() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfFiveBooks = generateListOfNBooks(5);
        LibraryUser libraryUser = new LibraryUser("Cezary", "Janicki", "8008221540");
        Book expectedResultListOfBookNo0 = resultListOfFiveBooks.get(0);
        Book expectedResultListOfBookNo5 = resultListOfFiveBooks.get(resultListOfFiveBooks.size()-1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfFiveBooks);

        //When
        List<Book> usersBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        Book resultListOfBookNo0 = usersBooks.get(0);
        Book resultListOfBookNo5 =  usersBooks.get(usersBooks.size() - 1);

        //Then
        assertEquals(expectedResultListOfBookNo0, resultListOfBookNo0);
        assertEquals(expectedResultListOfBookNo5, resultListOfBookNo5);
    }
}
