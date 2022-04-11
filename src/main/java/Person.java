public record Person(String name, String address) {
    public static String UNKNOWN_ADDRESS = "Unknown";

    public static Person makePerson(String firstName, String lastName, String streetName, String number) {
        return new Person(firstName + " " + lastName, streetName + " " + number);
    }

    public Person(String name) {
        this(name, UNKNOWN_ADDRESS);
    }

    // Compact constructor
    public Person {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Name is empty!");
    }
}
