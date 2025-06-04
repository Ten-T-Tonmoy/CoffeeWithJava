package DepenDency_Injection;

public class injector {
    public static void main(String[] args){
        var kitchen=new Kitchen(new NonVegFood());
        kitchen.StartCooking(20);
    }
}
