import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
        private Student monitor;
        private List<Student> students;
        private List<String> tasks;

        public StudentGroup(Student monitor) {
            this.monitor = monitor;
            this.students = new ArrayList();
            this.tasks = new ArrayList();
            this.students.add(monitor);
        }

        public void setMonitor(Student monitor) {
            this.monitor = monitor;
        }

        public void addStudent(Student student) {
            this.students.add(student);
        }

        public void removeStudent(Student student) {
            this.students.remove(student);
        }

        public void addTask(String task) {
            this.tasks.add(task);
        }

        public void printStudents() {
            System.out.println("Monitor:" + " "+ this.monitor.getFirstName() + " " + this.monitor.getLastName());

            for (Student student : this.students) {
                System.out.println("Student" + " " + student.getFirstName() + " " + student.getLastName());
            }
        }

        public void printTasks() {
            for (String task : this.tasks) {
                System.out.println("Task:" + " " + task);
            }
        }
    }

