package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.xml.ws.ServiceMode;
import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();

    //injection through field instance
    @Autowired
    private  LibraryDbController libraryDbController;

    /*  //injection through setters;
    @Autowired
    public void setLibraryDbController(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }
    */

    /*  //innjection through constructor
        @Autowired
        public Library(final LibraryDbController libraryDbController) {
            this.libraryDbController = libraryDbController;
        }

        public Library() {

        }
    */

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
