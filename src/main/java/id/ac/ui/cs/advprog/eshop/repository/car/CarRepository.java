package id.ac.ui.cs.advprog.eshop.repository.car;
import id.ac.ui.cs.advprog.eshop.model.Car;
import java.util.List;

/**
 * Car Repository Interface
 */
public interface CarRepository {
    Car create(Car car);
    List<Car> findAll();
    Car findById(String id);
    Car update(String id, Car car);
    void delete(String id);
}