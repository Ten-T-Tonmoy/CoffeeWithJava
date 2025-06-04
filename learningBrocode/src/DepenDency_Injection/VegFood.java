package DepenDency_Injection;

public class VegFood implements Ingredients{

    @Override
    public void preparing(){
        System.out.println("Preparing Ingredients for vegfoods");
    }

    @Override
    public void cooking(int servings){
        System.out.println("Cooking Veg foods");
        System.out.println("For servings of :"+servings);
    }
}
