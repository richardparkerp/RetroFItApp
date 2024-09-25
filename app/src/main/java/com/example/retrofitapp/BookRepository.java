package com.example.retrofitapp;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books;

    BookRepository(){
        books = new ArrayList<>();
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public void addBook(Book book){
        books.add(book);
    }

}
