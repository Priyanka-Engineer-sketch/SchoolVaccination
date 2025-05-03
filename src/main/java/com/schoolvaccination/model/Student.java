package com.schoolvaccination.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Student
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-28T23:54:16.732248500+05:30[Asia/Calcutta]")
public class Student {

  private Integer studentId;

  private String fullName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dob;

  private String gender;

  private String className;

  private String section;

  private Integer rollNumber;

  private String contactInfo;

  private Boolean vaccinated;

  private Integer vaccinationRecordId;

  public Student studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

  /**
   * Get studentId
   * @return studentId
  */
  
  @Schema(name = "studentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("studentId")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public Student fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  
  @Schema(name = "fullName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Student dob(Date dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  */
  @Valid 
  @Schema(name = "dob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dob")
  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public Student gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Student className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
  */
  
  @Schema(name = "className", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("className")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public Student section(String section) {
    this.section = section;
    return this;
  }

  /**
   * Get section
   * @return section
  */
  
  @Schema(name = "section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("section")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public Student rollNumber(Integer rollNumber) {
    this.rollNumber = rollNumber;
    return this;
  }

  /**
   * Get rollNumber
   * @return rollNumber
  */
  
  @Schema(name = "rollNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rollNumber")
  public Integer getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(Integer rollNumber) {
    this.rollNumber = rollNumber;
  }

  public Student contactInfo(String contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  /**
   * Get contactInfo
   * @return contactInfo
  */
  
  @Schema(name = "contactInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactInfo")
  public String getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(String contactInfo) {
    this.contactInfo = contactInfo;
  }

  public Student vaccinated(Boolean vaccinated) {
    this.vaccinated = vaccinated;
    return this;
  }

  /**
   * Get vaccinated
   * @return vaccinated
  */
  
  @Schema(name = "vaccinated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaccinated")
  public Boolean getVaccinated() {
    return vaccinated;
  }

  public void setVaccinated(Boolean vaccinated) {
    this.vaccinated = vaccinated;
  }

  public Student vaccinationRecordId(Integer vaccinationRecordId) {
    this.vaccinationRecordId = vaccinationRecordId;
    return this;
  }

  /**
   * Get vaccinationRecordId
   * @return vaccinationRecordId
  */
  
  @Schema(name = "vaccinationRecordId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaccinationRecordId")
  public Integer getVaccinationRecordId() {
    return vaccinationRecordId;
  }

  public void setVaccinationRecordId(Integer vaccinationRecordId) {
    this.vaccinationRecordId = vaccinationRecordId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.studentId, student.studentId) &&
        Objects.equals(this.fullName, student.fullName) &&
        Objects.equals(this.dob, student.dob) &&
        Objects.equals(this.gender, student.gender) &&
        Objects.equals(this.className, student.className) &&
        Objects.equals(this.section, student.section) &&
        Objects.equals(this.rollNumber, student.rollNumber) &&
        Objects.equals(this.contactInfo, student.contactInfo) &&
        Objects.equals(this.vaccinated, student.vaccinated) &&
        Objects.equals(this.vaccinationRecordId, student.vaccinationRecordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, fullName, dob, gender, className, section, rollNumber, contactInfo, vaccinated, vaccinationRecordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    rollNumber: ").append(toIndentedString(rollNumber)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    vaccinated: ").append(toIndentedString(vaccinated)).append("\n");
    sb.append("    vaccinationRecordId: ").append(toIndentedString(vaccinationRecordId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

