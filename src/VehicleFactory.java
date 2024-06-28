public class VehicleFactory {
    public Vehicle getVehicle(String typeOfVehicle){
        if("Car"==typeOfVehicle) return new Car("Prajit",100);
        else if("Bike"==typeOfVehicle) return new Bike("Rajesh",200);
        return new nullVehicle();
    }
}
