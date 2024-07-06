public class Main {
  public static void main(String[] args) {
    Waistcoat waistcoat = new Waistcoat();
    waistcoat.open();
    System.out.println(waistcoat);
    waistcoat.close();
    System.out.println(waistcoat);
      try {
          waistcoat.openPocket(7);
      } catch (ValidPocketException e) {
          throw new RuntimeException(e);
      }
      try {
          waistcoat.save(9, "objeto");
      } catch (ValidPocketException e) {
          throw new RuntimeException(e);
      }
      System.out.println(waistcoat.getPocketsContent());
  }
}