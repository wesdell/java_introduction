public class Waistcoat {
  public static final int POCKETS_AMOUNT = 4;
  private boolean openWaistcoat;
  private Pocket[] pockets;

  public Waistcoat() {
    this.openWaistcoat = false;
    this.pockets = new Pocket[POCKETS_AMOUNT];
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
    if (!this.pockets[pocketNumber].isOpenPocket()) {
      System.out.println("El bolsillo " + pocketNumber + " no esta abierto.");
      return;
    }
    if (!this.pockets[pocketNumber].isAvailable()) {
      System.out.println("El bolsillo " + pocketNumber + " esta lleno.");
      return;
    }
    this.pockets[pocketNumber].save(itemToSave);
  }

  public void openPocket(int pocketNumber) {
    if (!this.isValidPocketNumber(pocketNumber)) {
      System.out.println(pocketNumber + " no es un valor valido.");
      return;
    }
    this.pockets[pocketNumber].open();
  }

  public String getPocketsContent() {
    String content = "";
    for (Pocket pocket : pockets) {
      content += pocket.getContent();
    }
    return content;
  }

  private String isOpenWaistcoat() {
    return this.openWaistcoat ? "abierto" : "cerrado";
  }

  private boolean isValidPocketNumber(int pocketNumber) {
    return (pocketNumber >= 0) && (pocketNumber < POCKETS_AMOUNT);
  }

  @Override
  public String toString() {
    return "El chaleco esta: " + this.isOpenWaistcoat();
  }
}