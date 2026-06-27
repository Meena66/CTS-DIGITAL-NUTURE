public class SingletonTest {

    public static void main(String[] args) {

        SingletonPattern obj1 = SingletonPattern.getInstance();
        SingletonPattern obj2 = SingletonPattern.getInstance();

        if (obj1 == obj2) {
            System.out.println("Both references point to the same object");
        } else {
            System.out.println("Objects are different");
        }
    }
}