package com.example.aphish.movie_rental.factories;

import com.example.aphish.movie_rental.domain.Customers;

/**
 * Created by Aphish on 2016/04/17.
 */
public class CustomersFactory {

    private static CustomersFactory factory = null;

    private CustomersFactory(){}

    public static CustomersFactory getInstance(){
        if (factory == null)
            factory = new CustomersFactory();
        return factory;
    }

    public Customers createCustomers(String name,String surname,String age){
        Customers customers = new Customers
                .Builder()
                .customerName(name)
                .customeruSurname(surname)
                .customerAge(age)
                .build();
        return customers;
    }
}
