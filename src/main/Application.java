package main;

import Pizza.Pizza;


public class Application {
    public static void main (String[] args){


        Pizza simplePizza = new Pizza("thin","halit","olive")
                .with("cheese")
                .with("tomato")
                .with("mushrooms")
                .with("   mushrooms   ")
                .with("meat")
                .without("olive");

        System.out.println( "IS pizza complete? " + simplePizza.isComplete() );
        System.out.println( simplePizza );

    }
}
