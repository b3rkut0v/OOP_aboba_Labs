package Labs3;

public class zadanie3 {
    public static void main(String[] args) {

        for ( int i = 1 ; i < 10; i++) {
            int j = i * 7;
            System.out.println("Виведення через for: "+ j);
        }

        System.out.println();

        int i = 1;
        do{
            int j = i * 7;
            i++;
            System.out.println("Виведення через do-while: "+ j);
        }while (i < 10);

        System.out.println();

        int n = 1;
        while (n < 10 ){
            n++;
            int j = i * 7;
            System.out.println("Виведення через while: "+ j);
        }
    }
}
