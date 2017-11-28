public class Mutable{
    public static void main(String[] args) {
        
        /*
            Strings em java são imutaveis
        */
        
        String a = "Would not, could not, would not, could not, would not join the dance.";
        
        // Retorna um array de char
        char arr[] = a.toCharArray();
        arr[2] = '2';

        for (char letter: arr)
            System.out.print(letter);
        System.out.println("\n");
    }
}