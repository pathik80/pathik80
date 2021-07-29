package razi.motashim;

import java.util.Scanner;

/*--------Multiplication Table Generate and Display--------*/
// This programme will take any user input greater than 0
// Generate Multiplication tables based on Number of Table and times
/* For say, If I chose to display 2 table and time multiplication of 10 then
* following output is expected:
* How Many Table:
2
How many time:
10
1 x 1 = 1	                 oh, cannot format here :(
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5
1 x 6 = 6
1 x 7 = 7
1 x 8 = 8
1 x 9 = 9
1 x 10 = 10
* */

public class Main {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_BLUE = "\u001B[34m";
    /*To pinpoint my understanding of items in nested loop, I kept colour scheme and its also fun*/

    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        Scanner source = new Scanner(System.in);
        System.out.println(TEXT_GREEN +"How Many Table:" + TEXT_RESET);
        int table = source.nextInt(); // Take input for desired number tables
        System.out.println(TEXT_RED + "How many time:" + TEXT_RESET);
        int time = source.nextInt(); // Take input for desired number of times to populate those table
        if (table <= 0 || time <= 0) {
            System.out.println("Please enter table and time value greater than 0");
        } else {
            for (int j = 1; j <= time; j++) {
                for (int i = 1; i <= table; i++) {
                    System.out.print(TEXT_RED + i + TEXT_BLUE + " x "
                            + j + " = " + TEXT_GREEN + (i * j) + "\t\t" + TEXT_RESET);
            }
                System.out.println();
        }
            //System.out.println();
        }
        source.close();
    }
}
