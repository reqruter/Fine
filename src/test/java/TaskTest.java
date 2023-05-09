import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testMatchesForSimpleTaskWhenTrue() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean actual = task.matches("родителям");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenTrueWhenFalse() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean actual = task.matches(",брату");
        Assertions.assertFalse(actual);
    }


}