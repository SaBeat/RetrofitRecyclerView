package com.example.nestedrecyclerview;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("posts")
    Call<List<Post>> getPost();
}
