package ua.gb.shoppinglist;

import java.util.Comparator;

@Deprecated
public class SortableObjectComparator {

    public static Comparator<SortableObject> IdValueAscComparator = new Comparator<SortableObject>() {

        public int compare(SortableObject obj1, SortableObject obj2) {
            SortableObject entry1 = obj1;
            SortableObject entry2 = obj2;

            int result = (int) entry1.getId() - (int) entry2.getId();
            if (result != 0)
                return (int) (result / Math.abs(result));

            result = entry1.getValue().compareTo(entry2.getValue());

            return result;
        }
    };

    public static Comparator<SortableObject> IdValueDescComparator = new Comparator<SortableObject>() {

        public int compare(SortableObject obj1, SortableObject obj2) {
            SortableObject entry1 = obj1;
            SortableObject entry2 = obj2;

            int result = (int) entry2.getId() - (int) entry1.getId();
            if (result != 0)
                return (int) (result / Math.abs(result));

            result = entry2.getValue().compareTo(entry1.getValue());

            return result;
        }
    };

    public static Comparator<SortableObject> IdAscComparator = new Comparator<SortableObject>() {

        public int compare(SortableObject obj1, SortableObject obj2) {
            SortableObject entry1 = obj1;
            SortableObject entry2 = obj2;

            int result = (int) entry1.getId() - (int) entry2.getId();
            if (result != 0)
                return (int) (result / Math.abs(result));
            return result;
        }
    };

    public static Comparator<SortableObject> ValueAscComparator = new Comparator<SortableObject>() {

        public int compare(SortableObject obj1, SortableObject obj2) {
            SortableObject entry1 = obj1;
            SortableObject entry2 = obj2;

            int result = entry1.getValue().compareTo(entry2.getValue());
            return result;
        }
    };

}
