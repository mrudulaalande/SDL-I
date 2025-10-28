//Static Variable and Method
// class pg14 {
//     static int count = 0;
//     static void displayCount() {
//         System.out.println("Count = " + count);
//     }
//     public static void main(String[] args) {
//         count = 5;
//         displayCount();
//     }
// }

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Objects created: " + count);
    }
}

public class pg14 {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.displayCount();
    }
}