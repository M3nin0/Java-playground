public class Split{
    public static void main(String[] args){
        String a = "Testando o split";
        String b = "Split_no_java";

        // Array de String
        String arr[] = a.split("");
        String arrDois[] = b.split("_");
        
        // System.out.println(arr[2]);
        // System.out.println(arrDois[1]);
        
        // As duas formas de for funcionam normalmente
        for (String string: arr){
            System.out.print(string);
        }
        System.out.println("");
        for(int i = 0; i < arrDois.length; i++){
            System.out.print(arrDois[i]);
        }

        System.out.println("");
    }
}