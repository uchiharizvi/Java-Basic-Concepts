package oops.object.equals;

import oops.object.equals.shallow.Person;

public class Main {
    public static void main(String[] args) {

        /**In this example, we are using Object class hashcode() and equals(), i.e, not overriding
         * Now what happens is
         * 1. Object class uses different mem addr for each instance, so hashcode would differ
         * 2. Object.equals() by default also compares references
         * Two Persons with same data are considered Different**/
        Person shallowPerson1 = new Person("Kavish", 1);
        Person shallowPerson2 = new Person("Kavish", 1);
        System.out.println("Shallow Comparison");
        System.out.println(shallowPerson1.hashCode() == shallowPerson2.hashCode());
        System.out.println(shallowPerson1.equals(shallowPerson2));
        /**In this example, we are using our own hashcode() and equals(), i.e, overriding
         * Now what happens is
         * 1. As per overridden impl, it calculates hashcode using Object.hash()
         * 2. Checks whether Compare object are equals with each other, return false if Object Type is different
         * Two Persons with same data are not considered Different **/
        oops.object.equals.deep.Person deepPerson1 = new oops.object.equals.deep.Person("Kavish", 1);
        oops.object.equals.deep.Person deepPerson2 = new oops.object.equals.deep.Person("Kavish", 1);
        System.out.println("Deep Comaprison");
        System.out.println(deepPerson1.hashCode() == deepPerson2.hashCode());
        System.out.println(deepPerson1.equals(deepPerson1));
        System.out.println(deepPerson1.equals(deepPerson2));

    }
}
