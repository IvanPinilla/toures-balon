package com.touresbalon.api.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Petición de creación de una orden.
 */
@ApiModel(description = "Petición de creación de una orden.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-16T23:29:26.784Z[GMT]")
public class OrdenesPSTRq   {
  @JsonProperty("orden")
  private Orden orden = null;

  public OrdenesPSTRq orden(Orden orden) {
    this.orden = orden;
    return this;
  }

  /**
   * Get orden
   * @return orden
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Orden getOrden() {
    return orden;
  }

  public void setOrden(Orden orden) {
    this.orden = orden;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdenesPSTRq ordenesPSTRq = (OrdenesPSTRq) o;
    return Objects.equals(this.orden, ordenesPSTRq.orden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orden);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdenesPSTRq {\n");
    
    sb.append("    orden: ").append(toIndentedString(orden)).append("\n");
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
