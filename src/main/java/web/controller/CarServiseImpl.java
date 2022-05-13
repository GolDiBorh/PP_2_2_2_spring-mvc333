package web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiseImpl implements CarService{
    public static List<Car> spisokCar (int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMV",4531,6));
        list.add(new Car("Mercedes",54324,7));
        list.add(new Car("Lamborghini SE",590067,8));
        list.add(new Car("Lamborghini S31",5900567,8));
        list.add(new Car("Lamborghini Dorsoventral",590222067,8));
        list = list.stream().limit(count).collect(Collectors.toList());
        return list;
    }
}
