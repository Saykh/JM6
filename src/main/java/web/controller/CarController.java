package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    CarService carService = new CarService();

    List<Car> carList = carService.getCars();


    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer integer, ModelMap modelmap) {
        modelmap.addAttribute("cars", carService.getCarsOfCount(carList,integer));

        return "cars";
    }
}