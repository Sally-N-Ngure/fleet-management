package com.example.demo.controller;

import com.example.demo.service.CarService;
import com.example.demo.model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CarController {
    public CarService carService;

    // Constructor injection for service class
    public CarController(CarService carService){
        super();
        this.carService = carService;
    }

    // Add single car
    @PostMapping("/add")
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    //add multiple cars
    @PostMapping("/addCars")
    public List<Car> addCars(@RequestBody List<Car> cars){
        return carService.addCars(cars);
    }

    //Fetch single car based on car id
    @GetMapping("/car/{id}")
    public Car getCarById(@PathVariable Long id){
        return carService.getCarById(id);
    }

    // Fetch car based on Name
    @GetMapping("/carName")
    public List<Car> getByName(String name){
        return carService.getCarByName(name);
    }

    // Fetch list of cars
    @GetMapping("/allCars")
    public List<Car> getCars(){
        return carService.getCars();
    }

    //delete single car by Id of the car
    @DeleteMapping("delete/{id}")
    public String deleteCar(@PathVariable Long id){
        return carService.deleteCar(id);
    }

    // delete all cars in database
    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        return carService.deleteAllCars();
    }

}
