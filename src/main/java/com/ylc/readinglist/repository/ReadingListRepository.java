package com.ylc.readinglist.repository;

import com.ylc.readinglist.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/6/9 12:14
 * @description: xxx
 * own:
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
