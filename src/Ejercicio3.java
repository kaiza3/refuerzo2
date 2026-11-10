public class Ejercicio3 {
    public static void main(String[] args) {
        String num= "3433";
        System.out.println(sumaDigitos(num));
    }
    public static String sumaDigitos(String num){
        int suma=0;
        String resultado="";
        for(int i = 0; i<num.length(); i++){
            suma += Integer.parseInt("" + num.charAt(i));
            resultado+=num.charAt(i);
            if (i<num.length()-1){
                resultado += " + ";
            }else{
                resultado= resultado + " = " + suma;
            }
        }
        return resultado;
    }
}
