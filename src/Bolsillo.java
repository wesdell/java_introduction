public class Bolsillo {
  private boolean bolsilloAbierto;
  private String contenido;

  public boolean estaAbierto() {
    return this.bolsilloAbierto;
  }

  public boolean estaDisponible() {
    return this.contenido == "";
  }

  public void guardar(String objetoAGuardar) {
    this.contenido = objetoAGuardar;
  }
}
