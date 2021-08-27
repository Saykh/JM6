package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> carList = new ArrayList<>();


    public CarService() {
        carList.add(new Car("BMW", "nice", 1));
        carList.add(new Car("Ford", "beautiful", 2));
        carList.add(new Car("Lada", "bad", 3));
        carList.add(new Car("Kamaz", "strong", 4));
        carList.add(new Car("Audi", "good", 5));
    }

    public List<Car> getCars() {
        return carList;
    }

    public List<Car> getCarsOfCount(@RequestParam(value = "count", required = false) Integer integer) {
        return carList.stream().limit(integer).collect(Collectors.toList());
    }
}