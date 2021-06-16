package com.practice.covidtrack.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apiinterface {

    String BASE_URL = "https://corona.lmao.ninja/v2/";

    @GET("countries")
    Call<List<CountryData>> getCountryData();

}
