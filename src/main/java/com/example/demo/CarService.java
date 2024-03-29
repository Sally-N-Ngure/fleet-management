package com.example.demo;
import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
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

    // GET single entity by ID
    public Car getSingleResident(Long id ){
        return carRepository.findById(id).orElseThrow();
    }

    // get all Resident
    public List<Car> getAllResidents(){
        return carRepository.findAll();
    }

    // delete resident
    public String deleteResident(Long id){
        carRepository.deleteById(id);
        return "User id: " + id + " deleted";
    }

}