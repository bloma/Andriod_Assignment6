package com.example.aphish.movie_rental.factories;

import com.example.aphish.movie_rental.domain.Cash;
import com.example.aphish.movie_rental.domain.Credit;
import com.example.aphish.movie_rental.domain.PaymentType;

/**
 * Created by Aphish on 2016/04/17.
 */
public class CashFactory {
    private static CashFactory factory = null;

    private CashFactory(){}

    public static CashFactory getInstance(){
        if (factory == null)
            factory = new CashFactory();
        return factory;
    }

    public PaymentType getPaymentType(String value,double money,String name,String cardNumber){
        if ("".equalsIgnoreCase(value)){
            return new Cash
                    .Builder()
                    .cashPayed(money)
                    .build();
        }else {
            return new Credit
                    .Builder()
                    .cardHolderName(name)
                    .cardNumber(cardNumber)
                    .Amount(money)
                    .build();
        }
    }

    public Cash createCash(double money,String date){
        Cash cash = new Cash
                .Builder()
                .cashPayed(money)
                .date(date)
                .build();
        return cash;
    }
}
