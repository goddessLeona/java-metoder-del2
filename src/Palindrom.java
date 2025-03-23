// Nils lösning av uppgiften :)

public class Palindrom {

    public static void main(String[] args) {
        String[] testStrangar = {"anna", "palindrom", "level", "java"};

        for (String s : testStrangar) {
            System.out.println(s + " är palindrom: " + isPalindrom(s));
        }
    }

    static public boolean isPalindrom(String s){

        String string = s;

        if (string.length() <= 1) {
            return true;
        }

        // Kontrollera om det första och sista tecknet är samma
        char first = string.charAt(0);
        char last = string.charAt(string.length() - 1);

        if (first != last) {
            return false;  // Om tecknen inte matchar, är det inte ett palindrom
        }

        String resten = string.substring(1, string.length() - 1);
        return isPalindrom(resten);

    }
}
