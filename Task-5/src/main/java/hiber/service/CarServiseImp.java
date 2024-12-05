package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiseImp implements CarServise {
    @Autowired
    private UserDao userDao;


    @Override
    public void add(Car car) {

    }

    @Override
    public List<Car> listCar() {
        return List.of();
    }
}
