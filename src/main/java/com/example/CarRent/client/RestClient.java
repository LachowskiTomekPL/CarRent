package com.example.CarRent.client;

import com.example.CarRent.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {
    private final String urlToService = "http://localhost:8080";


    public void getCar(int carId){
        String endpoint = "/car/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(String.format("%s%s%d",urlToService,endpoint,carId), Car.class);
    }

    public Car[] getCars(){
        String endpoint = "/car";
        RestTemplate restTemplate = new RestTemplate();


        final ResponseEntity<Car[]> cars = restTemplate.getForEntity(String.format("%s%s", urlToService, endpoint), Car[].class);
        return cars.getBody();

    }
}
