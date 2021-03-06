package com.example.rcossich.petagramrce.restApi;

import com.example.rcossich.petagramrce.restApi.model.InformacionUsuarioResponse;
import com.example.rcossich.petagramrce.restApi.model.MascotaResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by rcossich on 29/03/2017.
 */

public interface IEndpointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<MascotaResponse> getRecentMedia();
    //aca va por cada usuario a buscar su @GET
    @GET(ConstantesRestApi.URL_GET_USERS_QUERY0)
    Call<InformacionUsuarioResponse> getUsuariosBusqueda0();
    @GET(ConstantesRestApi.URL_GET_USERS_QUERY1)
    Call<InformacionUsuarioResponse> getUsuariosBusqueda1();
    //aca probamos uno con parametro
    @GET(ConstantesRestApi.URL_GET_USERS_QUERY)
    Call<InformacionUsuarioResponse> getUsuariosBusqueda(@Query("q") String usuario_a_buscar);
    //aca probamos la recent media con user-id
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER2)
    Call<MascotaResponse> getRecentMediaUserId(@Path("userid") String usuario_id);

}
