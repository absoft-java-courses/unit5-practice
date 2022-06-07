package com.absoft.unit5.beans;

public class EmployeeBuilder {

    private String firstName; // имя
    private String lastName; // фамилия
    private int age; // возраст
    private String team; // команда
    private long salary; // зп
    private POSITION position; // позиция сотрудника


    public EmployeeBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder age(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder team(String team) {
        this.team = team;
        return this;
    }

    public EmployeeBuilder salary(long salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder position(POSITION position) {
        this.position = position;
        return this;
    }

    public Employee build() {
        return new Employee(firstName, lastName, age, team, salary, position);
    }
}
