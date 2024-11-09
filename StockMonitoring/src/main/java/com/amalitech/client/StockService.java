package com.amalitech.client;

import com.amalitech.model.StockResponse;
import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StockService {
    @GET("query")
    Observable<StockResponse> getStockPrice(
            @Query("function") String function,
            @Query("symbol") String symbol,
            @Query("apikey") String apikey
    );
}
