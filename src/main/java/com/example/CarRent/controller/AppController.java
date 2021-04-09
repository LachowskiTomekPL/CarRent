package com.example.CarRent.controller;

import com.example.CarRent.client.RestClient;
import com.example.CarRent.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class AppController {

    private RestClient restClient;

    @Autowired
    public AppController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping(value = "/")
    public String goToIndex(Model model){

        final Car[] cars = restClient.getCars();
        final List<Car> carsList = Arrays.asList(cars);

        model.addAttribute("cars",carsList);

        return "index";
    }

}
