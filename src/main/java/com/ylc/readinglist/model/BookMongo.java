package com.ylc.readinglist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/6/8 10:51
 * @description: xxx
 * own:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookMongo {
    @Id
    private String id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
