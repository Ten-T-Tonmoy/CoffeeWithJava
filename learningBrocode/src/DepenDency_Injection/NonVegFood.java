package DepenDency_Injection;

public class NonVegFood implements Ingredients{
    @Override
    public void preparing(){
        System.out.println("Preparing Ingredients for Nonvegfoods");
    }

    @Override
    public void cooking(int servings){
        System.out.println("Cooking NonVeg foods");
        System.out.println("For servings of :"+servings);
    }
}
