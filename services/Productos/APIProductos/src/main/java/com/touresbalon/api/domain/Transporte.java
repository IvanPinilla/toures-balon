package com.touresbalon.api.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.touresbalon.api.domain.Asiento;
import com.touresbalon.api.domain.Ciudad;
import com.touresbalon.api.domain.Convenio;
import com.touresbalon.api.domain.Vehiculo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * transportes habilitados para realizar un viaje a cualquier destino
 */
@ApiModel(description = "transportes habilitados para realizar un viaje a cualquier destino")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-10T10:11:38.301-05:00[America/Bogota]")

public class Transporte   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("description")
  private String description;

  @JsonProperty("vehiculo")
  private Vehiculo vehiculo;

  @JsonProperty("fechaPartida")
  private LocalDateTime fechaPartida;

  @JsonProperty("lugarPartida")
  private Ciudad lugarPartida;

  @JsonProperty("fechaLlegada")
  private LocalDateTime fechaLlegada;

  @JsonProperty("lugarDestino")
  private Ciudad lugarDestino;

  @JsonProperty("asientos")
  @Valid
  private List<Asiento> asientos = null;

  @JsonProperty("cantidadCupos")
  private Integer cantidadCupos;

  /**
   * 'Estado del transporte:'   * ACTIVO: Activo   * CANCELADO: Cancelado   * APLAZADO: Aplazado 
   */
  public enum EstadoEnum {
    ACTIVO("ACTIVO"),
    
    CANCELADO("CANCELADO"),
    
    APLAZADO("APLAZADO");

    private String value;

    EstadoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EstadoEnum fromValue(String value) {
      for (EstadoEnum b : EstadoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("estado")
  private EstadoEnum estado;

  /**
   * 'tipo de transporte:'   * VIP: vip   * TURISTA: Medio   * ECONOMICO: precio bajo 
   */
  public enum TipoEnum {
    VIP("VIP"),
    
    TURISTA("TURISTA"),
    
    ECONOMICO("ECONOMICO");

    private String value;

    TipoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoEnum fromValue(String value) {
      for (TipoEnum b : TipoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("tipo")
  private TipoEnum tipo;

  @JsonProperty("valor")
  private BigDecimal valor;

  @JsonProperty("convenio")
  private Convenio convenio;

  public Transporte id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * id interno del transporte
   * @return id
  */
  @ApiModelProperty(required = true, value = "id interno del transporte")
  @NotNull

  @Valid

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Transporte description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transporte vehiculo(Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
    return this;
  }

  /**
   * Get vehiculo
   * @return vehiculo
  */
  @ApiModelProperty(value = "")

  @Valid

  public Vehiculo getVehiculo() {
    return vehiculo;
  }

  public void setVehiculo(Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
  }

  public Transporte fechaPartida(LocalDateTime fechaPartida) {
    this.fechaPartida = fechaPartida;
    return this;
  }

  /**
   * Get fechaPartida
   * @return fechaPartida
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDateTime getFechaPartida() {
    return fechaPartida;
  }

  public void setFechaPartida(LocalDateTime fechaPartida) {
    this.fechaPartida = fechaPartida;
  }

  public Transporte lugarPartida(Ciudad lugarPartida) {
    this.lugarPartida = lugarPartida;
    return this;
  }

  /**
   * Get lugarPartida
   * @return lugarPartida
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ciudad getLugarPartida() {
    return lugarPartida;
  }

  public void setLugarPartida(Ciudad lugarPartida) {
    this.lugarPartida = lugarPartida;
  }

  public Transporte fechaLlegada(LocalDateTime fechaLlegada) {
    this.fechaLlegada = fechaLlegada;
    return this;
  }

  /**
   * Get fechaLlegada
   * @return fechaLlegada
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDateTime getFechaLlegada() {
    return fechaLlegada;
  }

  public void setFechaLlegada(LocalDateTime fechaLlegada) {
    this.fechaLlegada = fechaLlegada;
  }

  public Transporte lugarDestino(Ciudad lugarDestino) {
    this.lugarDestino = lugarDestino;
    return this;
  }

  /**
   * Get lugarDestino
   * @return lugarDestino
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ciudad getLugarDestino() {
    return lugarDestino;
  }

  public void setLugarDestino(Ciudad lugarDestino) {
    this.lugarDestino = lugarDestino;
  }

  public Transporte asientos(List<Asiento> asientos) {
    this.asientos = asientos;
    return this;
  }

  public Transporte addAsientosItem(Asiento asientosItem) {
    if (this.asientos == null) {
      this.asientos = new ArrayList<>();
    }
    this.asientos.add(asientosItem);
    return this;
  }

  /**
   * indica la cantidad de voletos comprados para el transporte
   * @return asientos
  */
  @ApiModelProperty(value = "indica la cantidad de voletos comprados para el transporte")

  @Valid

  public List<Asiento> getAsientos() {
    return asientos;
  }

  public void setAsientos(List<Asiento> asientos) {
    this.asientos = asientos;
  }

  public Transporte cantidadCupos(Integer cantidadCupos) {
    this.cantidadCupos = cantidadCupos;
    return this;
  }

  /**
   * indica la cantidad de asientos que el convenio esta dispuesto a ofrecer
   * @return cantidadCupos
  */
  @ApiModelProperty(value = "indica la cantidad de asientos que el convenio esta dispuesto a ofrecer")


  public Integer getCantidadCupos() {
    return cantidadCupos;
  }

  public void setCantidadCupos(Integer cantidadCupos) {
    this.cantidadCupos = cantidadCupos;
  }

  public Transporte estado(EstadoEnum estado) {
    this.estado = estado;
    return this;
  }

  /**
   * 'Estado del transporte:'   * ACTIVO: Activo   * CANCELADO: Cancelado   * APLAZADO: Aplazado 
   * @return estado
  */
  @ApiModelProperty(value = "'Estado del transporte:'   * ACTIVO: Activo   * CANCELADO: Cancelado   * APLAZADO: Aplazado ")


  public EstadoEnum getEstado() {
    return estado;
  }

  public void setEstado(EstadoEnum estado) {
    this.estado = estado;
  }

  public Transporte tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * 'tipo de transporte:'   * VIP: vip   * TURISTA: Medio   * ECONOMICO: precio bajo 
   * @return tipo
  */
  @ApiModelProperty(value = "'tipo de transporte:'   * VIP: vip   * TURISTA: Medio   * ECONOMICO: precio bajo ")


  public TipoEnum getTipo() {
    return tipo;
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public Transporte valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Get valor
   * @return valor
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public Transporte convenio(Convenio convenio) {
    this.convenio = convenio;
    return this;
  }

  /**
   * Get convenio
   * @return convenio
  */
  @ApiModelProperty(value = "")

  @Valid

  public Convenio getConvenio() {
    return convenio;
  }

  public void setConvenio(Convenio convenio) {
    this.convenio = convenio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transporte transporte = (Transporte) o;
    return Objects.equals(this.id, transporte.id) &&
        Objects.equals(this.description, transporte.description) &&
        Objects.equals(this.vehiculo, transporte.vehiculo) &&
        Objects.equals(this.fechaPartida, transporte.fechaPartida) &&
        Objects.equals(this.lugarPartida, transporte.lugarPartida) &&
        Objects.equals(this.fechaLlegada, transporte.fechaLlegada) &&
        Objects.equals(this.lugarDestino, transporte.lugarDestino) &&
        Objects.equals(this.asientos, transporte.asientos) &&
        Objects.equals(this.cantidadCupos, transporte.cantidadCupos) &&
        Objects.equals(this.estado, transporte.estado) &&
        Objects.equals(this.tipo, transporte.tipo) &&
        Objects.equals(this.valor, transporte.valor) &&
        Objects.equals(this.convenio, transporte.convenio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, vehiculo, fechaPartida, lugarPartida, fechaLlegada, lugarDestino, asientos, cantidadCupos, estado, tipo, valor, convenio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transporte {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    vehiculo: ").append(toIndentedString(vehiculo)).append("\n");
    sb.append("    fechaPartida: ").append(toIndentedString(fechaPartida)).append("\n");
    sb.append("    lugarPartida: ").append(toIndentedString(lugarPartida)).append("\n");
    sb.append("    fechaLlegada: ").append(toIndentedString(fechaLlegada)).append("\n");
    sb.append("    lugarDestino: ").append(toIndentedString(lugarDestino)).append("\n");
    sb.append("    asientos: ").append(toIndentedString(asientos)).append("\n");
    sb.append("    cantidadCupos: ").append(toIndentedString(cantidadCupos)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    convenio: ").append(toIndentedString(convenio)).append("\n");
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

