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
    Chaleco chaleco = new Chaleco(); // Instancia de una clase
    chaleco.abrir();
    System.out.println(chaleco.toString());
    chaleco.cerrar();
    System.out.println(chaleco.toString());
    chaleco.guardar(1, "objeto");
  }
}