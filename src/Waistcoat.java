public class Waistcoat {
  public static final int POCKETS_AMOUNT = 4;
  private boolean openWaistcoat;
  private Pocket[] pockets;

  public Waistcoat() {
    this.openWaistcoat = false;
    this.pockets = new Pocket[POCKETS_AMOUNT];
    this.pockets[0] = new ExternalPocket();
    this.pockets[1] = new ExternalPocket();
    this.pockets[2] = new InternalPocket();
    this.pockets[3] = new InternalPocket();
  }

  public void open() {
    this.openWaistcoat = true;
  }

  public void close() {
    this.openWaistcoat = false;
  }

  public void save(int pocketNumber, String itemToSave) throws ValidPocketException {
    if (!this.isValidPocketNumber(pocketNumber)) {
      throw new ValidPocketException(pocketNumber);
    }
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

  public void openPocket(int pocketNumber) throws ValidPocketException {
    if (!this.isValidPocketNumber(pocketNumber)) {
      throw new ValidPocketException(pocketNumber);
    }
    this.pockets[pocketNumber].open();
  }

  public String getPocketsContent() {
    StringBuilder content = new StringBuilder();
    for (Pocket pocket : pockets) {
      content.append(pocket.getContent()).append(" ");
    }
    return content.toString();
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