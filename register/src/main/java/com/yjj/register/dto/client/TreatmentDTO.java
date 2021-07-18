package com.yjj.register.dto.client;

public class TreatmentDTO {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TreatmentDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
