package com.app.credentials.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Employee_Credentials")
public class EmployeeCredentials {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;
}
