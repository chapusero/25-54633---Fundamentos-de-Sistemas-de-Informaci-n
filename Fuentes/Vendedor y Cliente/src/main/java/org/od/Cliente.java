package org.od;

import java.util.List;

public class Cliente {
  private String nombre;
  private String dirección;
  private String teléfono;

  public String getDirección() { return dirección; }
  public void setDirección(String dirección) { this.dirección = dirección; }

  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }

  public String getTeléfono() { return teléfono; }
  public void setTeléfono(String teléfono) { this.teléfono = teléfono; }
}
