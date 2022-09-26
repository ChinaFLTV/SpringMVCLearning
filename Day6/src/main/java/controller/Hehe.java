package controller;

/*
 ** @author LiGuanda
 ** @date  PM 2:46:44
 ** @description This is a description of Hehe
 ** @params
 ** @return
 ** @since version-1.0  */


import dao.Employee;
import dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * @author Lenovo
 */
@Controller
public class Hehe {


    @Autowired
    private EmployeeDAO employeeDAO;


    @RequestMapping("/heiheihei")
    public String hehe(Model model) {

        Collection<Employee> all = employeeDAO.getAll();
        model.addAttribute("employees", all);
        return "employeesOperate";

    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id) {

        employeeDAO.delete(id);
        return "redirect:/heiheihei";

    }


    @RequestMapping("/add")
    public String add() {

        System.out.println("Jumping to the add page!");
        return "add";

    }


    @RequestMapping(value = "heiha", method = RequestMethod.POST)
    public String submit(Employee employee, @RequestBody String body, RequestEntity<String> entity) {

        employeeDAO.save(employee);
        System.out.println("Save successfully!");
        System.out.println("RequestBody:" + body);
        System.out.println("Headers: " + entity.getHeaders());
        System.out.println("Body: " + entity.getBody());
        return "redirect:/heiheihei";

    }

    @GetMapping("/modify/{id}")
    public String modify(@PathVariable("id") Integer id, Model model) {

        Employee employee = employeeDAO.get(id);
        model.addAttribute("target", employee);
        return "modify";

    }


    @PostMapping("/xixi")
    public String xixi(Employee employee) {

        employeeDAO.save(employee);
        return "redirect:/heiheihei";

    }


    @RequestMapping("/aha")
    public void aha(HttpServletResponse response) throws IOException {

        response.getWriter().println("JuJingyi loves Dage!!!");

    }


    @RequestMapping("/hetui")
    @ResponseBody
    public String hetui() {

        return "<h1 style='color:red'>IU loves Dage!!!</h1>";

    }


}
