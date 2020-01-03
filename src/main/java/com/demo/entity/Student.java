package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    private int rollNo;
    private String name;
    private int marks;
   /* @OneToOne
    private Laptop laptop;
*/
   @OneToMany
   private List<Laptop> laptop = new ArrayList<Laptop>();

    public Student() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("rollNo=").append(rollNo);
        sb.append(", name='").append(name).append('\'');
        sb.append(", marks=").append(marks);
        sb.append(", laptop=").append(laptop);
        sb.append('}');
        return sb.toString();
    }
}
