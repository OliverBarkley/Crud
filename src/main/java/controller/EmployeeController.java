package controller;

import dao.EmployeeDAO;

import model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.annotation.WebServlet;
import java.util.List;

@Controller

public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        Employee newEmp = new Employee();
        model.addAttribute("allEmps", allEmployees);

        return "all";
    }



}


