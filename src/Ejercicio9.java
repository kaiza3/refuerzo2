public class Ejercicio9 {
    public static void main(String[] args) {
        int dividendo =8 , divisor=3;

        System.out.println(dividirFactoriales(dividendo, divisor));
    }
    public static int dividirFactoriales(int dividendo, int divisor){
        int resultado=1;
        for (int i = divisor + 1; i <= dividendo; i++) {

            resultado = resultado * i;
        }
        return resultado;
    }
}
