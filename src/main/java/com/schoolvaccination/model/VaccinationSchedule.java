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
 * VaccinationSchedule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-28T23:54:16.732248500+05:30[Asia/Calcutta]")
public class VaccinationSchedule {

  private Integer scheduleId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date date;

  private String timeStart;

  private String timeEnd;

  private Integer vaccinationCenterId;

  private Integer vaccineInfoId;

  private Integer slotsAvailable;

  public VaccinationSchedule scheduleId(Integer scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * Get scheduleId
   * @return scheduleId
  */
  
  @Schema(name = "scheduleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduleId")
  public Integer getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(Integer scheduleId) {
    this.scheduleId = scheduleId;
  }

  public VaccinationSchedule date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @Valid 
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public VaccinationSchedule timeStart(String timeStart) {
    this.timeStart = timeStart;
    return this;
  }

  /**
   * Get timeStart
   * @return timeStart
  */
  
  @Schema(name = "timeStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeStart")
  public String getTimeStart() {
    return timeStart;
  }

  public void setTimeStart(String timeStart) {
    this.timeStart = timeStart;
  }

  public VaccinationSchedule timeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
    return this;
  }

  /**
   * Get timeEnd
   * @return timeEnd
  */
  
  @Schema(name = "timeEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeEnd")
  public String getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  public VaccinationSchedule vaccinationCenterId(Integer vaccinationCenterId) {
    this.vaccinationCenterId = vaccinationCenterId;
    return this;
  }

  /**
   * Get vaccinationCenterId
   * @return vaccinationCenterId
  */
  
  @Schema(name = "vaccinationCenterId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vaccinationCenterId")
  public Integer getVaccinationCenterId() {
    return vaccinationCenterId;
  }

  public void setVaccinationCenterId(Integer vaccinationCenterId) {
    this.vaccinationCenterId = vaccinationCenterId;
  }

  public VaccinationSchedule vaccineInfoId(Integer vaccineInfoId) {
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

  public VaccinationSchedule slotsAvailable(Integer slotsAvailable) {
    this.slotsAvailable = slotsAvailable;
    return this;
  }

  /**
   * Get slotsAvailable
   * @return slotsAvailable
  */
  
  @Schema(name = "slotsAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slotsAvailable")
  public Integer getSlotsAvailable() {
    return slotsAvailable;
  }

  public void setSlotsAvailable(Integer slotsAvailable) {
    this.slotsAvailable = slotsAvailable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaccinationSchedule vaccinationSchedule = (VaccinationSchedule) o;
    return Objects.equals(this.scheduleId, vaccinationSchedule.scheduleId) &&
        Objects.equals(this.date, vaccinationSchedule.date) &&
        Objects.equals(this.timeStart, vaccinationSchedule.timeStart) &&
        Objects.equals(this.timeEnd, vaccinationSchedule.timeEnd) &&
        Objects.equals(this.vaccinationCenterId, vaccinationSchedule.vaccinationCenterId) &&
        Objects.equals(this.vaccineInfoId, vaccinationSchedule.vaccineInfoId) &&
        Objects.equals(this.slotsAvailable, vaccinationSchedule.slotsAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, date, timeStart, timeEnd, vaccinationCenterId, vaccineInfoId, slotsAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaccinationSchedule {\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timeStart: ").append(toIndentedString(timeStart)).append("\n");
    sb.append("    timeEnd: ").append(toIndentedString(timeEnd)).append("\n");
    sb.append("    vaccinationCenterId: ").append(toIndentedString(vaccinationCenterId)).append("\n");
    sb.append("    vaccineInfoId: ").append(toIndentedString(vaccineInfoId)).append("\n");
    sb.append("    slotsAvailable: ").append(toIndentedString(slotsAvailable)).append("\n");
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

