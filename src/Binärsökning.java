public class Binärsökning {

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int searchTal = 23;

        int index = binarSok(sortedArray, searchTal, 0, sortedArray.length - 1);

        if (index != -1) {
            System.out.println(searchTal + " finns på index " + index);
        } else {
            System.out.println(searchTal + " finns inte i arrayen");
        }
    }
    // Implementera den rekursiva binärSök-metoden här
    public static int binarSok(int[] a,int b,int c, int d){

    }

}
