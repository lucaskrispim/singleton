import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
class AppConfigTest {

    @Test
    void testSingletonInstance() {
        AppConfig instance1 = AppConfig.getInstance();
        AppConfig instance2 = AppConfig.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    void testPortGetterAndSetter() {
        AppConfig config = AppConfig.getInstance();
        config.setPort("8080");
        assertEquals("8080", config.getPort());
    }

}