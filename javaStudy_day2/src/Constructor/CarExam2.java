package Constructor;

public class CarExam2{
    public static void main(String args[]){

        Car c1 = new Car("�ҹ���");
        Car c2 = new Car("������");
//        Car c3 = new Car(); // ������ ������ �߻��մϴ�.

        System.out.println(c1.name);
        System.out.println(c2.name);
        
        System.out.printf("���� %d�� �����Ͽ����ϴ�.", Car.carCount);
    }
}
