package ua.gb.shoppinglist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sortable_object")
public class SortableObject {

    @Id
    private long id;

    @Column
    private String value;

    public SortableObject() {
        // no-op constructore. Used by Hibernate
    }

    public SortableObject(long id, String value) {
        this.id = id;
        this.value = value;
    }

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

    @Override
    public String toString() {
        return "SortableObject [id=" + id + ", value=" + value + "]";
    }

}
