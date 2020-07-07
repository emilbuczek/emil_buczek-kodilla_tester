public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 1000) {


            System.out.println("This notebook is quite expensive.");
        } else {
            System.out.println("this notebook is good price.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight < 1501) {
            System.out.println("This notebook is medium light.");
        } else {
            System.out.println("this notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year < 2000) {
            System.out.println("This notebook is old.");
        } else if (this.year < 2005) {
            System.out.println("This notebook is not that old.");
        } else {
            System.out.println("this notebook almost new one.");
        }
    }

    public void checkCondition() {
        if (this.year < 2000 && this.price < 501) {
            System.out.println("This notebook is junk.");
        } else if (this.year < 2005 && this.price < 1501) {
            System.out.println("This notebook is for granny.");
        } else {
            System.out.println("this notebook is for you.");
        }
    }


}