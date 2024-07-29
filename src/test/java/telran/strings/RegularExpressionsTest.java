package telran.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import static telran.strings.Strings.firstName;
import static telran.strings.Strings.javaVariable;

public class RegularExpressionsTest {

    @Test
    void firstNameTest() {

        String firstName = firstName();

        assertTrue("Vasily".matches(firstName));
        assertTrue("Jolanda".matches(firstName));
        assertTrue("Aristarch".matches(firstName));
        assertTrue("Panaxeth".matches(firstName));

        assertFalse("John".matches(firstName));
        assertFalse("hector".matches(firstName));
        assertFalse("DumbledorE".matches(firstName));
        assertFalse("Volan De Mort".matches(firstName));
    }

    @Test
    void javaVariableTest() {

        // Regex: "^[a-zA-Z_$][a-zA-Z0-9_$]*$"
        String javaVariable = javaVariable();

        assertTrue("abstractThing".matches(javaVariable));
        assertTrue("ab$tract_Thing".matches(javaVariable));
        assertTrue("_sk8terboy".matches(javaVariable));
        assertTrue("Mirror".matches(javaVariable));
        assertTrue("$mite".matches(javaVariable));
        assertTrue("A".matches(javaVariable));
        assertTrue("z".matches(javaVariable));

        assertFalse("1337".matches(javaVariable));
        assertFalse("@whatsUpDude".matches(javaVariable));
        assertFalse("WhatsUpD***".matches(javaVariable));
        assertFalse("Whats Up Dude".matches(javaVariable));
        assertFalse("whats.up.dude".matches(javaVariable));
        assertFalse("whats-up-dude".matches(javaVariable));
    }
}
