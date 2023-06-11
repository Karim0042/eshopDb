package com.eshop.entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Phone {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_phone")
    private Integer idPhone;
    @Basic
    @Column(name = "brand")
    private String brand;
    @Basic
    @Column(name = "color")
    private String color;
    @Basic
    @Column(name = "ram")
    private Integer ram;
    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false)
    private Category categoryByCategoryId;

    public Phone(Integer idPhone, String brand, String color, Integer ram, Category category) {
        this.idPhone = idPhone;
        this.brand = brand;
        this.color = color;
        this.ram = ram;
        this.categoryByCategoryId = category;
    }
    public Phone(){}
    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (idPhone != phone.idPhone) return false;
        if (brand != null ? !brand.equals(phone.brand) : phone.brand != null) return false;
        if (color != null ? !color.equals(phone.color) : phone.color != null) return false;
        if (ram != null ? !ram.equals(phone.ram) : phone.ram != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPhone;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (ram != null ? ram.hashCode() : 0);
        return result;
    }


    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "idPhone=" + idPhone +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", ram='" + ram + '\'' +
                ", categoryByCategoryId=" + categoryByCategoryId +
                '}';
    }
}
