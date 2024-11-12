public class StringMethods {
    public static void main(String[] args) {
        String name = "Harry";
        //System.out.println(name);
        int value = name.length();
        System.out.println(value);

        //String lstring = name.toLowerCase();
        // System.out.println(lstring);

        //String ustring = name.toupperCase();
        //System.out.println(ustring);

        //String nonTrimmedString = "   Harry   ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString.trim());

        System.out.println(name.substring(3));

        System.out.println(name.substring(1,5));

        System.out.println(name.replace('r', 'p'));

        System.out.println(name.replace("rry", "ier"));

        System.out.println(name.startsWith("Har"));

        System.out.println(name.endsWith("rry"));

        System.out.println(name.charAt(1));

        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.indexOf("r46ry"));
        System.out.println(modifiedName.lastIndexOf("rry", 4));
       
        System.out.println(name.equals("Harry"));

        System.out.println(name.equalsIgnoreCase("arry"));

        System.out.println("I am escape sequence \" double quote");
    }
}
