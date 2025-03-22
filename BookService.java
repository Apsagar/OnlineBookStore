package com.example.SpringProject.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringProject.Entity.Book;
import com.example.SpringProject.Repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // New: Bulk Book Addition
    public List<Book> addBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
