package com.eshop.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Category {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "category_id")
    private int categoryId;
    @Basic
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "categoryByCategoryId")
    private Collection<Computer> computersByCategoryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryByCategoryId")
    private Collection<Phone> phonesByCategoryId;

    public Category() {
    }
    public Category(Integer id){
        this.categoryId =id;
    }
    public Category(int id, String categoryName) {
        this.categoryId = id;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryId != category.categoryId) return false;
        if (categoryName != null ? !categoryName.equals(category.categoryName) : category.categoryName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }

    public Collection<Computer> getComputersByCategoryId() {
        return computersByCategoryId;
    }

    public void setComputersByCategoryId(Collection<Computer> computersByCategoryId) {
        this.computersByCategoryId = computersByCategoryId;
    }


    public Collection<Phone> getPhonesByCategoryId() {
        return phonesByCategoryId;
    }

    public void setPhonesByCategoryId(Collection<Phone> phonesByCategoryId) {
        this.phonesByCategoryId = phonesByCategoryId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'';
    }
}