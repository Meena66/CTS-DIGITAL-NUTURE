public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern() {
        System.out.println("Singleton Object Created");
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}