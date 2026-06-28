class Outer {

    void display() {
        System.out.println("Display of Outer Class");
    }

    class Inner {
        void display() {
            System.out.println("Display of Inner Class");
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.display();
        Outer.Inner inner=outer.new Inner();
        inner.display();
    }
}
