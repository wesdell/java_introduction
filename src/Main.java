/* Semana 1
Clase 2

Clase -> Extraer conceptos del mundo real a un dato primitivo. En un proceso
denominado como Abstraccion.
Atributos (campos) -> Caracteristicas primitivas de una clase.
Objeto -> Concepto igual, atributos iguales con diferentes valores.

UML -> Unified Modelling Language
------------------- (Nombre de clase)
Persona
------------------- (Atributos)
nombre
edad
genero
------------------- (Metodos)
respirar()
comer()
dormir()

Clase 3

Encapsulamiento -> Definir y manipular los atributos dentro de sus respectivas clases.
*La unica manera de acceder/modificar a un atributo es mediante los metodos*

Los atributos en general deben tener un nivel de acceso privado (puede ser publico).
Los metodos en general deben tener un nivel de acceso publico (puede ser privado).
*/

public class Main {
  public static void main(String[] args) {
    Waistcoat waistcoat = new Waistcoat(); // Instancia de una clase
    waistcoat.open();
    System.out.println(waistcoat.toString());
    waistcoat.close();
    System.out.println(waistcoat.toString());
    waistcoat.openPocket(1);
    waistcoat.save(1, "objeto");
    System.out.println(waistcoat.getPocketsContent());
  }
}