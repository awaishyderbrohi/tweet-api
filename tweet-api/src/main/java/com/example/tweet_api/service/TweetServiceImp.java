package com.example.tweet_api.service;


import com.example.tweet_api.entity.Tweet;
import com.example.tweet_api.repository.TweetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetServiceImp implements TweetService{


    @Autowired
    private TweetRepo tweetRepo;

    public TweetServiceImp(TweetRepo tweetRepo) {
        this.tweetRepo = tweetRepo;
    }

    @Override
    public List<Tweet> getAllTweets() {
        return tweetRepo.findAll();
    }

    @Override
    public void addTweet(Tweet tweet) {
        tweetRepo.save(tweet);
    }
}
