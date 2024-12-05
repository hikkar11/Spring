package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.TypedQuery;
import java.util.List;

public class CarDaoImp implements CarDao {

    @Override
    public void add(Car car) {

    }

    @Override
    public List<Car> listCar() {
        return List.of();
    }
}
