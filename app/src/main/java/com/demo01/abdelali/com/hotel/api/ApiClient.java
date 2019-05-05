package com.demo01.abdelali.com.hotel.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String API_BASE_URL="http://ista2018.000webhostapp.com/apis2.php?x=12";
    private static Retrofit.Builder getRetrofitInstance(){

        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(API_BASE_URL);

    }

    public static ApiService getService(){
        return getRetrofitInstance().build().create(ApiService.class);
    }
}
