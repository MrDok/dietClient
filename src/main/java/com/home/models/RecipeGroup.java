package com.home.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by user on 28.05.2017.
 */

public class RecipeGroup implements Serializable{
    private Long id;
    private String name;
    private List<Recipe> recipes;

    public RecipeGroup(){
    }

    public RecipeGroup(String name, List<Recipe> recipes){
        this.name = name;
        this.recipes = recipes;
    }

    public Long getId(){
        return id;
    }

    private void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "RecipeGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", recipes=" + recipes +
                '}';
    }
}
