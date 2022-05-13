package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/car")
    public String printCar ( @RequestParam(value = "count",required = false,defaultValue = "5") int count , Model model) {
        List<Car> list = CarServiseImpl.spisokCar(count);
        model.addAttribute("list", list);

        return "car";

    }
}
