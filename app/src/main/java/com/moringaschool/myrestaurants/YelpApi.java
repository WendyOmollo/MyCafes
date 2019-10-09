package com.moringaschool.myrestaurants;

public interface YelpApi {
    @GET("businesses/search")
    Call<YelpBusinessSearchResponse> getRestaurants(
            @Query("location") String location,
            @Query("term") String term
    );
}
