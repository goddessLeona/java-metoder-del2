
import java.util.Locale;
import java.util.Arrays;

public class Formaterare {
    public static void main(String[] args) {
        // Testa dina olika versioner av formatera här

        int nummer = 1000;
        System.out.println("Formated nummer med , : " + formatera(nummer));

        String name = "Petra Johansson";
        System.out.println("The formated name is now: " + formatera(name));

        String phone= "0703729029";
        String country = "046";
        System.out.println("The formated phone nr is: " + formatera(country,phone));
    }

    //Övning 2: Method Overloading med Formatering
    //En version som tar en heltalssumma och formaterar den med tusentalsavgränsare
    public static String formatera(int nr1){

        String formatted = String.format(Locale.US, "%,d", nr1);

        return formatted;
    }

    //En version som tar ett namn (String) och returnerar det i formatet "Efternamn, Förnamn"
    // (anta att namnet har formatet "Förnamn Efternamn")

    public static String formatera(String name){

        String[] nameParts = name.split(" ");

        if(nameParts.length == 2){
            String formatedName = nameParts[1]+ " " + nameParts[0];
            return formatedName;
        }else{
            System.out.println("Invalid name format. Please provide a first and last name.");
            return "";
        }
    }

    //En version som tar ett telefonnummer och formaterar det snyggt
    public static String formatera(String country, String phone){

        String countryCode = country.replaceAll("[^0-9]", "");

        if(countryCode.length() == 3 && countryCode.startsWith("0")){
            countryCode = "+" + countryCode.substring(1);
        }else{
            System.out.println("The country code have to have 3 numbers starting with 0");
            return "";
        }

        String nummber = phone.replaceAll("[^0-9]", "");

        // Om det är ett svenskt mobilnummer (10 siffror)
        if(nummber.length() == 10){
            return  countryCode + " " +nummber.substring(0, 3) + "-" +
                    nummber.substring(3, 6) + " " +
                    nummber.substring(6, 8) + " " +
                    nummber.substring(8);
        }else if(nummber.length()==9){
            return  countryCode + " " + nummber.substring(0, 2) + "-" +
                    nummber.substring(2, 5) + " " +
                    nummber.substring(5, 7) + " " +
                    nummber.substring(7);
        }else{
            System.out.println("the nummber is written in wrong");
            return "";
        }
    }

}
