package lab2;
/**
 * Class {@code Main} which consists method {@link #main(String[])}
 * creates instances of 3 classes and calls their methods
 * @author Bykovets Sergey
 */
public class Main {
    /**
     * Method {@code main(String[])} which creates instances of 3 classes and calls their methods
     */
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        class1.method1();
        class1.method2();
        class2.method2();
        class3.method2();
        class3.method3();
    }
}