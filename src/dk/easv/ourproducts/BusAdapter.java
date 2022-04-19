package dk.easv.ourproducts;

import dk.easv.theirproducts.Bus;

public class BusAdapter extends Vehicle {
    private Bus bus;

    public BusAdapter(Bus bus, Color color) {
        super(color);
    }

    @Override
    public double getTopSpeedInKilometersPerHour() {
        return Bus.topSpeedInMilesPerHour * 1.60934;
    }

    @Override
    public void honk() {
        System.out.println("*bus honk sounds*");
    }

    @Override
    public String getName() {
        return "Bus";
    }
}
