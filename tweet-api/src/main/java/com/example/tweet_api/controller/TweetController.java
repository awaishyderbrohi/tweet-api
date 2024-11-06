package com.example.tweet_api.controller;


import com.example.tweet_api.entity.Tweet;
import com.example.tweet_api.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public void PostTweet(@RequestBody Tweet tweet){
        tweetService.addTweet(tweet);
    }

}
