public class Metodos {

    public static int soma(int x, int y) {
        return x + y;
    }

    public static int soma(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        
        int resultado = soma(10, 20, 30);
        System.out.println(resultado);
    }
    
}
