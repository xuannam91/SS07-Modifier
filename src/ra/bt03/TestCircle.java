package ra.bt03;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius :" + circle.getRadius());
        System.out.println("Area :" + circle.getArea());
        // Đặt access modifier cho getRadius() và getArea() thành private
        // Cố gắng truy cập chúng sẽ gây lỗi biên dịch
    }
}
