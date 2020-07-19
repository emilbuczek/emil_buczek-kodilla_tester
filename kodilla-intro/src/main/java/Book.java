public class Book {
    private String author() {
        String author = "Strassman";
        return author;
    }

    private String title() {
        String title = "DMT. Molekuła duszy. Rewolucyjne badania w dziedzinie biologii doświadczeń mistycznych i z pogranicza śmierci";
        return title;
    }

    public static void main(String[] args) {
        String book = Book.of("Rick Strassman", "DMT. Molekuła duszy. Rewolucyjne badania w dziedzinie biologii doświadczeń mistycznych i z pogranicza śmierci");
        System.out.println(book);
    }

    private static String of(String author, String title) {
        return (author + " " + title);
    }
}