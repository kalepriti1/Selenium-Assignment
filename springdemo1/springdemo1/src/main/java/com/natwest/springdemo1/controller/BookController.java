package com.natwest.springdemo1.controller;

import com.natwest.springdemo1.modal.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Library")
public class BookController {
    ArrayList<Book> books;
    public BookController(){
        books = new ArrayList<>();
        books.add(new Book(22,"Title","author","2375y297"));
    }
    @GetMapping("/title")
    public String getTitle(){
        return "Title of the book";
    }
    @GetMapping("/author")
    public String getAuthor(){
        return "A.k";
    }
    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        books.add(book);
        return book;
    }
    @GetMapping("/books")
    public List<Book> getBooks(){
        return books;
    }
    @GetMapping("/book")
    public Book  getBook(){
        return new Book(22,"Title","author","2375y297");
    }
    @GetMapping("id")
    public Optional<Book> getBookByiD(@RequestParam int id){
        return books.stream().filter((b) -> b.getId() == id).findFirst();
    }

}
