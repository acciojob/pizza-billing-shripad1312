package com.driver;

public class Pizza {

    private int price=0;
    private int sum=0;
    private Boolean isVeg=false;
    private String bill;
    private boolean ischeeseadded=false;
    private boolean istopingsadded=false;
    private boolean istakeaway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg==true){
            this.price=300;
            this.sum+=300;
        }else{
            this.price=400;
            this.sum+=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.ischeeseadded==false){
            this.sum+=80;
            this.ischeeseadded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg==true){
           if(istopingsadded==false) {
               this.sum+=70;
               this.istopingsadded=true;
           }
        }else{
            if(istopingsadded==false) {
               this.sum+=120;
               this.istopingsadded=true;
            }
        }

    }

    public void addTakeaway(){
        // your code goes here
        this.sum+=20;
        istakeaway=true;
    }

    public String getBill(){
        // your code goes here

        if(this.isVeg==true){
            System.out.println("Base Price Of The Pizza: 300\n");
        }else{
            System.out.println("Base Price Of The Pizza: 400\n");
        }

        if(this.ischeeseadded==true){
            System.out.println("Extra Cheese Added: 80\n");
        }

        if(this.istopingsadded==true){
            if(this.isVeg==true){
                System.out.println("Extra Toppings Added: 70\n");
            }  else{
                System.out.println("Extra Toppings Added: 120\n");
            }
        }

        if(istakeaway==true){

            System.out.println("Paperbag Added: 20\n");
        }

        System.out.println("Total Price:"+sum+"\n");

        this.bill+=sum;
        return this.bill;
    }
}
