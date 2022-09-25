package dao;

/*
** @author LiGuanda
** @date  PM 3:11:45
** @description This is a description of Employee
** @params
** @return
** @since version-1.0  */



/**
 * @author Lenovo
 */
public class Employee {


    private String username;
    private String password;
    private Integer id;


    public Employee() {
    }


    public Employee(String username, String password, int id) {

        this.username = username;
        this.password = password;
        this.id = id;

    }


    public void setUsername(String username) {

        this.username = username;

    }


    public void setPassword(String password) {

        this.password = password;

    }


    public void setId(int id) {

        this.id = id;

    }


    public String getUsername() {

        return username;

    }


    public String getPassword() {

        return password;

    }


    public Integer getId() {

        return id;

    }


    @Override
    public String toString() {

        return "Employee{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';

    }


}
