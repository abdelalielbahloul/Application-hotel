package com.demo01.abdelali.com.hotel.api;

import com.demo01.abdelali.com.hotel.models.post;

import java.util.List;

import retrofit2.http.POST;

public class PostResponse {

    private String erreur;
    private List<post> posts;

    public PostResponse(String erreur, List<post> posts) {
        this.erreur = erreur;
        this.posts = posts;
    }

    public String getErreur() {
        return erreur;
    }

    public void setErreur(String erreur) {
        this.erreur = erreur;
    }

    public List<post> getPosts() {
        return posts;
    }

    public void setPosts(List<post> posts) {
        this.posts = posts;
    }
}
