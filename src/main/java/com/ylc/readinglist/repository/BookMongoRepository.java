package com.ylc.readinglist.repository;

import com.ylc.readinglist.model.BookMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/6/9 12:14
 * @description: xxx
 * own:
 */
public interface BookMongoRepository extends MongoRepository<BookMongo,Long> {
    BookMongo findByReader(String reader);
}
