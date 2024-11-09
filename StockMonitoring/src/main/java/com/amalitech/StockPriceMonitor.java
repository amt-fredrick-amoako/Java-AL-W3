package com.amalitech;

import com.amalitech.client.StockService;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class StockPriceMonitor {
    private static final String BASE_URL = "https://www.alphavantage.co/";

    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();

        StockService service = retrofit.create(StockService.class);

        service.getStockPrice("TIME_SERIES_INTRADAY", "IBM", "your_api_key")
                .map(response -> response.getLatestPrice())
                .subscribe(
                        price -> System.out.println("Current Price: " + price), // onNext
                        Throwable::printStackTrace, // onError
                        () -> System.out.println("Completed") // onComplete
                );
    }
}

