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
 * VaccinationRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-28T23:54:16.732248500+05:30[Asia/Calcutta]")
public class VaccinationRecord {

  private Integer recordId;

  private Integer registrationId;

  private Integer vaccineInfoId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date firstDoseDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date secondDoseDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date boosterDoseDate;

  private Boolean vaccineBooster;

  private Integer frontLinerId;

  private String doctorComments;

  private String patientFeelings;

  private String remarks;

  public VaccinationRecord recordId(Integer recordId) {
    this.recordId = recordId;
    return this;
  }

  /**
   * Get recordId
   * @return recordId
  */
  
  @Schema(name = "recordId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordId")
  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

  public VaccinationRecord registrationId(Integer registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Get registrationId
   * @return registrationId
  */
  
  @Schema(name = "registrationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationId")
  public Integer getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(Integer registrationId) {
    this.registrationId = registrationId;
  }

  public VaccinationRecord vaccineInfoId(Integer vaccineInfoId) {
    this.vaccineInfoId = vaccineInfoId;
    return this;
  }

  /**
   * Get vaccineInfoId
   * @return vaccineInfoId
  */
  
  @Schema(name = "vaccineInfoId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaccineInfoId")
  public Integer getVaccineInfoId() {
    return vaccineInfoId;
  }

  public void setVaccineInfoId(Integer vaccineInfoId) {
    this.vaccineInfoId = vaccineInfoId;
  }

  public VaccinationRecord firstDoseDate(Date firstDoseDate) {
    this.firstDoseDate = firstDoseDate;
    return this;
  }

  /**
   * Get firstDoseDate
   * @return firstDoseDate
  */
  @Valid 
  @Schema(name = "firstDoseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstDoseDate")
  public Date getFirstDoseDate() {
    return firstDoseDate;
  }

  public void setFirstDoseDate(Date firstDoseDate) {
    this.firstDoseDate = firstDoseDate;
  }

  public VaccinationRecord secondDoseDate(Date secondDoseDate) {
    this.secondDoseDate = secondDoseDate;
    return this;
  }

  /**
   * Get secondDoseDate
   * @return secondDoseDate
  */
  @Valid 
  @Schema(name = "secondDoseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondDoseDate")
  public Date getSecondDoseDate() {
    return secondDoseDate;
  }

  public void setSecondDoseDate(Date secondDoseDate) {
    this.secondDoseDate = secondDoseDate;
  }

  public VaccinationRecord boosterDoseDate(Date boosterDoseDate) {
    this.boosterDoseDate = boosterDoseDate;
    return this;
  }

  /**
   * Get boosterDoseDate
   * @return boosterDoseDate
  */
  @Valid 
  @Schema(name = "boosterDoseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boosterDoseDate")
  public Date getBoosterDoseDate() {
    return boosterDoseDate;
  }

  public void setBoosterDoseDate(Date boosterDoseDate) {
    this.boosterDoseDate = boosterDoseDate;
  }

  public VaccinationRecord vaccineBooster(Boolean vaccineBooster) {
    this.vaccineBooster = vaccineBooster;
    return this;
  }

  /**
   * Get vaccineBooster
   * @return vaccineBooster
  */
  
  @Schema(name = "vaccineBooster", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaccineBooster")
  public Boolean getVaccineBooster() {
    return vaccineBooster;
  }

  public void setVaccineBooster(Boolean vaccineBooster) {
    this.vaccineBooster = vaccineBooster;
  }

  public VaccinationRecord frontLinerId(Integer frontLinerId) {
    this.frontLinerId = frontLinerId;
    return this;
  }

  /**
   * Get frontLinerId
   * @return frontLinerId
  */
  
  @Schema(name = "frontLinerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frontLinerId")
  public Integer getFrontLinerId() {
    return frontLinerId;
  }

  public void setFrontLinerId(Integer frontLinerId) {
    this.frontLinerId = frontLinerId;
  }

  public VaccinationRecord doctorComments(String doctorComments) {
    this.doctorComments = doctorComments;
    return this;
  }

  /**
   * Get doctorComments
   * @return doctorComments
  */
  
  @Schema(name = "doctorComments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("doctorComments")
  public String getDoctorComments() {
    return doctorComments;
  }

  public void setDoctorComments(String doctorComments) {
    this.doctorComments = doctorComments;
  }

  public VaccinationRecord patientFeelings(String patientFeelings) {
    this.patientFeelings = patientFeelings;
    return this;
  }

  /**
   * Get patientFeelings
   * @return patientFeelings
  */
  
  @Schema(name = "patientFeelings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("patientFeelings")
  public String getPatientFeelings() {
    return patientFeelings;
  }

  public void setPatientFeelings(String patientFeelings) {
    this.patientFeelings = patientFeelings;
  }

  public VaccinationRecord remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Get remarks
   * @return remarks
  */
  
  @Schema(name = "remarks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remarks")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaccinationRecord vaccinationRecord = (VaccinationRecord) o;
    return Objects.equals(this.recordId, vaccinationRecord.recordId) &&
        Objects.equals(this.registrationId, vaccinationRecord.registrationId) &&
        Objects.equals(this.vaccineInfoId, vaccinationRecord.vaccineInfoId) &&
        Objects.equals(this.firstDoseDate, vaccinationRecord.firstDoseDate) &&
        Objects.equals(this.secondDoseDate, vaccinationRecord.secondDoseDate) &&
        Objects.equals(this.boosterDoseDate, vaccinationRecord.boosterDoseDate) &&
        Objects.equals(this.vaccineBooster, vaccinationRecord.vaccineBooster) &&
        Objects.equals(this.frontLinerId, vaccinationRecord.frontLinerId) &&
        Objects.equals(this.doctorComments, vaccinationRecord.doctorComments) &&
        Objects.equals(this.patientFeelings, vaccinationRecord.patientFeelings) &&
        Objects.equals(this.remarks, vaccinationRecord.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordId, registrationId, vaccineInfoId, firstDoseDate, secondDoseDate, boosterDoseDate, vaccineBooster, frontLinerId, doctorComments, patientFeelings, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaccinationRecord {\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    vaccineInfoId: ").append(toIndentedString(vaccineInfoId)).append("\n");
    sb.append("    firstDoseDate: ").append(toIndentedString(firstDoseDate)).append("\n");
    sb.append("    secondDoseDate: ").append(toIndentedString(secondDoseDate)).append("\n");
    sb.append("    boosterDoseDate: ").append(toIndentedString(boosterDoseDate)).append("\n");
    sb.append("    vaccineBooster: ").append(toIndentedString(vaccineBooster)).append("\n");
    sb.append("    frontLinerId: ").append(toIndentedString(frontLinerId)).append("\n");
    sb.append("    doctorComments: ").append(toIndentedString(doctorComments)).append("\n");
    sb.append("    patientFeelings: ").append(toIndentedString(patientFeelings)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
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

