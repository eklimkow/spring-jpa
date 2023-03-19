package pl.edu.wszib.springjpa.model;

import java.time.Instant;

public class Adres {
  private String ulica;
  private String kodPocztowy;
  private String miasto;
  private String kraj;
  private Instant createdAt;
  private Instant updatedAt;

  public String getUlica() {
    return ulica;
  }

  public void setUlica(String ulica) {
    this.ulica = ulica;
  }

  public String getKodPocztowy() {
    return kodPocztowy;
  }

  public void setKodPocztowy(String kodPocztowy) {
    this.kodPocztowy = kodPocztowy;
  }

  public String getMiasto() {
    return miasto;
  }

  public void setMiasto(String miasto) {
    this.miasto = miasto;
  }

  public String getKraj() {
    return kraj;
  }

  public void setKraj(String kraj) {
    this.kraj = kraj;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }
}
