package P7;

public interface Publisher {
    void agregarObservador(String ciudad, Observador observador);
    void notificarObservadores(String ciudad, String condicionesMeteorologicas);
}

