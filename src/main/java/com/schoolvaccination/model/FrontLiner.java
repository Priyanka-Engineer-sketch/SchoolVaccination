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
 * FrontLiner
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-28T23:54:16.732248500+05:30[Asia/Calcutta]")
public class FrontLiner {

  private Integer frontLinerId;

  private String completeName;

  private Integer frontLinerCategoryId;

  private String contact;

  private String email;

  private String facebookAccount;

  public FrontLiner frontLinerId(Integer frontLinerId) {
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

  public FrontLiner completeName(String completeName) {
    this.completeName = completeName;
    return this;
  }

  /**
   * Get completeName
   * @return completeName
  */
  
  @Schema(name = "completeName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completeName")
  public String getCompleteName() {
    return completeName;
  }

  public void setCompleteName(String completeName) {
    this.completeName = completeName;
  }

  public FrontLiner frontLinerCategoryId(Integer frontLinerCategoryId) {
    this.frontLinerCategoryId = frontLinerCategoryId;
    return this;
  }

  /**
   * Get frontLinerCategoryId
   * @return frontLinerCategoryId
  */
  
  @Schema(name = "frontLinerCategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frontLinerCategoryId")
  public Integer getFrontLinerCategoryId() {
    return frontLinerCategoryId;
  }

  public void setFrontLinerCategoryId(Integer frontLinerCategoryId) {
    this.frontLinerCategoryId = frontLinerCategoryId;
  }

  public FrontLiner contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  
  @Schema(name = "contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public FrontLiner email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public FrontLiner facebookAccount(String facebookAccount) {
    this.facebookAccount = facebookAccount;
    return this;
  }

  /**
   * Get facebookAccount
   * @return facebookAccount
  */
  
  @Schema(name = "facebookAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebookAccount")
  public String getFacebookAccount() {
    return facebookAccount;
  }

  public void setFacebookAccount(String facebookAccount) {
    this.facebookAccount = facebookAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrontLiner frontLiner = (FrontLiner) o;
    return Objects.equals(this.frontLinerId, frontLiner.frontLinerId) &&
        Objects.equals(this.completeName, frontLiner.completeName) &&
        Objects.equals(this.frontLinerCategoryId, frontLiner.frontLinerCategoryId) &&
        Objects.equals(this.contact, frontLiner.contact) &&
        Objects.equals(this.email, frontLiner.email) &&
        Objects.equals(this.facebookAccount, frontLiner.facebookAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontLinerId, completeName, frontLinerCategoryId, contact, email, facebookAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrontLiner {\n");
    sb.append("    frontLinerId: ").append(toIndentedString(frontLinerId)).append("\n");
    sb.append("    completeName: ").append(toIndentedString(completeName)).append("\n");
    sb.append("    frontLinerCategoryId: ").append(toIndentedString(frontLinerCategoryId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    facebookAccount: ").append(toIndentedString(facebookAccount)).append("\n");
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

