public class Ejercicio4 {
    public static void main(String[] args) {
        int [] numeros = {1,3,1,8,3,1,3};
        System.out.println("la moda es " + moda(numeros));
    }
    public static int moda(int[] numeros){
        int moda = numeros[0];
        int maxfre =0;
        for (int i = 1; i < numeros.length; i++){
            int freq=0;
            for (int j = 0; j < numeros.length; j++){
                if (numeros[j]==numeros[i]){
                    freq++;
                }
            }
            if (freq>maxfre){
                maxfre=freq;
                moda=numeros[i];
            }
        }
        return moda;
    }
}
