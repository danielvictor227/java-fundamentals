package operators;

public class ternary {
    public static void main(String[] args) {

        /*
         * if(score >= 60){
         * System.out.println("PASS");
         * }
         * else
         * {
         * System.out.println("FAIL");
         * }
         */

        /*
         * String passOrFail = (score >= 60) ? "PASS" : "FAIL";
         * System.err.println(passOrFail);
         */

        /*
         * int number 3;
         * 
         * String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
         * System.out.println(evenOrOdd);
         * }
         */
        /* int hours = 13;
        String timesOfDay = (hours < 12) ? "AM" : "PM";
        System.out.println(timesOfDay); */

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}