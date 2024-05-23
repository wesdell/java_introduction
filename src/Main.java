public class Main {
  public static void main(String[] args) {
    /*Waistcoat waistcoat = new Waistcoat();
    waistcoat.open();
    System.out.println(waistcoat.toString());
    waistcoat.close();
    System.out.println(waistcoat.toString());
    waistcoat.openPocket(1);
    waistcoat.save(1, "objeto");
    System.out.println(waistcoat.getPocketsContent());*/

    Animal mammal = new Mammal();
    Bird bird = new Bird();
    System.out.println(mammal.breathe());
    bird.fly();
  }
}