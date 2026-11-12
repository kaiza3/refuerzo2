import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] num = { 4,3,6,2};
        System.out.println(cualFalta(num));
    }
    public static int cualFalta(int[] num){
        Arrays.sort(num);

        for (int i = 0; i < num.length -1 ; i++) {
            if ( num[i+1]!=num[i]+1){
                return num[i]+1;
            }
        }
        return -1;
    }
}
