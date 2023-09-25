package ra.bt04;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Tên ban đầu: " + student.getName());
        System.out.println("Lớp ban đầu: " + student.getClasses());

        student.setName("Nam");
        student.setClasses("C29");

        System.out.println("Tên mới: " + student.getName());
    }
}
