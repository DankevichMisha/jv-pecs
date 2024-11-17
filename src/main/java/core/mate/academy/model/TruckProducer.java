package core.mate.academy.model;

import java.util.List;
import core.mate.academy.service.MachineProducer;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck volvo = new Truck("Name : Volvo CR900" , "Color : Blue", 2000,
                "diesel");
        Truck man = new Truck("Name : Man RY200", "Color : Black", 1900, "diesel");
        return List.of(volvo, man);
    }
}
