package com.example.tweet_api.service;

import com.example.tweet_api.entity.Tweet;

import java.util.*;

public interface TweetService {

    List<Tweet> getAllTweets();
    void addTweet(Tweet tweet);
}
