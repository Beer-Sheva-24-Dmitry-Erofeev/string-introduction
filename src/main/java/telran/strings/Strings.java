package telran.strings;

public class Strings {

    public static String firstName() {
        // The first character must be a capital letter (A-Z)
        // The second character must be a lower case letter (a-z)
        // Quantificator {n,} tells that there should be at least "n" characters + 1 or more of the type that precedes it
        return "[A-Z][a-z]{4,}";
    }

    public static String javaVariable() {
        // The first character must be a letter (a-z or A-Z), underscore (_), or dollar sign ($)
        // Subsequent characters can be letters (a-z, A-Z), digits (0-9), underscores (_), or dollar signs ($)
        return "^[a-zA-Z_$][a-zA-Z0-9_$]*$";
    }
}
