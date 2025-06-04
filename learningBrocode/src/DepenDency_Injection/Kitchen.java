package DepenDency_Injection;

//basically where we will inject the dependency
public class Kitchen {
    private Ingredients ingredients;

    public Kitchen(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public void StartCooking(int servings){
        ingredients.cooking(servings);
    }
}
