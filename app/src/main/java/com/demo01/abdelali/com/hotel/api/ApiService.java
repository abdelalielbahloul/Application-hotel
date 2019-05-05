package com.demo01.abdelali.com.hotel.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    // get tous les infos
    @GET("http://ista2018.000webhostapp.com/apis2.php?x=12")  //Path de l'api

    Call<PostResponse> getAllPosts();

    // get les info par nom
    @GET("http://ista2018.000webhostapp.com/apis2.php?x=12&nom)")

    Call<PostResponse> getPost(
            @Path("nom") String getNom
    );
}
