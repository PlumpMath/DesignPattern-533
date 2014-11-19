package iterator.sjmsapplyinjava;


public class BookShelf implements Aggregate{
	
	private Book[] books;
	private int index=0;

	public BookShelf(int size) {
		super();
		books = new Book[size];
	}
	/**
	 * 追加
	 * @param book
	 * @author 陈超
	 * @date 2014年11月19日
	 */
	public void appendBook(Book book){
		books[index]=book;
		index++;
	}
	public Book getBookAt(int index){
		return books[index];
	}
	public int getLength(){
		return books.length;
	}

	@Override
	public Iterator iterator() {
		return new BookIterator(this);
	}

}
