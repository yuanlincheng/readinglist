package com.ylc.readinglist.repository;

import com.ylc.readinglist.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/6/9 12:14
 * @description: xxx
 * own:
 */
public interface ReaderRepository extends JpaRepository<Reader,String> {
}
