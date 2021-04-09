package com.example.CarRent.client;

import com.example.CarRent.CarRentApplication;
import com.example.CarRent.model.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class RestClientTest {


    private static RestClient restClient;

    @BeforeAll
    public static void init(){
        restClient = new RestClient();
    }

    @Test
    void getCar() {

        String urlToService = "http://localhost:8080/car/1";

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(urlToService, Car.class);


    }

    @Test
    void getCars(){

        restClient.getCars();

    }
}