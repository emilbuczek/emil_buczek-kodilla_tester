public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[5];
        movies[0] = "Pulp Fiction";
        movies[1] = "Matrix";
        movies[2] = "The Godfather";
        movies[3] = "Hacksaw Ridge";
        movies[4] = "Chappie";
        String movie = movies[3];
        System.out.println(movie);
        int numberOfElements = movies.length;
        System.out.println(numberOfElements);
        if (numberOfElements% 5 == 0)
            System.out.println("Moja tablica ma pięć elementów");
    }
}