package com.sample.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Afford")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prod_id;
   
    @Column(name = "UsersName", nullable = false)
    private String productname;

    @Column(name ="Phonenumber" , nullable = false)
    private long price;

    @Column(name ="email_id" , nullable = false, unique = true)
    private float ratings;

    @Column(name ="pass" , nullable = false)
    private int  discount;

    @Column(name = "Confirm_password" , nullable= false)
    private String availability;
    
}
