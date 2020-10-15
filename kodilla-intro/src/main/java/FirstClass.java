public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000,2010);
        Notebook heavyNotebook = new Notebook(2000, 1500,2004);
        Notebook oldNotebook = new Notebook(1500, 500, 1999);

        printNotebookParameters(notebook);
        System.out.println("");
        printNotebookParameters(heavyNotebook);
        System.out.println("");
        printNotebookParameters(oldNotebook);
    }

    private static void printNotebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + "g" + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkCondition();
    }
}