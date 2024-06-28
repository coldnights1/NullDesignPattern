public class Bike implements Vehicle {
    String name;
    Integer capacity;
    Bike(String name,Integer capacity){
        this.name=name;
        this.capacity=capacity;
    }
    public Integer getCapacity(){
        return this.capacity;
    }
}
