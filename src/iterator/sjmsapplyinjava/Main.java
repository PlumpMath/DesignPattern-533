package iterator.sjmsapplyinjava;

public class Main {

	public static void main(String[] args) {
		BookShelf books = new BookShelf(4);
		books.appendBook(new Book("A"));
		books.appendBook(new Book("B"));
		books.appendBook(new Book("C"));
		books.appendBook(new Book("D"));
		
		Iterator it = books.iterator();
		while(it.hasNext()){
			System.out.println(((Book)it.next()).getName());
		}
	}
}
