package ex5;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {

	private int score;
	private String name;

	@Override
	public int compareTo(Student other) {
		return this.score - other.score;
	}

	@Override
	public String toString() {
		return name + ": " + score;
	}
}
