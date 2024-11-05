package com.example.tweet_api.repository;

import com.example.tweet_api.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepo extends JpaRepository<Tweet, Long> {
}
