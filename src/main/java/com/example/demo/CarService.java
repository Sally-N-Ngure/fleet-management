package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    public CarRepository carRepository;

    //add new car
    public Car addCar(Car car){
        return carRepository.save(car);
    }

    // get cars
    public List<Car> getCars(){
        return carRepository.findAll();
    }


}
