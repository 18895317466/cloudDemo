package com.cloud.controller;

import com.cloud.client.IndexClient;
import com.cloud.client.MoviesClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ouyang on 2019/4/29.
 */
@RestController
public class MoviesController {

    private Logger logger = LoggerFactory.getLogger(MoviesController.class);

    @Autowired
    private MoviesClient moviesClient;
    @RequestMapping("movies-list")
    public String moviesList(){
        return moviesClient.list();
    }
}
