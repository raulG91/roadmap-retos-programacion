public class simonguzman {
    public static void main(String[] args) {
        
        //Asignacion por valor

        int a = 5;
        int b = a;

        b=10;
        System.out.println(a);
        System.out.println(b);
        modificarNumero(a);
        System.out.println(a);

        //Asignacion por referencia
        int[] array1 = {1, 2, 3};
        int[] array2 = array1;

        array2[0] = 10;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println(array1[0]);
        System.out.println(array2[0]);

        modificarArray(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }

    public static void modificarNumero(int num){
        num = 4;
    }

    public static void modificarArray(int[] array){
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
    }
}


class Coche{
    private int numPuertas;
    private 
}