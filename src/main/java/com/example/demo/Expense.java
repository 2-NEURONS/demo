package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Expense
{
    @Id
    private int id;
    private String category;
    private double cost;


    public Expense(int id, String category, double cost)
    {
        this.id = id;
        this.category = category;
        this.cost = cost;
    }
    public String getCategory()
    {
        return category;
    }
    public int getId()
    {
        return id;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }


}
