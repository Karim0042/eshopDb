package com.eshop.entity;

import javax.persistence.*;

@Entity
public class Computer {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic(optional = false)
    @Column(name = "idcomputer")
    private Integer idcomputer;
    @Basic(optional = false)
    @Column(name = "brand")
    private String brand;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @Column(name = "ram")
    private int ram;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = true)
    private Category categoryByCategoryId;

    public Computer(Integer idComputer, String brand, String color, int ram, Category category) {
        this.idcomputer = idComputer;
        this.brand = brand;
        this.color = color;
        this.ram = ram;
        this.categoryByCategoryId = category;
    }

    public Computer() {
    }

    public int getIdcomputer() {
        return idcomputer;
    }

    public void setIdcomputer(int idcomputer) {
        this.idcomputer = idcomputer;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (idcomputer != computer.idcomputer) return false;
        if (ram != computer.ram) return false;
        if (brand != null ? !brand.equals(computer.brand) : computer.brand != null) return false;
        if (color != null ? !color.equals(computer.color) : computer.color != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcomputer;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + ram;
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
        return "Computer{" +
                "idcomputer=" + idcomputer +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", ram=" + ram;
    }


}
