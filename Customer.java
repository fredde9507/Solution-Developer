package com.example.demo;

import org.springframework.aop.interceptor.CustomizableTraceInterceptor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   private String name;
   private String surname;
   private Date birthDate;
   private int phoneNumber;
   private String email;


  /*public Customer(String name, String surname, double birthDate, int phoneNumber, String email) {
       this.name = name;
       this.surname = surname;
       this.birthDate = birthDate;
       this.phoneNumber = phoneNumber;
       this.email = email;
   }*/
   public long getId(){
       return id;
   }
   public String getName(){
       return name;
   }
   public String getSurname(){
       return surname;
   }
    public Date getBirthDate(){

       return birthDate;
    }
    public int getPhoneNumber(){

       return phoneNumber;
    }
    public String getEmail(){

       return email;
    }
    public void setName(String name){

       this.name = name;
}
    public void setSurname(String surname){

       this.surname = surname;
}
    public void setBirthDate(Date birthDate){

       this.birthDate = birthDate;
}
    public void setPhoneNumber (int phoneNumber){
       this.phoneNumber = phoneNumber;
}
    public void setEmail (String email) {

       this.email = email;
}

    }

