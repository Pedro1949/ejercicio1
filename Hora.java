package Pregunta1;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor por defecto
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor con parámetros
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Método para visualizar la hora en formato HH:MM:SS
    public void visualizarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    // Método para sumar dos objetos Hora
    public Hora sumarHoras(Hora hora1, Hora hora2) {
        Hora resultado = new Hora();

        resultado.segundos = hora1.segundos + hora2.segundos;
        resultado.minutos = resultado.segundos / 60;
        resultado.segundos %= 60;

        resultado.minutos += hora1.minutos + hora2.minutos;
        resultado.horas = resultado.minutos / 60;
        resultado.minutos %= 60;

        resultado.horas += hora1.horas + hora2.horas;

        return resultado;
    }
}
