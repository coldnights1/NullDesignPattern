public class nullVehicle implements  Vehicle{
    String name;
    Integer capacity;
    nullVehicle(){
        //default behavior
        this.name=null;
        this.capacity=0;
    }
    public Integer getCapacity(){
        return this.capacity;
    }
}
