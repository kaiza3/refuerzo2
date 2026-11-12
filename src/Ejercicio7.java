public class Ejercicio7 {
    public static void main(String[] args) {
        int desde=2, hasta=99;
        System.out.println(canales(desde, hasta));
    }
    public static int canales(int desde, int hasta) {
        int adelante, atras;
        if (hasta>= desde){
            adelante=hasta - desde;
        }else {
            adelante= (99 - desde) + hasta;
        }
        if (desde >= hasta){
            atras = desde - hasta;
        }else  {
            atras = desde + (99 - hasta);
        }
        if (adelante < atras){
            return adelante;
        }else  {
            return atras;
        }
    }
}
