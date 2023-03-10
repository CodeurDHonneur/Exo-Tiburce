package etudiant.test;

public class Person extends Object{
    
    private String firstName = "Alice";
    private String lastName;
    private int hold;
    public static int feetNumber;

    public String getFirstName() {
       return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHold() {
        return hold;
    }

    public void setFirstName(String firstname) {
        firstName = firstname;
    }

    public void setLastName(String lastname) {
        lastName = lastname;
    }

    public void setHold(int age) {
        hold = age;
    }

    public Person() {

    }

    public Person(String firstname) {
        firstName = firstname;
    }

    public Person(String firstname, String lastname) {
        firstName = firstname;
        lastName = lastname;
    }

    public Person(String firstname, String lastname, int age) {
        System.out.println("appel du constructeur");
        firstName = firstname;
        lastName = lastname;
        hold = age;
    }

    /*
    * @override
    */
    public String toString() {
        //return firstName + lastName + hold;
        return " Bonjour " + this.getFirstName() + " " + this.getLastName() + ", vous avez " + getHold();
    }
    
    static {
        System.out.println("méthode static");
    }

    public static void main(String[] args) {
        //toto
        Person toto = new Person("toto", "Alitoto", 30);
        System.out.println(toto);

        System.out.println("=================");

        Person person2 = new Person("to", "toto", 20);
        System.out.println(person2);
        

        /*Person obj = new Person();
        System.out.println(obj);*/
        
    }
}
