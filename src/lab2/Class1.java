package lab2;
/**
 * Class {@code Class1} which implements interface {@link Interface1}, consists field of type {@link Class1},
 * <p>
 * 2 method: {@link #method1()}, {@link #method2()}
 * </p>
 * @author Bykovets Sergey
 */
public class Class1 implements Interface1{
    /**
     * Field of type {@code Class1}
     */
    Class1 class1;
    /**
     * Method {@code method1()} which prints information about yourself in console
     */
    @Override
    public void method1() {
        System.out.println("Class1 method1");
    }
    /**
     * Method {@code method2()} which prints information about yourself in console
     */
    @Override
    public void method2() {
        System.out.println("Class1 method2");
    }
}