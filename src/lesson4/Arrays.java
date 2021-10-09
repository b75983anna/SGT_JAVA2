package lesson4;

public class Arrays {

    public static void main(String[] args) {
        // Define an array
        int[] arrayOfIntegers;
        // Initialize an array
        arrayOfIntegers = new int[5];

        // same in one line
        int[] anotherArray = new int[10];

        // PRINT THE ALPHABET
        System.out.println(initAlphabet());


        // Define the array and initialize using shorthand notation
        String[] cities = {
                "Riga",
                "London",
                "Paris"
        };

        // This is equal to
        String[] cities2 = new String[3];
        cities2[0] = "Tokyo";
        cities2[1] = "Los Angeles";
        cities2[2] = "Singapure";

        for (String city :
                cities2) {
            System.out.print(city + ",");
        }

//        cities2 = new String[5];
//        cities2[0] = "Riga";
//        cities2[1] = "London";
//        cities2[2] = "Paris";
//        cities2[3] = "Tokyo";
//        cities2[4] = "Los Angeles";


        String[] newCities = new String[3];
        System.arraycopy(cities, 0, newCities, 0, cities.length);

        for (String city :
                newCities) {
            System.out.print(city + ",");
        }

        // TWO DIMENSIONAL ARRAYS

        int[][] points = new int[10][10];

        points[0][0] = 99;
        points[0][1] = 5;
//        System.out.println(points);

        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(points[i][j] + " ");
            }
        }

    }


    static char[] initAlphabet() {

        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        return alphabet;
    }
}
