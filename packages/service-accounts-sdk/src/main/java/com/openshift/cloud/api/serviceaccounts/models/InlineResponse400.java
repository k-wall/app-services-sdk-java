/*
 * Service Accounts API Documentation
 * This is the API documentation for Service Accounts
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.serviceaccounts.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400Cause;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400CauseStackTrace;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400CauseSuppressed;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400Response;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InlineResponse400
 */
@JsonPropertyOrder({
  InlineResponse400.JSON_PROPERTY_CAUSE,
  InlineResponse400.JSON_PROPERTY_STACK_TRACE,
  InlineResponse400.JSON_PROPERTY_RESPONSE,
  InlineResponse400.JSON_PROPERTY_MESSAGE,
  InlineResponse400.JSON_PROPERTY_LOCALIZED_MESSAGE,
  InlineResponse400.JSON_PROPERTY_SUPPRESSED
})
@JsonTypeName("inline_response_400")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse400 {
  public static final String JSON_PROPERTY_CAUSE = "cause";
  private InlineResponse400Cause cause;

  public static final String JSON_PROPERTY_STACK_TRACE = "stackTrace";
  private List<InlineResponse400CauseStackTrace> stackTrace = null;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private InlineResponse400Response response;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_LOCALIZED_MESSAGE = "localizedMessage";
  private String localizedMessage;

  public static final String JSON_PROPERTY_SUPPRESSED = "suppressed";
  private List<InlineResponse400CauseSuppressed> suppressed = null;

  public InlineResponse400() { 
  }

  public InlineResponse400 cause(InlineResponse400Cause cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse400Cause getCause() {
    return cause;
  }


  @JsonProperty(JSON_PROPERTY_CAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCause(InlineResponse400Cause cause) {
    this.cause = cause;
  }


  public InlineResponse400 stackTrace(List<InlineResponse400CauseStackTrace> stackTrace) {
    
    this.stackTrace = stackTrace;
    return this;
  }

  public InlineResponse400 addStackTraceItem(InlineResponse400CauseStackTrace stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STACK_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InlineResponse400CauseStackTrace> getStackTrace() {
    return stackTrace;
  }


  @JsonProperty(JSON_PROPERTY_STACK_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStackTrace(List<InlineResponse400CauseStackTrace> stackTrace) {
    this.stackTrace = stackTrace;
  }


  public InlineResponse400 response(InlineResponse400Response response) {
    
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse400Response getResponse() {
    return response;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(InlineResponse400Response response) {
    this.response = response;
  }


  public InlineResponse400 message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public InlineResponse400 localizedMessage(String localizedMessage) {
    
    this.localizedMessage = localizedMessage;
    return this;
  }

   /**
   * Get localizedMessage
   * @return localizedMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCALIZED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalizedMessage() {
    return localizedMessage;
  }


  @JsonProperty(JSON_PROPERTY_LOCALIZED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }


  public InlineResponse400 suppressed(List<InlineResponse400CauseSuppressed> suppressed) {
    
    this.suppressed = suppressed;
    return this;
  }

  public InlineResponse400 addSuppressedItem(InlineResponse400CauseSuppressed suppressedItem) {
    if (this.suppressed == null) {
      this.suppressed = new ArrayList<>();
    }
    this.suppressed.add(suppressedItem);
    return this;
  }

   /**
   * Get suppressed
   * @return suppressed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InlineResponse400CauseSuppressed> getSuppressed() {
    return suppressed;
  }


  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuppressed(List<InlineResponse400CauseSuppressed> suppressed) {
    this.suppressed = suppressed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return Objects.equals(this.cause, inlineResponse400.cause) &&
        Objects.equals(this.stackTrace, inlineResponse400.stackTrace) &&
        Objects.equals(this.response, inlineResponse400.response) &&
        Objects.equals(this.message, inlineResponse400.message) &&
        Objects.equals(this.localizedMessage, inlineResponse400.localizedMessage) &&
        Objects.equals(this.suppressed, inlineResponse400.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, stackTrace, response, message, localizedMessage, suppressed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
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

