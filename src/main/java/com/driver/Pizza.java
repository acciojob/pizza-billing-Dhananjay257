package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price+=300;
        }
        else
        {
            this.price+=400;
        }
        System.out.println("Base Price Of The Pizza: "+this.price);
    }

    public int getPrice(){
        return this.price;
    }

    boolean vis=true;
    public void addExtraCheese(){
        // your code goes here
        if(vis)
        {
            this.price+=80;
            System.out.println("Extra Cheese Added: 80");
            vis=false;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
        {
            this.price+=70;
            System.out.println("Extra Toppings Added: 70");
        }
        else
        {
            this.price+=120;
            System.out.println("Extra Toppings Added: 120");
        }

    }
    boolean paperbag=true;
    public void addTakeaway(){
        // your code goes here
        if(paperbag)
        {
            this.price+=20;
            System.out.println("Paperbag Added: 20");
            paperbag=false;
        }

    }

    public String getBill(){
        // your code goes here
        this.bill=String.valueOf(this.price);
        this.bill+="Total Price: "+this.bill;
        return this.bill;
    }
}
