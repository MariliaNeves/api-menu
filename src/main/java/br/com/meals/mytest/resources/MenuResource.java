package br.com.meals.mytest.resources;

import br.com.meals.mytest.resources.dto.Meal;
import br.com.meals.mytest.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by  Marília
 * Date: 21/04/2021
 */

@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = {"https://meals-front.herokuapp.com", "http://localhost:8080"},
methods = {RequestMethod.GET})
public class MenuResource {

    @Autowired
    private MenuService menuService;


    @GetMapping(value = "/meals")
    public ResponseEntity getMeals(){
        List<Meal> meals = menuService.getMeals();
        return ResponseEntity.status(HttpStatus.OK).body(meals);
    }

    @GetMapping(value = "")
    public ResponseEntity work(){
        return ResponseEntity.status(HttpStatus.OK).body("It's work!");
    }
}
