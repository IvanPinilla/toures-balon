package com.touresbalon.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;


/**
 * Muestra la información de pago requerida por el cliente que compra un producto.
 */
@ApiModel(description = "Muestra la información de pago requerida por el cliente que compra un producto.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-16T23:29:26.784Z[GMT]")
public class Factura   {
  @JsonProperty("codigo")
  private Long codigo = null;

  @JsonProperty("codigoBarras")
  private CodigoBarras codigoBarras = null;

  @JsonProperty("fechaCreacion")
  private LocalDateTime fechaCreacion = null;

  @JsonProperty("valortotal")
  private BigDecimal valorTotal = null;

  @JsonProperty("orden")
  private Orden orden = null;

  public Factura codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public Factura codigoBarras(CodigoBarras codigoBarras) {
    this.codigoBarras = codigoBarras;
    return this;
  }

  /**
   * Get codigoBarras
   * @return codigoBarras
  **/
  @ApiModelProperty(value = "")
  
    public CodigoBarras getCodigoBarras() {
    return codigoBarras;
  }

  public void setCodigoBarras(CodigoBarras codigoBarras) {
    this.codigoBarras = codigoBarras;
  }

  public Factura fechaCreacion(LocalDateTime fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
    return this;
  }

  /**
   * Fecha de creación de la factura.
   * @return fechaCreacion
  **/
  @ApiModelProperty(value = "Fecha de creación de la factura.")
  
    @Valid
    public LocalDateTime getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(LocalDateTime fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public Factura orden(Orden orden) {
    this.orden = orden;
    return this;
  }

  /**
   * Get orden
   * @return orden
  **/
  @ApiModelProperty(value = "")
  
    public Orden getOrden() {
    return orden;
  }

  public void setOrden(Orden orden) {
    this.orden = orden;
  }


  public Factura valortotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

  /**
   * Valor total de la orden a pagar, incluye la suma de la información de los items del producto, impuestos y descuentos a aplicar.
   * minimum: 0
   * @return valortotal
   **/
  @ApiModelProperty(value = "Valor total de la orden a pagar, incluye la suma de la información de los items del producto, impuestos y descuentos a aplicar.")

  @Min(0)  public BigDecimal getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Factura factura = (Factura) o;
    return Objects.equals(this.codigo, factura.codigo) &&
        Objects.equals(this.codigoBarras, factura.codigoBarras) &&
        Objects.equals(this.fechaCreacion, factura.fechaCreacion) &&
        Objects.equals(this.orden, factura.orden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, codigoBarras, fechaCreacion, orden);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Factura {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    codigoBarras: ").append(toIndentedString(codigoBarras)).append("\n");
    sb.append("    fechaCreacion: ").append(toIndentedString(fechaCreacion)).append("\n");
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
