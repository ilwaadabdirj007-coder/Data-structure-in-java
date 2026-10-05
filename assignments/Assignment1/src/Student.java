public class Student {



        private int studentId;
        private String name;
        private int age;
        private String department;
        private double gpa;

        static String universityName = "Jamhuriya University";


        public Student(int studentId, String name, int age, String department, double gpa) {
            this.studentId = studentId;
            this.name = name;
            setAge(age);
            this.department = department;
            setGpa(gpa);
        }


        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
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
            if (age > 0 && age < 120) {
                this.age = age;
            } else {
                System.out.println("Invalid age for " + name + ". Defaulting to 18.");
                this.age = 18;
            }
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            if (gpa >= 0.0 && gpa <= 4.0) {
                this.gpa = gpa;
            } else {
                System.out.println("Invalid GPA for " + name + ". Defaulting to 0.0.");
                this.gpa = 0.0;
            }
        }


        public boolean hasPassed() {
            return this.gpa >= 2.0;
        }


        public void displayInfo() {
            System.out.println("University: " + universityName);
            System.out.println("ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
            System.out.println("GPA: " + gpa);
            System.out.println("Status: " + (hasPassed() ? "PASSED" : "FAILED"));

        }
    }

