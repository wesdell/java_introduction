public class Pocket {
  private boolean openPocket;
  private String content;

  public boolean isOpenPocket() {
    return this.openPocket;
  }

  public boolean isAvailable() {
    return this.content == "";
  }

  public void save(String itemToSave) {
    this.content = itemToSave;
  }
}
