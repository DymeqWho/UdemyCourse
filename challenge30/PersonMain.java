package challenge30;

public class PersonMain {
    public static void main(String[] args) {
        Person firstPerson = new Person();

        firstPerson.setFirstName("");
        firstPerson.setLastName("");
        firstPerson.setAge(10);

        System.out.println("firstPerson.getFullName() = " + firstPerson.getFullName());
        System.out.println("firstPerson.getAge() = " + firstPerson.getAge());
        System.out.println("firstPerson.isTeen() = " + firstPerson.isTeen());
        firstPerson.setFirstName("John");
        firstPerson.setAge(18);
        System.out.println("firstPerson.getFullName() = " + firstPerson.getFullName());
        System.out.println("firstPerson.isTeen() = " + firstPerson.isTeen());
        firstPerson.setLastName("Smith");
        System.out.println("firstPerson.getFullName() = " + firstPerson.getFullName());

    }
}
