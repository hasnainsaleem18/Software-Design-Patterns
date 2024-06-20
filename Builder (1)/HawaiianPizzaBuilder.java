
class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        pizza = new Pizza();
    }

    
    public void buildDough() {
        pizza.setDough("cross");
    }

    
    public void buildSauce() {
        pizza.setSauce("mild");
    }

    
    public void buildTopping() {
        pizza.setTopping("ham and pineapple");
    }

    
    public Pizza getPizza() {
        return pizza;
    }
}
