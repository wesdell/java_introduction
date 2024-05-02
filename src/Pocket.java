public class Pocket {
  private boolean openPocket;
  private String content;

  public Pocket() {
    this.openPocket = false;
  }

  public void open() {
    this.openPocket = true;
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

  public String getContent() {
    return this.content;
  }

  public void save(String itemToSave) {
    this.content = itemToSave;
  }
}