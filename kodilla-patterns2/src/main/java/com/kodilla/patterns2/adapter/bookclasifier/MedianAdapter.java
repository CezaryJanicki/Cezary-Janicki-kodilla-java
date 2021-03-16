package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Clasifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Clasifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books;
        books = bookSet.stream()
                .collect(Collectors.toMap(
                        key -> new BookSignature(key.getSignature()),
                        value -> new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(value.getAuthor(), value.getTitle(), value.getPublicationYear())
                ));
        return medianPublicationYear(books);
    }
}