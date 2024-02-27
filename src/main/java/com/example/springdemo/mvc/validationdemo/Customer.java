package com.example.springdemo.mvc.validationdemo;

import com.example.springdemo.mvc.validationdemo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull(message = "is Required")
    @Size(min = 1,message = "is Required")
    private String lastName;
    @NotNull(message = "is Required")
    @Max(value = 9, message = "Value should be less than 9")
    @Min(value = 0, message = "value must me greater than 0")
    private Integer freePasses;

    @NotNull(message = "is Required")
    @Pattern(regexp="^[a-zA-Z0-9]{5}", message = "only 5 character or digits")
    private String postalCode;

    @CourseCode(value = "RUDANI",message = "must start with RUDANI")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCoode) {
        this.postalCode = postalCoode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

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
}
