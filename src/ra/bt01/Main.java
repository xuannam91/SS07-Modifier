package ra.bt01;

public class Main {
    //    Truy cập và chỉnh sửa thuộc tính private
    public static void main(String[] args) {
            MyClass obj = new MyClass("Xuân Nam");
            System.out.println("Giá trị ban đầu của myString: " + obj.getMyString());
            obj.setMyString("Minh");
            System.out.println("Giá trị mới của myString: " + obj.getMyString());
    }
}
