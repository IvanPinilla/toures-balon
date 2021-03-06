package com.touresbalon.api.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.touresbalon.api.domain.ImagenDimensiones;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.core.io.Resource;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contiene la información de la imagen que se mostrará del evento.
 */
@ApiModel(description = "Contiene la información de la imagen que se mostrará del evento.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-13T20:28:44.608-05:00[America/Bogota]")

public class Imagen   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("nombre")
  private String nombre;

  @JsonProperty("path")
  private String path;

  @JsonProperty("dimensiones")
  private ImagenDimensiones dimensiones;

  @JsonProperty("data")
  private Resource data;

  public Imagen id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Imagen nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  */
  @ApiModelProperty(value = "")


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Imagen path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @ApiModelProperty(value = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Imagen dimensiones(ImagenDimensiones dimensiones) {
    this.dimensiones = dimensiones;
    return this;
  }

  /**
   * Get dimensiones
   * @return dimensiones
  */
  @ApiModelProperty(value = "")

  @Valid

  public ImagenDimensiones getDimensiones() {
    return dimensiones;
  }

  public void setDimensiones(ImagenDimensiones dimensiones) {
    this.dimensiones = dimensiones;
  }

  public Imagen data(Resource data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public Resource getData() {
    return data;
  }

  public void setData(Resource data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Imagen imagen = (Imagen) o;
    return Objects.equals(this.id, imagen.id) &&
        Objects.equals(this.nombre, imagen.nombre) &&
        Objects.equals(this.path, imagen.path) &&
        Objects.equals(this.dimensiones, imagen.dimensiones) &&
        Objects.equals(this.data, imagen.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, path, dimensiones, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Imagen {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    dimensiones: ").append(toIndentedString(dimensiones)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

