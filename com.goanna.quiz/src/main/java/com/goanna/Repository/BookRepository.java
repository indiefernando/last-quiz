package com.goanna.Repository;


import com.goanna.Entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {

    int insertBook(Book book);

    List<Book> getAllBooks();

    Book SelectById(int id);



}