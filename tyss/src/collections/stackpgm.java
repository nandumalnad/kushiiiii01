package collections;

import java.util.Stack;

public class stackpgm {
public static void main(String[] args) {
	Stack<Object> st = new Stack<Object>();     // Last In First Out
	st.push(20);
	st.push(10);  //Last IN
	System.out.println(st.pop()); //10         //FIRST OUT
	System.out.println(st.pop());//20
		
}
}
