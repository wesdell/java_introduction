public class Chaleco {
  private boolean abierto;

  public void abrir() {
    this.abierto = true;
  }

  public void cerrar() {
    this.abierto = false;
  }

  private String estaAbierto() {
    return this.abierto ? "abierto" : "cerrado";
  }

  @Override
  public String toString() {
    return "El chaleco esta: " + this.estaAbierto();
  }
}
