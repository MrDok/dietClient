package com.home.models;

import java.io.Serializable;

/**
 * Created by user on 28.05.2017.
 */

public class Recipe implements Serializable{
    private Long id;
    private RecipeGroup group;
    private String name;
    private String description;

    public Recipe(){
    }

    public Recipe(RecipeGroup group, String name, String description){
        this.group = group;
        this.name = name;
        this.description = description;
    }

    public Long getId(){
        return id;
    }

    private void setId(Long id){
        this.id = id;
    }

    public RecipeGroup getGroup(){
        return group;
    }

    public void setGroup(RecipeGroup group){
        this.group = group;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return "Recipe{" +
                "id=" + id +
                ", group=" + group +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
