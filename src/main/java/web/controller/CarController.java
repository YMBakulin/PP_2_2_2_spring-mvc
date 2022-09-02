package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Cars;
import web.Service.CarsService;
import web.Service.CarsServiceImp;

import java.util.List;

@Controller
public class CarController {

    @RequestMapping("/cars")
    public String printCars(@RequestParam(required = false) Integer count, ModelMap model) {
        CarsService carsService = new CarsServiceImp();

        List<Cars> listOfCars = carsService.getQuantityOfCars(count);
        model.addAttribute("listOfCars", listOfCars);
        return "cars";
    }

}
