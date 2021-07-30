package com.goanna.Repository;

import com.goanna.Entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeBookDatabase implements BookRepository{

    private static List<Book> BOOKDATA = new ArrayList<>();


    @Override
    public int insertBook(Book book) {
        BOOKDATA.add(new Book(book.getId(), book.getName()));
        return 1;
    }



    @Override
    public List<Book> getAllBooks() {
        return BOOKDATA;
    }



    @Override
    public Book SelectById(int id) {

        Book found = null;

        for(Book book : BOOKDATA){
            if(book.getId() == id){
                found = book;
            }
        }

        return found;
    }
}