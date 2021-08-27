package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer integer, ModelMap modelmap) {
        if (integer == null || integer >= 5) {
            modelmap.addAttribute("cars", carService.getCars());
        } else {
            modelmap.addAttribute("cars", carService.getCarsOfCount(integer));
        }
        return "cars";
    }
}