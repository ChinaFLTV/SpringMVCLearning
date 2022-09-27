package dao;

/*
 ** @author LiGuanda
 ** @date  PM 3:07:03
 ** @description This is a description of EmployeeDAO
 ** @params
 ** @return
 ** @since version-1.0  */


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 */
@Repository
public class EmployeeDAO {


    public static Map<Integer, Employee> employees;

    static {

        employees = new HashMap<>();
        employees.put(1, new Employee("JuJingyi", "123456", 1));
        employees.put(2, new Employee("IU", "1234", 2));
        employees.put(3, new Employee("Dage", "123", 3));

    }

    public static int initID = 1006;

    public void save(Employee employee) {

        if (employee.getId() == null) {

            employee.setId(initID++);

        }
        employees.put(employee.getId(), employee);

    }


    public Collection<Employee> getAll() {

        return employees.values();

    }


    public Employee get(Integer id) {

        return employees.get(id);

    }


    public void delete(Integer id) {

        employees.remove(id);

    }


}
