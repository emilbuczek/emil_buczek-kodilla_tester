public class LeapYear {
    public static void main (String[] args) {
        int theYear = 2020;
        System.out.println(theYear);

        if (theYear% 4 == 0){
            System.out.println("Rok przestępny");
        } else if (theYear% 100 == 0 && theYear% 400 == 0) {
            System.out.println("rok przestępny");
        } else {
            System.out.println("Rok nieprzestępny");
        }
    }
}