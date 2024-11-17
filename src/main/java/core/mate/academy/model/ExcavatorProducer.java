package core.mate.academy.model;

import java.util.List;
import core.mate.academy.service.MachineProducer;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator jsb = new Excavator("Name : jcb 3trx", "Color : yellow",
                2000,
                400);
        Excavator trx = new Excavator("Name : trx 800pro", "Color : red",
                2200,
                450);
        return List.of(jsb, trx);
    }
}
