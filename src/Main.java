public class Main {
  public static void main(String[] args) {
    Waistcoat waistcoat = new Waistcoat();
    waistcoat.open();
    System.out.println(waistcoat.toString());
    waistcoat.close();
    System.out.println(waistcoat.toString());
    waistcoat.openPocket(3);
    waistcoat.save(3, "objeto");
    System.out.println(waistcoat.getPocketsContent());
  }
}