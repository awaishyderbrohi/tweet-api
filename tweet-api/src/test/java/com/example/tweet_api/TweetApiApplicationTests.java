package com.example.tweet_api;

import com.example.tweet_api.entity.Tweet;
import com.example.tweet_api.repository.TweetRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import  java.util.*;
@SpringBootTest
class TweetApiApplicationTests {

	@Autowired
	private TweetRepo tweetRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void addTweet(){
		Tweet tweet1 = Tweet.builder()
				.user("muhammadali")
				.content("Exploring the world, one line of code at a time!")
				.build();

		Tweet tweet2 = Tweet.builder()
				.user("sarahkhan")
				.content("Coffee + code = productivity boost! #DeveloperLife")
				.build();

		Tweet tweet3 = Tweet.builder()
				.user("johnsmith")
				.content("Just finished reading a fascinating book on machine learning.")
				.build();

		Tweet tweet4 = Tweet.builder()
				.user("emilyjones")
				.content("Nature walks are the best way to recharge and find inspiration.")
				.build();

		Tweet tweet5 = Tweet.builder()
				.user("michaelbrown")
				.content("Never underestimate the power of a good playlist!")
				.build();

		Tweet tweet6 = Tweet.builder()
				.user("amandalee")
				.content("Learning to cook one new recipe each week. Any suggestions?")
				.build();

		Tweet tweet7 = Tweet.builder()
				.user("robertdavis")
				.content("Pushing my boundaries in photography. Capturing moments is magical.")
				.build();

		Tweet tweet8 = Tweet.builder()
				.user("laurawatson")
				.content("Fitness goals: run a 5k by the end of the month! Let’s do this!")
				.build();

		Tweet tweet9 = Tweet.builder()
				.user("davidharris")
				.content("Gardening has been surprisingly therapeutic. Nature is healing.")
				.build();

		Tweet tweet10 = Tweet.builder()
				.user("jennifersmith")
				.content("Trying out different meditation techniques. Any recommendations?")
				.build();

		Tweet tweet11 = Tweet.builder()
				.user("kevinmartin")
				.content("Mastering new skills one step at a time. Progress feels great!")
				.build();

		Tweet tweet12 = Tweet.builder()
				.user("aliceroberts")
				.content("Just watched an amazing documentary. Love learning new things.")
				.build();

		Tweet tweet13 = Tweet.builder()
				.user("thomaswilliams")
				.content("Trying my hand at painting this weekend. Wish me luck!")
				.build();

		Tweet tweet14 = Tweet.builder()
				.user("karenjohnson")
				.content("Yoga in the morning is the best way to start the day!")
				.build();

		Tweet tweet15 = Tweet.builder()
				.user("brianwhite")
				.content("Writing a short story. Creativity feels so refreshing.")
				.build();

		Tweet tweet16 = Tweet.builder()
				.user("nataliegomez")
				.content("Volunteering at the local shelter today. Giving back feels great.")
				.build();

		Tweet tweet17 = Tweet.builder()
				.user("jasonking")
				.content("Just finished my first puzzle in years! Feels so satisfying.")
				.build();

		Tweet tweet18 = Tweet.builder()
				.user("dianarichards")
				.content("Road trip planning underway! Any must-see spots?")
				.build();

		Tweet tweet19 = Tweet.builder()
				.user("williammoore")
				.content("Grateful for family and friends. Every day is a blessing.")
				.build();

		Tweet tweet20 = Tweet.builder()
				.user("oliviascott")
				.content("Embracing a healthier lifestyle, one small change at a time!")
				.build();
	List<Tweet> tweets= List.of(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10,tweet11,
			tweet12,tweet13,tweet14,tweet15,tweet16,tweet17,tweet18,tweet19,tweet20);
		tweetRepo.saveAll(tweets);
	}

}
