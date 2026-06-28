interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    public int square(int n) {
        return n*n;
    }
}

public class q1 {
    public static void main(String[] args) {
        Arithmetic obj=new Arithmetic();
        int num=5;
        System.out.println("Square = "+obj.square(num));
    }
}
