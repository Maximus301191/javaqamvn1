import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn1.services.SqrtService;

public class SqrtServiceTest {

    @Test
    public void shouldCalcExact() {
        SqrtService service = new SqrtService();

        int income = 100_000;
        int expenses = 60_000;
        int treshold = 150_000;
        int expected = 2;
        int actual = service.calcsqrt(income, expenses, treshold);
        System.out.println(actual + " месяца(ев) в году отдыхал работник");
        Assertions.assertEquals(expected, actual);
    }
}
