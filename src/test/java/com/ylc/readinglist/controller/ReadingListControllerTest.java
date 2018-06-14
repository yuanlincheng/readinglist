package com.ylc.readinglist.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/6/11 9:34
 * @description: xxx
 * own:
 */
@RunWith(SpringRunner.class)
//@WebMvcTest(ReadingListController.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ReadingListControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp(){
    }

    @Test
    public void readersBooks() throws Exception {
        mockMvc.perform(get("/readingList/abc")).andExpect(status().isOk()).andExpect(view().name("readingList")).andExpect(model().attributeExists("books"));
//                .andExpect(model().attribute("books",is(empty())));
    }

    @Test
    public void addToReadingList() {
    }
}