package com.schoolvaccination.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VaccinationCenter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-28T23:54:16.732248500+05:30[Asia/Calcutta]")
public class VaccinationCenter {

  private Integer centerId;

  private String vaccinationCenter;

  private String address;

  private String contactNumber;

  private Double longitude;

  private Double latitude;

  private String status;

  public VaccinationCenter centerId(Integer centerId) {
    this.centerId = centerId;
    return this;
  }

  /**
   * Get centerId
   * @return centerId
  */
  
  @Schema(name = "centerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("centerId")
  public Integer getCenterId() {
    return centerId;
  }

  public void setCenterId(Integer centerId) {
    this.centerId = centerId;
  }

  public VaccinationCenter vaccinationCenter(String vaccinationCenter) {
    this.vaccinationCenter = vaccinationCenter;
    return this;
  }

  /**
   * Get vaccinationCenter
   * @return vaccinationCenter
  */
  
  @Schema(name = "vaccinationCenter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaccinationCenter")
  public String getVaccinationCenter() {
    return vaccinationCenter;
  }

  public void setVaccinationCenter(String vaccinationCenter) {
    this.vaccinationCenter = vaccinationCenter;
  }

  public VaccinationCenter address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public VaccinationCenter contactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
    return this;
  }

  /**
   * Get contactNumber
   * @return contactNumber
  */
  
  @Schema(name = "contactNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactNumber")
  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public VaccinationCenter longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public VaccinationCenter latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public VaccinationCenter status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaccinationCenter vaccinationCenter = (VaccinationCenter) o;
    return Objects.equals(this.centerId, vaccinationCenter.centerId) &&
        Objects.equals(this.vaccinationCenter, vaccinationCenter.vaccinationCenter) &&
        Objects.equals(this.address, vaccinationCenter.address) &&
        Objects.equals(this.contactNumber, vaccinationCenter.contactNumber) &&
        Objects.equals(this.longitude, vaccinationCenter.longitude) &&
        Objects.equals(this.latitude, vaccinationCenter.latitude) &&
        Objects.equals(this.status, vaccinationCenter.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centerId, vaccinationCenter, address, contactNumber, longitude, latitude, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaccinationCenter {\n");
    sb.append("    centerId: ").append(toIndentedString(centerId)).append("\n");
    sb.append("    vaccinationCenter: ").append(toIndentedString(vaccinationCenter)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

