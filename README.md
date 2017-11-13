# GenericsAndAutoTypeDeduceDemo
```java
import java.lang.reflect.InvocationTargetException;

public class GenericsAndAutoTypeDeduceDemo {
    public static <T> T getInstance(Class<T> cls) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return cls.newInstance();
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        getInstance(Test.class).print();
    }
}

class Test {
    public void print() {
        System.out.println("I'm an instance of " + this.getClass().toString());
    }
}
```
