public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static String zwrocImie() {
        System.out.println("Imie to:" + this.name);
        return this.name;
    }
    public static int zwrocWiek() {
        System.out.println("Wiek to:" + this.age);
        return this.age;
    }
}
     public static void main(String[] args) {

         User adam = new User("Adam", 19);
         User karol = new User("Karol", 35);
         User anna = new User("Anna", 29);
         User mikolaj = new User("Mikołaj", 9);
         User jan = new User("Jan", 45);

         User[] users = new User {
             adam, karol, anna, mikolaj, jan
         } ;

         int result = 0;
         int i = this.age
         for (int i = 0; i < users.length; i++) {
             result = result + users[i];
             int srednia = result / users.length;
             {
                 if (srednia > this.age)
                     System.out.println(this.name);

             }

         }
     }





