package ua.gb.shoppinglist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity (Сущность) — POJO-класс, связанный с БД с помощью аннотации (@Entity) или через XML. 
 * К такому классу предъявляются следующие требования:
 *
 *   Должен иметь пустой конструктор (public или protected)
 *   Не может быть вложенным, интерфейсом или enum
 *   Не может быть final и не может содержать final-полей/свойств
 *   Должен содержать хотя бы одно @Id-поле
 *
 * @author Andriy
 *
 */
@Entity
@Table(name="sortable_object")
public class SortableObject {

    @Id    
    @Column(name = "Id")
    private long id;


    @Column(name = "Value")
    private String value;
        

    public SortableObject() {
        // no-op constructore. Used by Hibernate
    }
    
    public SortableObject(String value) {
        this.value = value;
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
