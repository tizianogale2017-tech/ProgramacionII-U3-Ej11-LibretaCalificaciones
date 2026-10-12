package Ejercicio11_libretaCalificaciones;

import java.util.ArrayList;
import java.util.List;

public class LibretaCalificaciones {
    private String nombreEstudiante;
    private List<Double> notas = new ArrayList<>();

    public LibretaCalificaciones(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public boolean agregarNota(double nota) {
        if (nota < 0.0 || nota > 10.0) {
            return false;
        }
        notas.add(nota);
        return true;
    }

    public double obtenerPromedio() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public int getCantidadNotas() {
        return notas.size();
    }
}
