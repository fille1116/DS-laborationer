package laboration7;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int wealth;
    
    public Person( String name, int age, int wealth ) {
        this.name = name;
        this.age = age;
        this.wealth = wealth;
    }
    
    public int getAge() {
        return age;
    }


    public int getWealth() {
        return wealth;
    }

    public int compareTo(Person p) {
    	return name.compareTo(p.name);
    }

    public String toString() {
        return this.name + ", " + this.age + " år, förmögenhet: " + this.wealth;
    }
}
