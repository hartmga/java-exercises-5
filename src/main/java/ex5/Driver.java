package ex5;

import java.util.Iterator;
import java.util.TreeSet;

/*
5.	Create two classes. The first class is called Student with two variables.
The second class class Driver that contains a main method to make it a Java application.
a.	The scores cannot be duplicates so use a data structure that makes sense here to store the Student objects.
b.	Make sure you add any appropriate methods and constructors that conform to good programming practice.
c.	Sort the data structure by score. How do you do this? Investigate whether the structure you use can use
	a method to compare objects.
d.	Can you do this at least two ways? Method 1: Student implements an interface. What does this mean?
	Method 2: Use a lambda expression when you create the data structure. This is functional programming. Review this. Remember functional interfaces. 

 */

public class Driver {

	public static void main(String[] args) {

		// the problem says in (a) that student score must be unique, so a TreeSet
		// is used to enforce uniqueness while also maintaining the order of the
		// students. Sorting is not a separate step, since order is maintained
		// as students are added.

		// using a lambda expression
		TreeSet<Student> students1 = new TreeSet<>((s1, s2) -> s1.getScore() - s2.getScore());
		// using student's implementation of compareTo
		TreeSet<Student> students2 = new TreeSet<>();

		for (int i = 0; i < 10; i++) {
			Student next = new Student(75 + 2 * i, "StudentNo" + i);
			students1.add(next);
			students2.add(next);
		}

		// as expected, both TreeSets have the same order
		Iterator<Student> itr1 = students1.iterator();
		Iterator<Student> itr2 = students2.iterator();
		System.out.println("with lambda expression | with student's compareTo");
		System.out.println("-----------------------|--------------------------");
		while (itr1.hasNext() && itr2.hasNext()) {
			Student s1 = itr1.next();
			Student s2 = itr2.next();
			System.out.printf("%-22s | %-22s%n", s1, s2);
		}
	}

}
