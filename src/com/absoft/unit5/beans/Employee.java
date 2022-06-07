package com.absoft.unit5.beans;

public class Employee {

    private String firstName; // имя
    private String lastName; // фамилия
    private int age; // возраст
    private String team; // команда
    private long salary; // зп
    private POSITION position; // позиция сотрудника

//    public Employee() {
//    }

    public Employee(String firstName, String lastName, int age, String team, POSITION position){
        this(firstName, lastName, age, team, 0, position);
    }

    public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position) {

        if (age < 18) {
            System.out.println("Incorrect age value");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;

        if (salary == 0) {
            salary = position.minSalary;
        }

        this.salary = salary;
        this.position = position;
    }


//    public void setFirstName(String firstName1) {
//        firstName = firstName1;
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getTeam() {
        return team;
    }

//    public void setTeam(String team) {
//        this.team = team;
//    }

    public long getSalary() {
        return salary;
    }

//    public void setSalary(long salary) {
//        this.salary = salary;
//    }

    public POSITION getPosition() {
        return position;
    }

//    public void setPosition(POSITION position) {
//        this.position = position;
//    }


    public static class Builder {

        private String firstName; // имя
        private String lastName; // фамилия
        private int age; // возраст
        private String team; // команда
        private long salary; // зп
        private POSITION position; // позиция сотрудника


        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder team(String team) {
            this.team = team;
            return this;
        }

        public Builder salary(long salary) {
            this.salary = salary;
            return this;
        }

        public Builder position(POSITION position) {
            this.position = position;
            return this;
        }

        public Employee build() {
            return new Employee(firstName, lastName, age, team, salary, position);
        }
    }
}