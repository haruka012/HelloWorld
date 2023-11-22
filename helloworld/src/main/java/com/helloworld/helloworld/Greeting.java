package com.helloworld.helloworld;

public class Greeting {
    private String country;
    private String greeting;

    public Greeting(String country, String greeting) {
        this.country = country;
        this.greeting = greeting;
    }
    public String getCountry(){
        return country;
    }

    public String getGreeting(){
        return greeting;
    }
}
