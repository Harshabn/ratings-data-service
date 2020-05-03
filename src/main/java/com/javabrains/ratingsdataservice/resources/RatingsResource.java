package com.javabrains.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.ratingsdataservice.model.Rating;
import com.javabrains.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

	@RequestMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
		UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;
	}
}
