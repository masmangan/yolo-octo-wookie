package listaencadeada;

public class ListLinked<E> implements ListTAD<E> {

	private class Node<E> {
		public E element;
		public Node<E> next;

		public Node(E e) {
			element = e;
			next = null;
		}
	}

	private Node<E> head;
	private Node<E> tail;
	private int count;

	public ListLinked() {
		clear();
	}

	/**
	 * 
	 * @param i
	 */
	public void removeAt(E i) {
		remove(i);
	}

	@Override
	public String toString() {
		String s = "[";
		Node<E> n = head;
		if (n == null) {
			return "[]";
		}
		s += n.element;
		n = n.next;
		while (n != null) {
			s += ", " + n.element;
			n = n.next;
		}
		s += "]";
		return s;
	}

	@Override
	public void add(E e) {
		// a) Criar um novo nodo
		Node<E> newNode = new Node<E>(e);
		// b) Apontar do último nodo da lista (tail) para o novo
		Node<E> t = tail;
		tail = newNode;
		// c) Aumentar o total de elementos em um (count)
		count++;
		// d) Agora, o último nodo passa a ser o novo
		if (t == null)
			head = newNode;
		else
			t.next = newNode;
	}

	@Override
	public void add(int index, E element) {
		//  a) Criar um novo nodo
		Node<E> newNode = new Node<E>(element);
		//  b) Se a posição for inválida, gerar IndexOutOfBoundsException
		if (index < 0 || index > count) {
			throw new IndexOutOfBoundsException();
		}
		// TODO c) "Caminhar" até a posição anterior à desejada (ant)
		// FIXME fatorar com add
		if (head == null) {
			head = newNode;
			tail = newNode;
			count++;
			return;
		}
		
		Node<E> ant = head;
		for (int i = 0; i < index - 1; i++) {
			ant = ant.next;
		}
		
		Node<E> target = ant.next;
		// TODO d) Apontar de ant para o novo nodo
		ant.next = newNode;
		// TODO e) Apontar do novo para o seguinte (target)
		newNode.next = target;
		// TODO f) Aumentar o total de elementos em um (count)
		count++;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(int index, E element) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		count--;
		return false;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		count--;
		return null;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
		count = 0;
	}
}
