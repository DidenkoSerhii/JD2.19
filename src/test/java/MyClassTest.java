import org.example.MyClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {
    @Test
    public void testAdd() {
        MyClass myClass = new MyClass();
        int result = myClass.add(2, 3);
        assertEquals(5, result);
    }
}







