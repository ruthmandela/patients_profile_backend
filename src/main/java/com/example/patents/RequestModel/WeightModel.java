package com.example.patents.RequestModel;


import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "patient_logs")

public class WeightModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "firstName")
    String firstName;
    @Column(name = "lastName")
    String lastName;
    @Column(name = "weight")
    String weight;
    @Column(name = "height")
    String height;
    @Column(name = "bmi")
    String bmi;
    @Column(name = "status")
    String status;
    @Column(name = "age")
    String age;
    @Column(name = "ondiet")
    String onDiet;
    @Column(name = "generalHealth")
    String generalHealth;
    @Column(name = "takingDrugs")
    String takingDrugs;
    @Column(name = "coments")
    String coments;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOnDiet() {
        return onDiet;
    }

    public void setOnDiet(String onDiet) {
        this.onDiet = onDiet;
    }

    public String getGeneralHealth() {
        return generalHealth;
    }

    public void setGeneralHealth(String generalHealth) {
        this.generalHealth = generalHealth;
    }

    public String getTakingDrugs() {
        return takingDrugs;
    }

    public void setTakingDrugs(String takingDrugs) {
        this.takingDrugs = takingDrugs;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }
}
