public class Grades {
    public static void main(String[] args) {
        int [] grade = {4 , 5 ,6 ,2 ,4 ,3 , 5 , 6, 6, 3};
        float sum = 0; //double
        for (int i = 0; i < grade.length; i++)
            sum += grade[i];

        sum /= grade.length;
        System.out.println(sum);
        int zmienna = grade[9];
        System.out.println(zmienna);
    }
}

