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
        System.out.println(count);
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMV",4531,6));
        list.add(new Car("Mercedes",54324,7));
        list.add(new Car("Lamborghini SE",590067,8));
        list.add(new Car("Lamborghini S31",5900567,8));
        list.add(new Car("Lamborghini Dorsoventral",590222067,8));
        list = list.stream().limit(count).collect(Collectors.toList());
        model.addAttribute("list", list);

        return "car";

    }
}
