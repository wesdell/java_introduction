public class Chaleco {
  private boolean chalecoAbierto;
  private Bolsillo[] bolsillos;

  public Chaleco() {
    this.chalecoAbierto = false;
    this.bolsillos = new Bolsillo[4];
    this.bolsillos[0] = new Bolsillo();
    this.bolsillos[1] = new Bolsillo();
    this.bolsillos[2] = new Bolsillo();
    this.bolsillos[3] = new Bolsillo();
  }

  public void abrir() {
    this.chalecoAbierto = true;
  }

  public void cerrar() {
    this.chalecoAbierto = false;
  }

  public void guardar(int numeroBolsillo, String objetoAGuardar) {
    if (this.bolsillos[numeroBolsillo].estaAbierto()) {
      if (this.bolsillos[numeroBolsillo].estaDisponible()) {
        this.bolsillos[numeroBolsillo].guardar(objetoAGuardar);
      }
    }
  }

  private String estaAbierto() {
    return this.chalecoAbierto ? "abierto" : "cerrado";
  }

  @Override
  public String toString() {
    return "El chaleco esta: " + this.estaAbierto();
  }

}
