package com.example.prototipo2.API_classes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String Base_url = "http://10.10.3.197/PrototipoSaude/public/";
    private static RetrofitClient instancia;
    private Retrofit retrofit;

    private RetrofitClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance(){
        if(instancia==null){
            instancia = new RetrofitClient();
        }
        return instancia;
    }

    public API getApi(){
        return retrofit.create(API.class);
    }
}
