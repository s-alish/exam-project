package org.example.examproject.service;

import org.example.examproject.entity.Car;
import org.example.examproject.repository.CarRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public Car updateCar(Long id, Car updatedCar) {
        return carRepository.findById(id).map(car -> {
            car.setMake(updatedCar.getMake());
            car.setModel(updatedCar.getModel());
            car.setManufactureYear(updatedCar.getmanufactureYear());
            car.setPrice(updatedCar.getPrice());
            car.setColor(updatedCar.getColor());
            car.setStatus(updatedCar.getStatus());
            return carRepository.save(car);
        }).orElseThrow(() -> new RuntimeException("Car not found with id " + id));
    }
}

