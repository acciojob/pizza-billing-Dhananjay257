package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isExtraCheeseAdded;//to check if cheese is added to avoid adding it multiple time when method is invoked
    boolean isExtraToppingsAdded; //to check if toppings are added to avoid adding it multiple time when method is invoked
    boolean isTakeAway;
    boolean isBillCreated; //to avoid multiple invokings and add in the parameter

    private int toppings; //toppings vary for veg n non veg
    public Pizza(Boolean isVeg){
        // your code goes here
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isBillCreated=false;
        this.isTakeAway=false;
        this.isVeg=isVeg;
        if(isVeg)
        {
            this.price=300;
            this.toppings=70;
        }
        else
        {
            this.price=400;
            this.toppings=120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded)
        {
            this.price+=80;
            isExtraCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded)
        {
            this.price+=this.toppings;
            isExtraToppingsAdded=true;
        }

    }
    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway)
        {
            this.price+=20;
            isTakeAway=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated)
        {
            if(isExtraCheeseAdded)
            {
                this.bill+="Extra Cheese Added: 80"+"\n";
            }
            if(isExtraToppingsAdded)
            {
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isTakeAway)
            {
                this.bill+="Paperbag Added: 20"+"\n";
            }
            this.bill+="Total Price: "+this.price;
            isBillCreated=true;
            return this.bill;
        }
        return this.bill;
    }
}

