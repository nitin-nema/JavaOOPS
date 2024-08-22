class Counter {
    private static int count = 0;

    // Static block
    static {
        System.out.println("Static block executed");
    }

    // Static method
    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        System.out.println("Count: " + Counter.getCount());
        Counter.incrementCount();
        System.out.println("Count after increment: " + Counter.getCount());
    }
}
