import java.util.ArrayList;

public class iterateMulti {

    public static void main(String[] args){
        iterateMulti numbers = new iterateMulti();
        ArrayList<Integer> sevenMultiples = numbers.sevenIterate();
        System.out.println("Multiples of seven until 100:\n" + sevenMultiples);

        ArrayList<Integer> eightMultiples = numbers.eightIteratre();
        System.out.println("\nMultiples of eight until 200:\n" + eightMultiples);

        ArrayList<Integer> nineMultiples = numbers.nineIteratre();
        System.out.println("\nMultiples of nine until 300:\n" + nineMultiples);
    }

    //Using while loop for seven multiples
    public static ArrayList<Integer> sevenIterate() {
        int n = 7;
        ArrayList<Integer> sevenList = new ArrayList<Integer>();
        while (n <= 100) {
            sevenList.add(n);
            n = n + 7;
        }
        return sevenList;
    }

    //Using for loop for eight and nine multiples
    public static ArrayList<Integer> eightIteratre() {
        ArrayList<Integer> eightList = new ArrayList<Integer>();
        for (int n = 8; n <= 200; n = n+8) {
            eightList.add(n);
        }
        return eightList;
    }

    public static ArrayList<Integer> nineIteratre() {
        ArrayList<Integer> nineList = new ArrayList<Integer>();
        for (int n = 9; n <= 300; n = n+9) {
            nineList.add(n);
        }
        return nineList;
    }
}
