package com.amalitech;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/**
 * Hello world!
 *
 */
public class RxJavaExample
{
    public static void main( String[] args )
    {
        Observable<Integer> stockPrices = Observable.just(100, 102, 105, 110, 108, 115);

        stockPrices
                .map(price -> price + 1)
                .filter(price -> price > 105)
                .subscribe( System.out::println,
                        Throwable::printStackTrace ,
                        ()-> System.out.println("Stream completed"));
    }
}
