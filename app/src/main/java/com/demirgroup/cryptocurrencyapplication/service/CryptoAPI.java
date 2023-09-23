package com.demirgroup.cryptocurrencyapplication.service;

import com.demirgroup.cryptocurrencyapplication.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    //
    @GET("api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false")
    Call<List<CryptoModel>> getData();
}
