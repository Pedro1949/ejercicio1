package Pregunta1;

public class Pregunta_1 {
    public static void main(String[] args) {
        
        Hora hora1 = new Hora(8, 30, 45);
        Hora hora2 = new Hora(2, 15, 20);
        Hora resultado = new Hora();

        resultado = resultado.sumarHoras(hora1, hora2);

        System.out.println("Hora 1: ");
        hora1.visualizarHora();

        System.out.println("Hora 2: ");
        hora2.visualizarHora();

        System.out.println("Resultado de la suma: ");
        resultado.visualizarHora();
    }
        
}
