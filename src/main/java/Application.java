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

        if (Application.zwrocImie() != null) {

            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}

