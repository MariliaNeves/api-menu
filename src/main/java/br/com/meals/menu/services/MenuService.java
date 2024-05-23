package br.com.meals.menu.services;

import br.com.meals.menu.resources.dto.Meal;
import br.com.meals.menu.resources.dto.Menu;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by  Marília
 * Date: 21/04/2021
 */
@Service
public class MenuService {

    private static final String URL = "https://www.themealdb.com/api/json/v1/1/search.php?s=";

    public List<Meal> getMeals(){
        RestTemplate restTemplate = new RestTemplate();
        List<Meal> mealList = restTemplate.getForEntity(URL, Menu.class).getBody().getMealList();
        return mealList;
    }

}
