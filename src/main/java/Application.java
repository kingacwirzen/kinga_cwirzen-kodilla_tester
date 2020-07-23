public class Application {

    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String zwrocImie() {
        System.out.println(this.name);
        return this.name;
    }

    public static void main(String[] args) {

        Application adam = new Application("Adam", 40.5, 178);

    }
}

