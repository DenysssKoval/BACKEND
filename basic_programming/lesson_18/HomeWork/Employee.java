package HomeWork;

    public class Employee {
        private String name;
        private String department;
        private String company;

        public Employee(String name, String department, String company) {
            this.name = name;
            this.department = department;
            this.company = company;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public String getCompany() {
            return company;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", company='" + company + '\'' +
                    '}';
        }
    }




