public class Miniraknare {
    public static void main(String[] args) {

        System.out.println("the sum is: " + berakna(3,7,'+'));
        System.out.println("the sum is: " + berakna(2.5,2.5,'+'));
        System.out.println("the sum is: " + berakna(6,4));
        System.out.println("the sum is: " + berakna(1,3,6,8));
    }

    //Version 1
    //En version som tar två integers och en operator (char) och utför den valda operationen
    public static int berakna(int nr1, int nr2, char operator){

        switch(operator){
            case '+':
                return (nr1+nr2);
            case '-':
                return (nr1-nr2);
            case '*':
                return (nr1*nr2);
            case '/':
                return (nr1/nr2);
            default:
                System.out.println("Error: Invalid operator.");
                return 0;
        }
    }

    //version 2
    //En version som tar två doubles och en operator
    public static double berakna(double nr1, double nr2, char operator){

        switch(operator){
            case '+':
                return (nr1+nr2);
            case '-':
                return (nr1-nr2);
            case '*':
                return (nr1*nr2);
            case '/':
                return (nr1/nr2);
            default:
                System.out.println("Error: Invalid operator.");
                return 0;
        }
    }

    //version3
    //En version som tar två integers och automatiskt adderar dem
    public static int berakna( int nr1, int nr2){
        int sum = nr1+nr2;
        return sum;
    }

    //version 4
    //En version som tar en array av integers och adderar alla värden
    public static int berakna(int a, int b,int c, int d){

        int[] array = {a,b,c,d};
        int sum = 0;

        for(int nr: array){
            sum= sum+nr;
        }

        return sum;
    }

}
