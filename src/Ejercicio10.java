public class Ejercicio10 {
    public static void main(String[] args) {
        int compartimentos=4, maxLitros=400, diferencia=20;

        System.out.println(litros(compartimentos,maxLitros,diferencia));
    }
    public static int litros(int compartimentos, int maxLitros, int diferencia){
        int suma=0;
        for (int i=0; i<compartimentos; i++){
            suma=suma+maxLitros;
            maxLitros= maxLitros-diferencia;
        }
        return suma;
    }
}
