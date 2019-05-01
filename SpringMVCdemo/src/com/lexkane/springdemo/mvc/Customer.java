package com.lexkane.springdemo.mvc;

import com.lexkane.springdemo.mvc.validation.CourseCode;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

  private String firstName;

  @NotNull(message = "Please, fill information here")
  @Size(min = 1, message = "Please, fill information here")
  private String lastName;

  @NotNull(message = "Please, fill information here")
  @Min(value=0, message = "Please, fill digit >= 0")
  @Max(value=10, message = "Please, fill digit <= 10")
  private Integer freePasses;


  @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Please, fill only 5 chars or digits")
  private String postalCode;

  @CourseCode(value = "VERC", message = "Must start with VERC")
  private String courseCode;

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

  public Integer getFreePasses() {
    return freePasses;
  }

  public void setFreePasses(Integer freePasses) {
    this.freePasses = freePasses;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }
}
