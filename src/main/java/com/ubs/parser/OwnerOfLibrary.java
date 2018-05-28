package com.ubs.parser;

import java.util.List;

public class OwnerOfLibrary {

    public String getLibraryOwner() {
        return Library;
    }

    public List<Books>  getBooks() {
        return BOOKS;
    }

    public String Library = null;
    public List<Books> BOOKS = null;

    @Override
    public String toString() {
        return "OwnerOfLibrary [ Library: " + Library + " List Size: " + BOOKS.size();
    }
}
