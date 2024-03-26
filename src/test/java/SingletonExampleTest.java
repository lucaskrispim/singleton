import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class SingletonExampleTest {

    @Test
    public void testSingletonInstanceNotNull() {
        SingletonExample instance = SingletonExample.getInstance();
        assertNotNull(instance);
    }

    @Test
    public void testSingletonOnlyOneInstance() {
        SingletonExample firstInstance = SingletonExample.getInstance();
        SingletonExample secondInstance = SingletonExample.getInstance();

        assertSame(firstInstance, secondInstance);
    }

    @Test
    public void testSingletonDoSomething() {
        SingletonExample instance = SingletonExample.getInstance();

        instance.doSomething();
    }
}