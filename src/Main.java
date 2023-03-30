public class Main {
    public static void main(String[] args) {
        //Definimos un array con 10 posiciones
        int num[] = new int[10];

        //Recorremos el array
        //array.lenght indica la longitud del array, en este caso, devuelve 10
        for (int i = 0, multiplo = 5; i < num.length; i++, multiplo += 5) {
            num[i] = multiplo;
            System.out.println(num[i]);
        }
    }
}