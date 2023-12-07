package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CarController {

    public CarService carService;
    @PostMapping("/add")
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @GetMapping("/allCars")
    public List<Car> getCars(){
        return carService.getCars();
    }

}
