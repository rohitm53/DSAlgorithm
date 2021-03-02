package java8demos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8StreamApi {

    static class Employee {

        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        List<Employee> test = Arrays.asList(
                new Employee("Rohit Manohar",28),
                new Employee("Rahul",28),
                new Employee("Abhijeet",28),
                new Employee("Aritra",30),
                new Employee("Ashutosh",30),
                new Employee("Lalitha",30)
        );

        Map<Integer,List<Employee>> employeeMap=test.stream().collect(Collectors.groupingBy(Employee::getAge));

        System.out.println(employeeMap);

    }

}
