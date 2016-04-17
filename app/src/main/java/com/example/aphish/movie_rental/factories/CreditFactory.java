package com.example.aphish.movie_rental.factories;

import com.example.aphish.movie_rental.domain.Cash;
import com.example.aphish.movie_rental.domain.Credit;
import com.example.aphish.movie_rental.domain.PaymentType;

/**
 * Created by Aphish on 2016/04/17.
 */
public class CreditFactory {
    private static CreditFactory factory = null;

    private CreditFactory(){}

    public static CreditFactory getInstance(){
        if (factory == null)
            factory = new CreditFactory();
        return factory;
    }

    public PaymentType getPaymentTYpe(String value,double money,String name,String cardNumber){
        if ("Credit".equalsIgnoreCase(name)){
            return new Credit
                    .Builder()
                    .Amount(money)
                    .cardHolderName(name)
                    .cardNumber(cardNumber)
                    .build();
        }else {
            return new Cash
                    .Builder()
                    .cashPayed(money)
                    .build();
        }
    }

    public Credit createCredit(String name,String cardNumber,String securityCode,String pin){
        Credit credit = new Credit
                .Builder()
                .cardHolderName(name)
                .cardNumber(cardNumber)
                .securityCode(securityCode)
                .pin(pin)
                .build();
        return credit;
    }
}
