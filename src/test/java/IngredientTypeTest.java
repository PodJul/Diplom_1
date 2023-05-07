import praktikum.IngredientType;


public class IngredientTypeTest {

    public boolean IsIngredientTypeSauce(IngredientType type){
        return IngredientType.SAUCE.equals(type);
    }
    public boolean IsIngredientTypeFilling(IngredientType type){
        return IngredientType.FILLING.equals(type);}
}
