public class Car implements Vehicle{
    String name;
    Integer capacity;
    Car(String name,Integer capacity){
        this.name=name;
        this.capacity=capacity;
    }
    public Integer getCapacity(){
        return this.capacity;
    }
}
