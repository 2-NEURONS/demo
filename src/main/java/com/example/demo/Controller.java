package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
public class Controller
{
    @Autowired
    private ExpenseService expenseService;
    @RequestMapping("/expenses")
    List<Expense> expensesHandler()
    {
        return expenseService.getAllExpenses();
    }
    @RequestMapping("/expense/{id}")
    Expense expenseHandler(@PathVariable  int id)
    {
        return expenseService.getExpense(id);
    }
    @RequestMapping(method = RequestMethod.POST , value = "/expenses")
    void createHandler(@RequestBody Expense expense)
    {
        expenseService.createExpense(expense);
        //JOptionPane.showMessageDialog(null,"success!");
    }
    @RequestMapping(method = RequestMethod.PUT , value = "/expense/{id}")
    void editHandler(@RequestBody Expense expense , @PathVariable int id)
    {
        expenseService.edit(expense, id);
    }
    @RequestMapping(method = RequestMethod.DELETE , value = "/expense/{id}")
    void deleteHandler(@RequestBody Expense expense , @PathVariable int id)
    {
         expenseService.delete(expense , id);
    }

}
