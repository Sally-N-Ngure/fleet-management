package com.example.demo.service;

import com.example.demo.repository.CarRepository;
import com.example.demo.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {
    public CarRepository carRepository;

    //add new car (POST TO DB)
    public Car addCar(Car car){
        return carRepository.save(car);
    }

    //add multiple cars (POST TO DB)
    public List<Car> addCars(List<Car> cars){
        return carRepository.saveAll(cars);
    }

    // get single entity by ID (FETCH FROM DB)
    public Car getCarById(Long id ){
        return carRepository.findById(id).orElseThrow();
    }

    // search by car name (FETCH FROM DB)
    public List<Car> getCarByName(String name){
        return carRepository.findCarByName(name);
    }

    // get list of cars (FETCH FROM DB)
    public List<Car> getCars(){
        return carRepository.findAll();
    }

    // delete car  (DELETE FROM DB)
    public String deleteCar(Long id){
        carRepository.deleteById(id);
        return "car id: " + id + " deleted";
    }

    // CAUTION!!!!! This deletes everything from database (DELETE FROM DB)
    public String deleteAllCars(){
        carRepository.deleteAll();
        return "All cars delete from database";
    }

}
