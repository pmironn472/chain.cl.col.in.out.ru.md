package Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<String> ingredients;

    public Pizza() {
        this.ingredients = new ArrayList<>();
    }

    public Pizza(String dough, String salt, String oil) {
        this();
        if (dough.equals("thin") || dough.equals("thick")) {
            this.ingredients.add(dough);
        } else
            System.err.println("You can't add 2 or more of main ingredient in  pizza , or the main ingredient is incorrect");


        if (salt.equals("iodized") || salt.equals("halit")) {

            this.ingredients.add(salt);

        } else
            System.err.println("You can't add 2 or more of main ingredient in  pizza, or the main ingredient is incorrect");

        if (oil.equals("sunflower") || oil.equals("olive")) {

            this.ingredients.add(oil);
        } else
            System.err.println("You can't add 2 or more of main ingredient in  pizza, or the main ingredient is incorrect");


    }


    public Boolean isComplete() {

        return this.ingredients.size() >= 4;

    }

    // CHAINING METHODS
    public Pizza with(String ingredient) {


        if (this.ingredients.contains(ingredient.trim())) {
            System.err.println("You can't add the same ingredients 2 or more times ");

        } else
            this.ingredients.add(ingredient);


        return this;
    }


    public Pizza without(String ingredient) {
        String[] s = {"thin", "thick", "iodized", "halit", "sunflower", "olive",};
        if (this.ingredients.contains(ingredient)) {
            for (String value : s) {
                if (ingredient.equals(value)) {
                    System.err.println("You cant delete the main " + ingredient + " ingredient of pizza");
                }
            }
        } else {
            this.ingredients.remove(ingredient);
        }
        return this;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "ingredients=" + ingredients +
                '}';
    }
}