import javax.naming.InterruptedNamingException;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num= 4618;

        if (esHyperpar(num)) {
            System.out.println(num +" es  par");
        }else{
            System.out.println(num +" no es par");
        }
    }
    public static boolean esHyperpar(int num){
        String numero = Integer.toString(num);

        for (int i = 0; i < numero.length(); i++) {
            if (!(numero.charAt(i) % 2 == 0)) {
                return false;
            }
        }
        return true;
    }
}
