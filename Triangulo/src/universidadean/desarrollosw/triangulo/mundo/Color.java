/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Departamento Tecnologías de la Información
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Unidad de Estudio: Desarrollo de Software
 * Ejercicio: Triangulo
 * Fecha: Agosto 2022
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package universidadean.desarrollosw.triangulo.mundo;

/**
 * Clase que representa un color.
 */
public class Color {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Componente rojo del RGB (Red).
     */
    private int rojo;

    /**
     * Componente verde del RGB (Green).
     */
    private int verde;

    /**
     * Componente azul del RBG (Blue).
     */
    private int azul;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa el color. <br>
     */
    public Color(int pRojo, int pVerde, int pAzul) {
        rojo = pRojo;
        verde = pVerde;
        azul = pAzul;
    }

    /**
     * Devuelve la valor del componente rojo (R) en el color.
     */
    public int darRojo() {
        return rojo;
    }

    /**
     * Devuelve la valor del componente verde (G) en el color.
     */
    public int darVerde() {
        return verde;
    }

    /**
     * Devuelve la valor del componente azul (B) en el color.
     */
    public int darAzul() {
        return azul;
    }

    /**
     * Cambia el valor del componente rojo (R) en el color.
     */
    public void cambiarRojo(int pRojo) {
        rojo = pRojo;
    }

    /**
     * Cambia el valor del componente verde (G) en el color.
     */
    public void cambiarVerde(int pVerde) {
        verde = pVerde;
    }

    /**
     * Cambia el valor del componente azul (B) en el color.
     */
    public void cambiarAzul(int pAzul) {
        azul = pAzul;
    }

}
