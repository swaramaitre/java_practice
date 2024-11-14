public class practice {
    public static void main(String[] args) {
        // Problem 1
        String name = "Jack parker";
        name = name,toLowerCase();
        System.out.println(name);
        // Problem 2
        String text = "To Lower Case";
        text = text.replace( oldChar:" ", replacement:"_");
        System.out.println(text);
        //Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace( target:"<|name|>", replacement: "Harry");
        System.out.println(letter);
    }
}
