package controller;

/*
 ** @author LiGuanda
 ** @date  PM 3:24:18
 ** @description This is a description of EmployeeController
 ** @params
 ** @return
 ** @since version-1.0  */


import dao.Employee;
import dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * @author Lenovo
 */
@Controller
public class EmployeeController {


    @Autowired
    public EmployeeDAO employeeDAO;


    @RequestMapping("/employee")
    public String getAll(Model model) {

        Collection<Employee> all = employeeDAO.getAll();
        model.addAttribute("employees", all);
        return "employees";

    }


}
