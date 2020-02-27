package com.guarda.ethereum.rest;


import com.guarda.ethereum.models.items.ZecTxResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

interface ZecBookApi {

    @GET("address/{address}")
    Observable<ZecTxResponse> getAddress(
            @Path("address") String address,
            @Query("details") String details,
            @Query("page") int page,
            @Query("pageSize") int pageSize
    );

    @GET("tx/{hash}")
    Observable<ZecTxResponse> getOneTx(@Path("hash") String hash);

}