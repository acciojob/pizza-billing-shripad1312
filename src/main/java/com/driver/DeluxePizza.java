package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
       // super.getPrice();
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
