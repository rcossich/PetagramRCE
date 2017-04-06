package com.example.rcossich.petagramrce.restApi.adapter;

import com.example.rcossich.petagramrce.restApi.ConstantesRestApi;
import com.example.rcossich.petagramrce.restApi.IEndpointsApi;
import com.example.rcossich.petagramrce.restApi.deserializer.InformacionUsuarioDeserializador;
import com.example.rcossich.petagramrce.restApi.deserializer.MascotaDeserializador;
import com.example.rcossich.petagramrce.restApi.model.InformacionUsuarioResponse;
import com.example.rcossich.petagramrce.restApi.model.MascotaResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rcossich on 29/03/2017.
 */

public class RestApiAdapter {

    public IEndpointsApi establecerConexionRestApiInstagram(Gson gson){
        HttpLoggingInterceptor logging =  new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .addInterceptor(logging);
        Retrofit retrofit = new Retrofit.Builder()
                .client(httpClient.build())
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(IEndpointsApi.class);
    }

    public Gson construyeGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaResponse.class, new MascotaDeserializador());
        return gsonBuilder.create();
    }

    public Gson construyeGsonDeserializadorBusquedaUsuarios(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(InformacionUsuarioResponse.class, new InformacionUsuarioDeserializador());
        return gsonBuilder.create();
    }
}
