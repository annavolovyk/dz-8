public class Main {
    public static void main(String[] args) {
        Student monitor = new Student("Smith", "David");
        Student student1 = new Student("Black", "Jack");
        Student student2 = new Student("Trump", "Donald");
        StudentGroup group = new StudentGroup(monitor);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addTask("Learn Encapsulation");
        group.addTask("Learn Abstraction");
        group.printTasks();
        group.printStudents();
    }
}
