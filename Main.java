package Ejercicio11_libretaCalificaciones;

public class Main {
    public static void main(String[] args) {
        LibretaCalificaciones libreta = new LibretaCalificaciones("Camila Torres");
        double[] notas = {9.0, 7.5, 12.0, 6.0, -1.0, 10.0};

        for (double nota : notas) {
            boolean guardada = libreta.agregarNota(nota);
            System.out.println("Nota " + nota + (guardada ? " guardada." : " rechazada (fuera de 0 a 10)."));
        }

        System.out.println("Notas válidas: " + libreta.getCantidadNotas());
        System.out.println("Promedio de " + libreta.getNombreEstudiante() + ": " + libreta.obtenerPromedio());
    }
}
