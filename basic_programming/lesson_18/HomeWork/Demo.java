package HomeWork;

public class Demo {
    public static void main(String[] args) {
        // Создаем компанию
        Company company = new Company("ABC Company");

        // Создаем отделы и добавляем их в компанию
        Department dep1 = new Department("Отдел продаж");
        Department dep2 = new Department("Отдел разработки");
        company.addDepartment(dep1);
        company.addDepartment(dep2);

        // Создаем сотрудников
        Employee emp1 = new Employee("Иванов Иван", dep1, company);
        Employee emp2 = new Employee("Петров Петр", dep1, company);
        Employee emp3 = new Employee("Сидоров Сидор", dep2, company);
        Employee emp4 = new Employee("Попов Алексей", dep2, company);

        // Добавляем сотрудников в отделы
        dep1.addEmployee(emp1);
        dep1.addEmployee(emp2);
        dep2.addEmployee(emp3);
        dep2.addEmployee(emp4);

        // Выводим список всех сотрудников компании
        company.listEmployees();
    }

}
