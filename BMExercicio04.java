/*
 * 4. Declare uma variável chamada long1 do tipo long e a inicialize com 100.
 * Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com
 * 200. Agora faça int2 receber int1 mais long1 e explique os resultados.
 * Arrume o código para que não ocorra o erro anterior.
 */
public class BMExercicio04 {
    /*    public static void main(String[] args) {
            long long1 = 100;
            int int1 = 200;
            int int2 = int1 + long1;
        }
    O código acima não é compilado, uma vez que o uma variável do tipo long foi atribuida à uma variável do tipo int, nesse caso o erro econtrado é: tipos incompatíveis: possible lossy conversion from long to int
    Nesse sentido, uma alternativa para que o programa funcione seria:
    */
    public static void main(String[] args) {
        long long1 = 100;
        int int1 = 200;
        int int2 = int1 + (int) long1;
    }
}
