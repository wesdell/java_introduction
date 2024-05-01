public class Waistcoat {
  private boolean openWaistcoat;
  private Pocket[] pockets;

  public Waistcoat() {
    this.openWaistcoat = false;
    this.pockets = new Pocket[4];
    this.pockets[0] = new Pocket();
    this.pockets[1] = new Pocket();
    this.pockets[2] = new Pocket();
    this.pockets[3] = new Pocket();
  }

  public void open() {
    this.openWaistcoat = true;
  }

  public void close() {
    this.openWaistcoat = false;
  }

  public void save(int pocketNumber, String itemToSave) {
    if (this.pockets[pocketNumber].isOpenPocket()) {
      if (this.pockets[pocketNumber].isAvailable()) {
        this.pockets[pocketNumber].save(itemToSave);
      }
    }
  }

  private String isOpenWaistcoat() {
    return this.openWaistcoat ? "abierto" : "cerrado";
  }

  @Override
  public String toString() {
    return "El chaleco esta: " + this.isOpenWaistcoat();
  }

}
