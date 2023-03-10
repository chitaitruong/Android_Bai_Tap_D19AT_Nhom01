package com.example.androidappd19cqat01;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String id;
    private String name;
    private Boolean sex;
    private String birthDate;
    private Boolean isSelected;

    public Boolean getSelected() {
        return isSelected;
    }

    public SinhVien(String id, String name, Boolean sex, String birthDate, Boolean isSelected) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.isSelected = isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    public SinhVien() {
    }

    public SinhVien(String id, String name, Boolean sex, String birthDate) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.isSelected = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
