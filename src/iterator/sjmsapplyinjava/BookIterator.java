package iterator.sjmsapplyinjava;


public class BookIterator<T> implements Iterator<T>{
	
	private int index=0;
	private BookShelf books;
	
	
	public BookIterator(BookShelf books) {
		super();
		this.books = books;
	}

	@Override
	public boolean hasNext() {
		return (books.getLength()>index ? true : false);
	}

	@Override
	public T next() {
		return (T) books.getBookAt(index++);
	}

}
