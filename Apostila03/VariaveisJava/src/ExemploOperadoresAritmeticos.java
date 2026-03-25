public class ExemploOperadoresAritmeticos {

    public static void main(String[] args) {
        //Declarar uma variável do tipo int e atribuir um valor
        int x = 12;
        int y = 32;

        x++; //Aumentou o x em 1 unidade
        System.out.println("X é: " + x);
        x--; //Diminuiu em 1
        System.out.println("X agora é: " + x);

        x += 2; //x = x + 2
        System.out.println("X agora é: " + x);//14
        x -= 10; //x = x - 10
        System.out.println("X agora é: " + x);//4
        x *= 3; //x = x * 3
        System.out.println("X agora é: " + x);//12
        x /= 2; //x = x / 2
        System.out.println("X agora é: " + x);//6
        x %= 4; //x = x % 4
        System.out.println("X agora é: " + x);//2
        y *= x; //y = y * x
        System.out.println("y agora é: " + y);//2
    }//main
}//class
