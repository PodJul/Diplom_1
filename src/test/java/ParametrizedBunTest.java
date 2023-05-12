import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedBunTest {
    private final String name;
    private final float price;
    private final String expectedName;
    private final String expectedPrice;

        public ParametrizedBunTest(String name, String expectedName,float price, String expectedPrice) {
        this.name = name;
        this.price = price;
        this.expectedName=expectedName;
        this.expectedPrice=expectedPrice;
    }
    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][]{
                {"black bun", "This name is great!",100, "It's a good price."},
                {"", "This name isn't available!",0, "This price isn't available!"},
                {null, "This name isn't available!",10000000, "This price isn't available!"},
                {"fffffffffffffffffffffffffffffff", "This name isn't available!",-1/5,"This price isn't available!"},
                {"!@#$%^^&*", "This name isn't available!",-200, "This price isn't available!"},
                {"САМАЯ ВКУСНАЯ БУЛОЧКА", "This name isn't correct!",1/2, "This price isn't enough!"},

        };
    }
    @Test
        public void getBunNameTest() {
            Bun bun = new Bun(name,price);
            String actualBunName = bun.getName();
            assertEquals(name, actualBunName);
            System.out.println ("Bun name is " + bun.getName()+"."+expectedName);
        }
    @Test
    public void getBunPriceTest() {
        Bun bun = new Bun(name,price);
        Float actualBunPrice = bun.getPrice();
        assertEquals(price, (double) actualBunPrice,0);
        System.out.println (bun.getPrice()+". "+ expectedPrice);}
    }