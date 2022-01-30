package t3;

public class MethodsOfOjlect {
    Car car1 = new Car(1);

    public MethodsOfOjlect() {
        System.out.println(car1.getClass());
        System.out.println(car1.hashCode());
        System.out.println(car1.toString());
    }

    public static void main(String[] args){
        new MethodsOfOjlect();
    }
}

