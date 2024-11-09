public class StringMethods {
    public static void main(String[] args) {
        String name = "Harry";
        //System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toupperCase();
        System.out.println(ustring);

        String nonTrimmedString = "   Harry   ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString.trim());
    }
}
