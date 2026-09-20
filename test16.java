import java.util.Scanner;

class Box<T>{
    T value;
    Box(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
public class test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double decimal = sc.nextDouble();
        Box<Integer> box1 = new Box<>(n);
        Box<Double> box2 = new Box<>(decimal);
        System.out.println(box1.getValue());
        System.out.printf("%.2f",box2.getValue());
        sc.close();
    }
}
