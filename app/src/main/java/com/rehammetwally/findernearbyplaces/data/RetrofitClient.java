package com.rehammetwally.findernearbyplaces.data;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private final static String GOOGLE_BASE_URL = "https://maps.googleapis.com/maps/api/";

    public static GoogleMethods googleMethods() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GOOGLE_BASE_URL)
                .client(new OkHttpClient().newBuilder().build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(GoogleMethods.class);
    }
}
