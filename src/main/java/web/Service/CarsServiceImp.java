package web.Service;

import web.Model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarsServiceImp implements CarsService {

    private List<Cars> allCars = new ArrayList<>();

    public CarsServiceImp() {
        allCars.add(new Cars("Peugeot", 308, "rt5665657hg"));
        allCars.add(new Cars("Opel", 111, "mn46457476km7lb6k"));
        allCars.add(new Cars("Nissan", 222, "eu59385893475j"));
        allCars.add(new Cars("Toyota", 333, "dgt56566gg57hg"));
        allCars.add(new Cars("Citroen", 444, "yy56767657hg"));
    }


    @Override
    public List<Cars> getListOfAllCars() {
        return allCars;
    }

    @Override
    public List<Cars> getQuantityOfCars(Integer carsQuantity) {

        if ((carsQuantity == null) || ((carsQuantity+1) > allCars.size())) {
            carsQuantity = allCars.size();
        }

        return allCars.stream().limit(carsQuantity).collect(Collectors.toList());
    }
}
