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
 * VaccineInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-28T23:54:16.732248500+05:30[Asia/Calcutta]")
public class VaccineInfo {

  private Integer vaccineId;

  private String vaccineName;

  private String vaccineInfo;

  public VaccineInfo vaccineId(Integer vaccineId) {
    this.vaccineId = vaccineId;
    return this;
  }

  /**
   * Get vaccineId
   * @return vaccineId
  */
  
  @Schema(name = "vaccineId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaccineId")
  public Integer getVaccineId() {
    return vaccineId;
  }

  public void setVaccineId(Integer vaccineId) {
    this.vaccineId = vaccineId;
  }

  public VaccineInfo vaccineName(String vaccineName) {
    this.vaccineName = vaccineName;
    return this;
  }

  /**
   * Get vaccineName
   * @return vaccineName
  */
  
  @Schema(name = "vaccineName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaccineName")
  public String getVaccineName() {
    return vaccineName;
  }

  public void setVaccineName(String vaccineName) {
    this.vaccineName = vaccineName;
  }

  public VaccineInfo vaccineInfo(String vaccineInfo) {
    this.vaccineInfo = vaccineInfo;
    return this;
  }

  /**
   * Get vaccineInfo
   * @return vaccineInfo
  */
  
  @Schema(name = "vaccineInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaccineInfo")
  public String getVaccineInfo() {
    return vaccineInfo;
  }

  public void setVaccineInfo(String vaccineInfo) {
    this.vaccineInfo = vaccineInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaccineInfo vaccineInfo = (VaccineInfo) o;
    return Objects.equals(this.vaccineId, vaccineInfo.vaccineId) &&
        Objects.equals(this.vaccineName, vaccineInfo.vaccineName) &&
        Objects.equals(this.vaccineInfo, vaccineInfo.vaccineInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaccineId, vaccineName, vaccineInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaccineInfo {\n");
    sb.append("    vaccineId: ").append(toIndentedString(vaccineId)).append("\n");
    sb.append("    vaccineName: ").append(toIndentedString(vaccineName)).append("\n");
    sb.append("    vaccineInfo: ").append(toIndentedString(vaccineInfo)).append("\n");
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

