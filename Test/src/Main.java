public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Person person = main.new Person("Hải", 28);
        person.displayPerson();
    }
    class Person {
        String name;
        int age;
        Person (String name, int age){
            this.name = name;
            this.age = age;
        }
        void displayPerson(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}

