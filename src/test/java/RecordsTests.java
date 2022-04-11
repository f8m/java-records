import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecordsTests {

    @Test
    public void testGetters() {
        Person person = new Person("Fernando", "Javastraat 110");

        assertEquals("Fernando", person.name());
        assertEquals("Javastraat 110", person.address());
    }

    @Test
    public void testEquals() {
        Person person1 = new Person("Fernando", "Javastraat 110");
        Person person2 = new Person("Fernando", "Javastraat 110");

        assertTrue(person1.equals(person2));

        Person person3 = new Person("Fernando", "Avenida Paulista");

        assertFalse(person1.equals(person3));
    }

    @Test
    public void testToString() {
        Person person = new Person("Fernando", "Javastraat 110");

        assertEquals("Person[name=Fernando, address=Javastraat 110]", person.toString());
    }

    @Test
    public void testCustomConstructor() {
        Person person = new Person("Fernando");

        assertEquals("Fernando", person.name());
        assertEquals(Person.UNKNOWN_ADDRESS, person.address());
    }

    @Test
    public void testStaticMethod() {
        Person person = Person.makePerson("Fernando", "Mohr", "Javastraat", "110");

        assertEquals("Fernando Mohr", person.name());
        assertEquals("Javastraat 110", person.address());

    }

    @Test
    public void testCompactConstructor() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Person person = new Person(null);
        });
        assertEquals("Name is empty!", exception.getMessage());
    }

}
