package entity;

import java.io.Serializable;


public class Employee extends Entity implements Serializable {
    private String name;
    private String secondName;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (!getName().equals(employee.getName())) return false;
        if (!getSecondName().equals(employee.getSecondName())) return false;
        return !(getAge() != null ? !getAge().equals(employee.getAge()) : employee.getAge() != null);

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSecondName().hashCode();
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        return result;
    }
}
