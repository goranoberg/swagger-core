/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.models.media;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ArraySchema
 */

public class ArraySchema extends Schema {
  @JsonProperty("type")
  private String type = "array";
  @JsonProperty("items")
  private Schema items = null;

  /**
   * returns the type property from a ArraySchema instance.
   *
   * @return String type
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ArraySchema type(String type) {
    this.type = type;
    return this;
  }

  /**
   * returns the items property from a ArraySchema instance.
   *
   * @return Schema items
   **/
  @ApiModelProperty(value = "")
  public Schema getItems() {
    return items;
  }

  public void setItems(Schema items) {
    this.items = items;
  }

  public ArraySchema items(Schema items) {
    this.items = items;
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArraySchema arraySchema = (ArraySchema) o;
    return Objects.equals(this.type, arraySchema.type) &&
        Objects.equals(this.items, arraySchema.items) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, items, super.hashCode());
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArraySchema {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

