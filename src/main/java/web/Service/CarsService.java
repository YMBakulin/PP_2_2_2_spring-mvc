package web.Service;

import web.Model.Cars;

import java.util.List;

public interface CarsService {

    List<Cars> getListOfAllCars();
    List<Cars> getQuantityOfCars(Integer carsQuantity);
}
