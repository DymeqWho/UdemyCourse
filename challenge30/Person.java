package challenge30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String thatPersonsFirstName) {
        this.firstName = thatPersonsFirstName;
    }

    public void setLastName(String thatPersonsLastName) {
        this.lastName = thatPersonsLastName;
    }

    public void setAge(int thatPersonsAge) {
        if (thatPersonsAge < 0 || thatPersonsAge > 100) {
            this.age = 0;
        } else {
            this.age = thatPersonsAge;
        }
    }

    public boolean isTeen(){
        return age <= 19 && age > 12;
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        if(firstName.isEmpty()){
            return lastName;
        }
        if(lastName.isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
