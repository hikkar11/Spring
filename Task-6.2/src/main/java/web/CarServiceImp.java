package web;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Red", 2020),
            new Car("BMW", "Blue", 2019),
            new Car("Audi", "Black", 2021),
            new Car("Mercedes", "White", 2018),
            new Car("Ford", "Green", 2017)
    );

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
