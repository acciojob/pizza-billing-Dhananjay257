package com.driver;

public class DeluxePizza extends Pizza {
static int sum;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }
}
