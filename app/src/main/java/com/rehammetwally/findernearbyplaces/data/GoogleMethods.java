package com.rehammetwally.findernearbyplaces.data;

import com.rehammetwally.findernearbyplaces.model.NearbySearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleMethods {
    @GET("place/nearbysearch/json")
    Call<NearbySearch> getNearbySearch(
            @Query("location") String location,
            @Query("radius") String radius,
            @Query("type") String types,
            @Query("key") String key
    );
}
