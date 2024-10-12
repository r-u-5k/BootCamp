package nongeneric;

public class MyArrayList {
	private Object[] elementData;
	private int size;
	public MyArrayList() {
		elementData = new Object[0];
		size = elementData.length;
	}
	
	public int size() {
		return size;
	}
	
	public void add(Object element) {
		Object[] tempElementData = new Object[elementData.length + 1];
		for (int i = 0; i < elementData.length; i++) {
			tempElementData[i] = elementData[i];
		}
		tempElementData[elementData.length] = element;
		this.elementData = tempElementData;
		this.size = this.elementData.length;
	}
	
	public Object get(int index) {
		if (index < 0 || index > this.elementData.length - 1) {
			throw new ArrayIndexOutOfBoundsException("??");
		}
		return this.elementData[index];
	}
	
}
