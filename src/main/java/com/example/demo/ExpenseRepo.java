package com.example.demo;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepo extends CrudRepository<Integer , ID>
{

}
