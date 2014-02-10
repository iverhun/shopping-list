package ua.gb.shoppinglist;

/**
 * @deprecated should bedeleted in future
 */
public class SortableObject implements Comparable<SortableObject> {

	private long id;
	private String value;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public SortableObject(long id, String value) {
		this.id = id;
		this.value = value;

	}
	public void setId_setValue(long id, String value) {
		this.id = id;
		this.value = value;
	}

    public int compareTo(SortableObject o) {
        // ����������
		//        int res = 0;
		//        SortableObject compared = (SortableObject) o;
		//        if (compared.id < this.id) {
		//            res = 1;
		//        }
		//        if (compared.id > this.id) {
		//            res = -1;
		//        }
		//        return res;

        SortableObject entry = (SortableObject) o;
        int result = (int) id - (int) entry.id;
		if (result != 0) return (int)(result/Math.abs(result));

		result = value.compareTo(entry.value);
		return (result != 0) ? (int)(result/Math.abs(result)) : 0;
	}

	public String toString() {
		return "id = "+this.id+"           value = "+this.value;
	}  
  
     	
	
}