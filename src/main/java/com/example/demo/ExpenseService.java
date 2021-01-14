package com.example.demo;


import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.*;

@Service
public class ExpenseService
{

    //pretendDB
    private List<Expense> expenses = new ArrayList<>(Arrays.asList(
            new Expense(1,"braai",1000) ,
            new Expense(2,"Birthday",49) ,
            new Expense(3,"Cycling",55)
    ));
    //service method
    public List<Expense> getAllExpenses()
    {
        return expenses;
    }
    public Expense getExpense(int id)
    {

       return singleExpenseHelper(id);
    }
    public void createExpense(Expense expense)
    {
        expenses.add(expense);
    }
    public void edit(Expense expense , int id)
    {
        for(int index = 0 ;  index < expenses.size(); index ++)
        {
            if(expenses.get(index).getId() == id) expenses.set(index , expense);
        }
        //JOptionPane.showMessageDialog(null,"success!");
        return;
    }
    void delete(Expense expense , int id)
    {
        for(int index = 0 ;  index < expenses.size(); index ++)
        {
            if(expenses.get(index).getId() == id) expenses.remove(index);
        }

    }
    private Expense singleExpenseHelper(int id)
    {
        ListIterator<Expense> iterator = expenses.listIterator();

        while(iterator.hasNext())
        {
            if(iterator.next().getId() == id) return  iterator.next();
        }
       // JOptionPane.showMessageDialog(null,"success!");
        return null;
    }

}
