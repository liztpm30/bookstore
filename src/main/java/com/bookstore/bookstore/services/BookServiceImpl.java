package com.bookstore.bookstore.services;

import com.bookstore.bookstore.models.Book;

import com.bookstore.bookstore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        return bookRepository.findBookById(id);
    }
    @Override
    public List<Book> searchTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchAuthor(String author) {
        return null;
    }

}