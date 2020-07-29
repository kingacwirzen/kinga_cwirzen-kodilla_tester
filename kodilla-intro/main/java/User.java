public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String zwrocImie() {
        System.out.println("Imie to:" + this.name);
        return this.name;
    }

    public int zwrocWiek() {
        System.out.println("Wiek to:" + this.age);
        return this.age;
    }

    public static void main(String[] args) {

        User adam = new User("Adam", 19);
        User karol = new User("Karol", 35);
        User anna = new User("Anna", 29);
        User mikolaj = new User("Mikołaj", 9);
        User jan = new User("Jan", 45);

        User[] users = new User[] { adam, karol, anna, mikolaj, jan
        } ;

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].zwrocWiek();
        }
        int avg = sum / users.length;
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            int age = user.zwrocWiek();
            if (age > avg) {
                System.out.println(user.zwrocImie());
            }
            ;
        }
    }
}







