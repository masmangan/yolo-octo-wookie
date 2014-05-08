package listaencadeada;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListLinkedTest {

	public void test() {
		ListLinked<Integer> lista = new ListLinked<Integer>();
		lista.add(12);
		System.out.println(lista);
		lista.add(7);
		System.out.println(lista);		
		lista.add(11);
		System.out.println(lista);		
		lista.add(5);
		System.out.println(lista);		
		lista.removeAt(2);
		System.out.println(lista);		
		String actual = lista.toString();
		String expected = "[12, 7, 5]";
		assertEquals(actual, expected);
	}
	
	@Test
	public void testAddFirstIndex() {
		ListLinked<Integer> lista = new ListLinked<Integer>();
		lista.add(0, 12);
		System.out.println(lista);
		String actual = lista.toString();
		String expected = "[12]";
		assertEquals(actual, expected);
	}
}
