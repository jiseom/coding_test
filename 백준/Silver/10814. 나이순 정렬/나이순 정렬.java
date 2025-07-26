import java.util.*;
public class Main {
    static class Person {
        int age;
        String name;

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge(){
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return age + " " + name;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();

            Person person = new Person();
            person.setAge(age);
            person.setName(name);

            list.add(person);
        }

        list.sort(Comparator.comparingInt(p -> p.age));

        for (Person person : list) {
            System.out.println(person);
        }

    }


}