package com.ylc.readinglist.controller;

import com.ylc.readinglist.model.BookMongo;
import com.ylc.readinglist.repository.BookMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/6/14 23:47
 * @description: xxx
 * own:
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMongoRepository bookMongoRepository;

    @GetMapping("/add/{reader}")
    public String addBook(@PathVariable("reader") String reader) {
        BookMongo book = new BookMongo();
        book.setReader(reader);
        bookMongoRepository.save(book);
        return "book add success";
    }

    @GetMapping("/{reader}")
    public String queryBookByReader(@PathVariable("reader") String reader) {
        BookMongo book = bookMongoRepository.findByReader(reader);
        return "book 的数据为: " + book.toString();
    }
}
