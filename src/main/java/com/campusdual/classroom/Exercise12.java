package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        //Creamos un coche
        Car coche = new Car("Ford", "Mustang", "Gasolina");
        //Comprobamos que el tacometro es 0
        System.out.println("El valor del tacometro es cero: " + coche.isTachometerEqualToZero());
        //Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        //Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        //Apagar el coche comprobando que el valor del tacómetro es correcto
        //Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        //Acelerar el coche
        //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        //Frenar la velocidad
        //Frenar hasta un valor negativo (y comprobar que no se puede)
        //Girar el volante 20 grados
        //Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        //Detener el coche y poner marcha atrás
        //Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
    }

}