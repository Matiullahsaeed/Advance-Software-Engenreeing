public abstract class PizzaStore 
{
    public void Order(Pizza pizza)
    {
        pizza = createPizza(pizza);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public abstract Pizza createPizza(Pizza pizza);
}
