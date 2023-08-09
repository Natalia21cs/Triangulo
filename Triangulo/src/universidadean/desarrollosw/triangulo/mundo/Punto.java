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
 * Clase que representa un punto del triángulo.
 */
public class Punto {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Coordenada X del punto.
     */
    private double x;

    /**
     * Coordenada Y del punto.
     */
    private double y;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa el punto con los valores iniciales. <br>
     */
    public Punto(double pX, double pY) {
        x = pX;
        y = pY;
    }

    /**
     * Retorna la coordenada X del punto.
     */
    public double darX() {
        return x;
    }

    /**
     * Retorna la coordenada Y del punto.
     */
    public double darY() {
        return y;
    }

    /**
     * Cambia la coordenada X del punto.
     */
    public void cambiarX(double pX) {
        x = pX;
    }

    /**
     * Cambia la coordenada Y del punto.
     */
    public void cambiarY(double pY) {
        y = pY;
    }

}
