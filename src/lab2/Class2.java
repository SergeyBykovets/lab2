package lab2;
/**
 * Class {@code Class2} which implements interface {@link Interface2}, consists field of type {@link Interface1},
 * <p>
 * method {@link #method2()}
 *</p>
 * @author Bykovets Sergey
 */
public class Class2 implements Interface2{
    /**
     * Field of type {@code Interface1}
     */
    Interface1 interface1;
    /**
     * Method {@code method1()} which prints information about yourself in console
     */
    @Override
    public void method2() {
        System.out.println("Class2 method2");
    }
}
