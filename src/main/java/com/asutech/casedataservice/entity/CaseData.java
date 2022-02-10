package com.asutech.casedataservice.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class CaseData implements Serializable {

    @Id
    @SequenceGenerator(name="seq_case_data",allocationSize = 1)
    @GeneratedValue(generator = "seq_case_data",strategy = GenerationType.SEQUENCE)
    private Long id;

    private String textField;

    private String numberField;

    private String phoneUKField;

    private String emailField;

    private String moneyGBPField;

    private String dateField;

    private String dateTimeField;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public String getNumberField() {
        return numberField;
    }

    public void setNumberField(String numberField) {
        this.numberField = numberField;
    }
    public String getPhoneUKField() {
        return phoneUKField;
    }

    public void setPhoneUKField(String phoneUKField) {
        this.phoneUKField = phoneUKField;
    }

    public String getEmailField() {
        return emailField;
    }

    public void setEmailField(String emailField) {
        this.emailField = emailField;
    }

    public String getMoneyGBPField() {
        return moneyGBPField;
    }

    public void setMoneyGBPField(String moneyGBPField) {
        this.moneyGBPField = moneyGBPField;
    }

    public String getDateField() {
        return dateField;
    }

    public void setDateField(String dateField) {
        this.dateField = dateField;
    }

    public String getDateTimeField() {
        return dateTimeField;
    }

    public void setDateTimeField(String dateTimeField) {
        this.dateTimeField = dateTimeField;
    }

}
