package lab2;
/**
 * Class {@code Class3} which implements interface {@link Interface3}, extends {@link Class2},
 * consists field of type {@link Class1},
 * 2 methods: {@link #method2()}, {@link #method3()}
 *
 * @author Bykovets Sergey
 */
public class Class3 extends Class2 implements Interface3{
    /**
     * Field of type {@code Class1}
     */
    Class1 class1;
    /**
     * Method {@code method2()} which prints information about method in console
     */
    @Override
    public void method2() {
        System.out.println("Class3 method2");
    }
    /**
     * Method {@code method3()} which prints information about yourself in console
     */
    @Override
    public void method3() {
        System.out.println("Class3 method3");
    }
}
