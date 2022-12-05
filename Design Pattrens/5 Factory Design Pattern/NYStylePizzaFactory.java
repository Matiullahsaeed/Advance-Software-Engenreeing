public class NYStylePizzaFactory extends PizzaStore
{
    public  Pizza createPizza(Pizza pizza)
    {
    
        {
            if (pizza.equals(pizza))
            {
                pizza = new GreekPizza();
            }
            if (pizza.equals(pizza))
            {
                pizza = new CheesePizza();
            }
    
            return pizza;
        }
    }
}