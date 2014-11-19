package iterator.sjmsapplyinjava;

public interface Iterator<T> {
	
	/**
	 * 判断是否还有下一个
	 * @return
	 * @author 陈超
	 * @date 2014年11月19日
	 */
	public boolean hasNext();
	
	/**
	 * 获取下一个
	 * @return
	 * @author 陈超
	 * @date 2014年11月19日
	 */
	public T next();
}
