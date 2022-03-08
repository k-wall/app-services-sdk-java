/*
 * Kafka Admin REST API
 * An API to provide REST endpoints for query Kafka for admin operations
 *
 * The version of the OpenAPI document: 0.7.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.auth.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.auth.models.AclBinding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A page of ACL binding entries
 */
@ApiModel(description = "A page of ACL binding entries")
@JsonPropertyOrder({
  AclBindingListPage.JSON_PROPERTY_ITEMS,
  AclBindingListPage.JSON_PROPERTY_TOTAL,
  AclBindingListPage.JSON_PROPERTY_SIZE,
  AclBindingListPage.JSON_PROPERTY_PAGE
})
@JsonTypeName("AclBindingListPage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AclBindingListPage {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<AclBinding> items = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public AclBindingListPage() { 
  }

  public AclBindingListPage items(List<AclBinding> items) {
    
    this.items = items;
    return this;
  }

  public AclBindingListPage addItemsItem(AclBinding itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AclBinding> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<AclBinding> items) {
    this.items = items;
  }


  public AclBindingListPage total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of entries in the full result set
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total number of entries in the full result set")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public AclBindingListPage size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Number of entries per page (returned for fetch requests)
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of entries per page (returned for fetch requests)")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public AclBindingListPage page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Current page number (returned for fetch requests)
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current page number (returned for fetch requests)")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AclBindingListPage aclBindingListPage = (AclBindingListPage) o;
    return Objects.equals(this.items, aclBindingListPage.items) &&
        Objects.equals(this.total, aclBindingListPage.total) &&
        Objects.equals(this.size, aclBindingListPage.size) &&
        Objects.equals(this.page, aclBindingListPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total, size, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AclBindingListPage {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

