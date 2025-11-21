import org.example.Plecak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlecakTest {
    @Test
    public void zwrociZawartoscKomoryJeden(){
        //given
        String z = "vJrwpWtwJgWrhcsFMMfFFhFp";

        Plecak plecak = new Plecak(z);

        //when
        String k1 = plecak.zawartoscKomoryJeden();
        String k2 = plecak.zawartoscKomoryDwa();
        //then
        Assertions.assertEquals(k1,"vJrwpWtwJgWr");
        Assertions.assertEquals(k2, "hcsFMMfFFhFp");
    }
    @Test
    public void zwrociZawartoscKomoryDwa(){
        //given
        String z = "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL";

        Plecak plecak = new Plecak(z);

        //when
        String k1 = plecak.zawartoscKomoryJeden();
        String k2 = plecak.zawartoscKomoryDwa();
        //then
        Assertions.assertEquals(k1,"jqHRNqRjqzjGDLGL");
        Assertions.assertEquals(k2, "rsFMfFZSrLrFZsSL");
    }
    @Test
    public void zwrotZleSpakowangeo(){
        String z = "vJrwpWtwJgWrhcsFMMfFFhFp";

        Plecak plecak = new Plecak(z);

        //when
        char element = plecak.zleSpakowany();
        //then
        Assertions.assertEquals('p',element);

    }
}
