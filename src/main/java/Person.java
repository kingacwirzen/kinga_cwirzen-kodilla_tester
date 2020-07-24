public class Person {
    String name;
    double age;
    double height;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void showDescription() {
        if (name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println(this.name + " is older than 30 and higher then 160cm");
            } else {
                System.out.println(this.name + " is younger than 30 or lower than 160cm");
            }
        }
    }
}
