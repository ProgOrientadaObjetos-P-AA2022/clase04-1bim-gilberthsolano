/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

public class Ejecutor {
    public static void main(String[] args) {
        // Se crea un objeto
        // haciendo referencia al constructor por defecto
        FacturaTelefonica fa = new FacturaTelefonica();
        System.out.printf("Número telefónico: %s\n"
                + "Minutos mes: %.2f\nValor minuto: %.2f\n"
                + "Valor factura: %.2f\n", fa.obtenerNumeroTelefono(),
                fa.obtenerMinutosMes(),
                fa.obtenerValorMinuto(),
                fa.obtenerValorFactura());
    }
}
