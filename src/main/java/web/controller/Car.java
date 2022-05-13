package web.controller;

import org.springframework.stereotype.Component;


@Component
public class Car {
    private String model;
    private int series;
    private int number;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", number=" + number +
                '}' ;
    }

    public Car(String model, int series, int number) {
        this.model = model;
        this.series = series;
        this.number = number;
    }
}
