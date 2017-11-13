import java.lang.reflect.InvocationTargetException;

public class GenericsAndAutoTypeDeduceDemo {
    public static <T> T clone(T greeting) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return (T) greeting.getClass().newInstance();
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Test test = new Test();
        clone(test).print();
    }
}

class Test {
    public void print() {
        System.out.println("I'm an instance of " + this.getClass().toString());
    }
}
