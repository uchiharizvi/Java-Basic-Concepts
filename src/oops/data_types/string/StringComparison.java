package oops.data_types.string;
/** "==" and equals() both are used for comparison, but differ in purpose. The difference is what they compare, while == compares memory addresses, equals() compares Object's values. Take for example
 String a = "CGPT";
 String b = "CGPT";
 String c = new String ("CGPT");
 a gets created in String pool within Heap Memory.
 when b is created since a already exists with "CGPT" value, b is just referencing a.
 C on the other hand is created using new() so gets created outside of pool, but in heap
 so now
 a == b and a.equals(b) returns true, true as both have same values and same mem addr
 while a == c and a.equals(c) returns false, true because while values are same,
 addr differs as one is in pool, the other outside of it**/
public class StringComparison {
    public static void main(String[] args) {
        String a = "CGPT";
        String b = "CGPT";
        String c = new String("CGPT");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
