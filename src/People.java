public class People {

    public static void main(String[] args) {

        Person person1 = new Person("Jan", 22);
        Person.peopleNumber = 1;
        Person person2 = new Person("Kasia", 33);
        Person.peopleNumber = 2;
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());

        System.out.println(Person.peopleNumber);

    }
}
