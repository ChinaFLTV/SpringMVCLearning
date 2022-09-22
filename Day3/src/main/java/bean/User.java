package bean;

/*
** @author LiGuanda
** @date  AM 10:55:34
** @description This is a description of User
** @params
** @return
** @since version-1.0  */



/**
 * @author Lenovo
 */
public class User {


    private String name;
    private String password;
    private String sex;
    private String age;


    public void setName(String name) {

        this.name = name;

    }


    public void setPassword(String password) {

        this.password = password;

    }


    public void setSex(String sex) {

        this.sex = sex;

    }


    public void setAge(String age) {

        this.age = age;

    }


    public String getName() {

        return name;

    }


    public String getPassword() {

        return password;

    }


    public String getSex() {

        return sex;

    }


    public String getAge() {

        return age;

    }


    @Override
    public String toString() {

        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';

    }


}
