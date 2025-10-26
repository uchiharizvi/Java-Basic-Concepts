package oops.object.equals.deep;

import java.util.Objects;

/** Example to show how hashcode and equals work in java**/
public class Person {
    private String name;
    private Integer id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Person)) return false;
        Person deepPerson = (Person) obj;
        return id == deepPerson.id && name.equals(deepPerson.name);
    }

}
