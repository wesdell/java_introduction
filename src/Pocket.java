public abstract class Pocket {
  private boolean openPocket;
  private String content;

  public String getContent() {
    return this.content;
  }

  public void open() {
    this.openPocket = true;
  }

  public void save(String itemToSave) {
    this.content = itemToSave;
  }

  public void close() {
    this.openPocket = false;
  }

  public boolean isOpenPocket() {
    return this.openPocket;
  }

  public boolean isAvailable() {
    return this.content == null;
  }
}