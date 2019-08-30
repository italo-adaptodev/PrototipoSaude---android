package com.agendaSaudeOn.API_classes;import retrofit2.Retrofit;import retrofit2.converter.gson.GsonConverterFactory;public class RetrofitClient {    private static final String Base_url = "http://177.21.11.149:89/SaudeOnApi/public/";    private static final String local_url = "http://10.0.2.2/SaudeOnApi/public/";    private static RetrofitClient instancia;    private Retrofit retrofit;   /* private RetrofitClient() {        retrofit = new Retrofit.Builder()                .baseUrl(Base_url)                .addConverterFactory(GsonConverterFactory.create())                .build();    }*/    private RetrofitClient() {        retrofit = new Retrofit.Builder()                .baseUrl(local_url)                .addConverterFactory(GsonConverterFactory.create())                .build();    }    public static synchronized RetrofitClient getInstance(){        if(instancia==null){            instancia = new RetrofitClient();        }        return instancia;    }    public IApi getApi() {        return retrofit.create(IApi.class);    }}