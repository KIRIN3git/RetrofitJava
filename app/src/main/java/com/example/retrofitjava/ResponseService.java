package com.example.retrofitjava;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ResponseService {
    @GET("users/{user}/repos")
    Call<List<ResponseData>> fetchReposList(@Path("user") String user, @Query("sort") String sort);
}

