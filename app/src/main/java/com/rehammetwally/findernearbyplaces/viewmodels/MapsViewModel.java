package com.rehammetwally.findernearbyplaces.viewmodels;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.rehammetwally.findernearbyplaces.data.GoogleMethods;
import com.rehammetwally.findernearbyplaces.data.RetrofitClient;
import com.rehammetwally.findernearbyplaces.model.NearbySearch;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MapsViewModel extends AndroidViewModel {

    private GoogleMethods service;
    private static final String TAG = "MapsViewModel";

    public MapsViewModel(@NonNull Application application) {
        super(application);
        service = RetrofitClient.googleMethods();
    }

    public LiveData<NearbySearch> getNearBySearch(double latitude, double longitude, String nearByPlace) {
        final MutableLiveData<NearbySearch> data = new MutableLiveData<>();
        Call<NearbySearch> call = service.getNearbySearch(latitude + "," + longitude, String.valueOf(10000), nearByPlace, "AIzaSyCKUj2GHJmd1kW0_fKd_INqQDVSVzNSJuU");

        call.enqueue(new Callback<NearbySearch>() {
            @Override
            public void onResponse(Call<NearbySearch> call, Response<NearbySearch> response) {
                if (response.isSuccessful()) {
                    data.postValue(response.body());
                }
                Log.e(TAG, "onResponse: " + response);
            }

            @Override
            public void onFailure(Call<NearbySearch> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
        return data;
    }

}
