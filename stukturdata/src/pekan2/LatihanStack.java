package pekan2;

import java.util.Stack;
public class LatihanStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(42);
		s.push(-3);
		s.push(17);
		
		System.out.println("Nilai stack = " + s);
		System.out.println("Niilai pop = " + s.pop());
		System.out.println("Nilai stack setelah pop = " + s);
		System.out.println("Nilai peek = " + s.peek());
		System.out.println("Nilai stack setelah peek = " + s);
		

	}

}
