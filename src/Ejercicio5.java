import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int []numeros = { 1,2,6,17,18,22,35,46,109,143};
        System.out.println("la mediana es: "+mediana(numeros));
    }

    public static Double mediana(int[] numeros) {
        Arrays.sort(numeros);
        int longi = numeros.length;
        double mediana=0;

        if (longi % 2 != 0){
            mediana = numeros[longi/2];
        }else if (longi % 2 == 0) {
            mediana = numeros[longi/2];
            mediana = (mediana + numeros[(longi/2)-1]) / 2;
        }
        return mediana;
    }
}
