package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void listEmployees() {
        System.out.println("Компания: " + name);
        for (int i = 0; i < departments.size(); i++) {
            departments.get(i).listEmployees();
        }
    }

}
