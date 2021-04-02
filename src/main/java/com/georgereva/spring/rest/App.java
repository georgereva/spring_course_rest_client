package com.georgereva.spring.rest;

import com.georgereva.spring.rest.configuration.MyConfig;
import com.georgereva.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee emByID = communication.getEmployee(1);
        System.out.println(emByID);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(9);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(9);
    }
}
