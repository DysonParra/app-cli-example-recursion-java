/*
 * @fileoverview    {Factorial} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.recursion;

/**
 * TODO: Definición de {@code Factorial}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class Factorial {

    /**
     * Calcula el factorial de {@code n}
     *
     * @param n un número.
     * @return factorial de {@code n}
     */
    public static long getFactorial(int n) {
        if (n <= 1)
            return n;
        else
            return n * getFactorial(n - 1);
    }
}
