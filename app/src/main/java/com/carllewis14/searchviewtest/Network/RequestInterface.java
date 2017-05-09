package com.carllewis14.searchviewtest.Network;

import com.carllewis14.searchviewtest.POJO.JSONResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Request interface @GET
 */

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
