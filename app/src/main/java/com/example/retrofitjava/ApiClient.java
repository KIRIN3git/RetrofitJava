package com.example.retrofitjava;

import android.util.Log;

import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    static String BASE_URL ="https://api.github.com/";
    static String ACCOUNT_NAME = "KIRIN3git";


    public static Retrofit restClient(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static Response<List<ResponseData>> fetchResponsLit(){
        ResponseService service = restClient().create(ResponseService.class);
        try {
            return service.fetchReposList(ACCOUNT_NAME, "desc").execute();
        }
        catch (Exception e){
            Log.w("DEBUG_DATA","e" + e.toString());
            return null;
        }
    }
}

