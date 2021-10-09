package lesson4;

public class ControlFlows {

    // BRANCHING
    public static void main(String[] args) {

        int myAge = 31;

        // SIMPLE IF STATEMENT
        if (myAge > 64) {
            System.out.println("Retirement Time");
        } else if (myAge < 7) {
            System.out.println("Kindergarden time");
        } else {
            System.out.println("Work time!");
        }

        // SWITCH STATEMENTS
        switch (myAge) {
            case 5:
                System.out.println("5 years old");
                break;
            case 31:
                System.out.println("31 years old");
                break;
            case 55:
                System.out.println("55 years old");
                break;
            default:
                System.out.println("Some other non-mentioned age");
        }


        // SIMPLE FOR LOOP
        for (int i = 0; i < 10; i++) {
            System.out.println("Are you finished yet? " + i);
        }
        System.out.println("Finally!");

        // SIMPLE FOREACH EXAMPLE
        String[] students = new String[5];
        students[0] = "Laura";
        students[1] = "Jekaterina";
        students[2] = "Marina";
        students[3] = "Tatjana";

        for (String studentName :
                students) {
            System.out.println(studentName);
        }

        int i = 0;
        while( i < 20 ) {
            System.out.println("Loop is still running " + i);
            i++;
        }


        //DO WHILE loops are running at least ONCE
        do {
            System.out.println("This should be executed at least once");
        } while ( i < 0 );


        // INFINITE LOOP WITH BREAK
        // we will stop the loop when breakCondition is > 10
        int breakCondition = 0;
        do {
            if( breakCondition > 10 ) {
                break;
            }
            breakCondition++;
            System.out.println("BreakCondition: " + breakCondition);
        } while (true);
        System.out.println("We are out of infinite loop");

        // A loop where we scip elements from 3 to 7
        for (int j = 0; j < 10; j++) {
            if(j > 3 && j < 7){
                continue;
            }
            System.out.println("Some element that is not between 3 and 7 not included:" + j);
        }

    }
}
