// https://judge.beecrowd.com/pt/problems/view/1019
public class Bee1019 {
    public static void main(String[] args) {

        int segundos = 140153;

        int horas = segundos / 3600;
        int resto = segundos % 3600;

        int minutos = resto / 60;
        resto = segundos % 60;


        System.out.println(horas);
        System.out.println(minutos);
        System.out.println(resto);

    }
}
