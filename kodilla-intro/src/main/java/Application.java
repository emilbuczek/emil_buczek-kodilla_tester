public class Application {
    public static void main(String[] args) {
        Age age = new Age("adam", 40.5, 178);
        System.out.println(age.name + age.age + age.height);
        age.checkAge();

    }
}
