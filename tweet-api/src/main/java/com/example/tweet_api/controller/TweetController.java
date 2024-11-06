package com.example.tweet_api.controller;


import com.example.tweet_api.entity.Tweet;
import com.example.tweet_api.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  java.util.*;
@RestController
@RequestMapping("api")
public class TweetController {

    @Autowired
    private TweetService tweetService;

    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @GetMapping("/tweets")
    public List<Tweet> GetTweets(){
        return tweetService.getAllTweets();
    }

}
