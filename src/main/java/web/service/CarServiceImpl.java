package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Renault", "grey", 3, 2.0));
        cars.add(new Car("Chevrolet", "green", 8, 2.5));
        cars.add(new Car("Ford", "black", 2, 1.8));
        cars.add(new Car("Fiat", "white", 1, 3.0));
        cars.add(new Car("Daewoo", "red", 2, 1.2));
    }

    @Override
    public List<Car> checkNumber(Integer count) {
        if (count == 0 || count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());

            }
        }
    }


