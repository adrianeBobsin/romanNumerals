import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *  Classe de teste das conversões de numerais para números romanos
 *  @author Adriane Bobsin de la Vega
 */

public class TestRomanNumerals {
    RomanNumerals instance = RomanNumerals.getInstance();

    /**
     * Teste do método de soma
     */
    @Test
    public void testSum() {
        assertEquals("MMDCCLXXXVI", instance.convertNumeralToRoman("2786"));
    }

    /**
     *  Testes das exceções da unidade
     */
    @Test
    public void testExceptionUnitFour() {
        assertEquals("IV", instance.convertNumeralToRoman(4));
    }

    @Test
    public void testExceptionUnitFive() {
        assertEquals("V", instance.convertNumeralToRoman(5));
    }

    @Test
    public void testExceptionUnitNine() {
        assertEquals("IX", instance.convertNumeralToRoman(9));
    }

    /**
     * Testes das exceções da dezena
     */
    @Test
    public void testExceptionDozenFour() {
        assertEquals("XLIV", instance.convertNumeralToRoman(44));
    }

    @Test
    public void testExceptionDozenFive() {
        assertEquals("LVII", instance.convertNumeralToRoman(57));
    }

    @Test
    public void testExceptionDozenNine() {
        assertEquals("XCIX", instance.convertNumeralToRoman(99));
    }

    /**
     * Testes das exceções da centena
     */
    @Test
    public void testExceptionHundred() {
        assertEquals("DCCCXCIX", instance.convertNumeralToRoman(899));
    }

    @Test
    public void testExceptionHundredFour() {
        assertEquals("CD", instance.convertNumeralToRoman(400));
    }

    @Test
    public void testExceptionHundredFive() {
        assertEquals("D", instance.convertNumeralToRoman(500));
    }

    @Test
    public void testExceptionHundredNine() {
        assertEquals("CMXLIII", instance.convertNumeralToRoman(943));
    }

    /**
     * Testes do milhar
     */
    @Test
    public void testExceptionThousandNine() {
        assertEquals("M", instance.convertNumeralToRoman(1000));
    }
}
