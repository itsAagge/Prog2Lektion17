package opgave02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Opgave02Test {

    @Test
    void checkParantesTrue() {
        String legalString = "(3+{5{99{*}}[23[{67}67]]})";

        assertTrue(Opgave02.checkParantes(legalString));
    }

    @Test
    void checkParantesFalse() {
        String illegalString = "(}){";

        assertFalse(Opgave02.checkParantes(illegalString));
    }
}