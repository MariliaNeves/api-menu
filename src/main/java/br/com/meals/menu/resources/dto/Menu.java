package br.com.meals.menu.resources.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Created by  Marília
 * Date: 21/04/2021
 */


public class Menu {

    @JsonProperty(value = "meals")
    private ArrayList<Meal> mealList;

    public ArrayList<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(ArrayList<Meal> mealList) {
        this.mealList = mealList;
    }

}
