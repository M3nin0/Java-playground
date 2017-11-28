public class Texto{
    public static void main(String[] args) {
        String textoUm = "Felipe";
        String textoDois = "See how eagerly the lobsters and the turtles all advance! They are waiting on the shingle—will you come and join the dance?";

        // System.out.println(textoUm.endsWith("e"));
        
        System.out.println("Coletando informações do trecho\nSee how eagerly the lobsters and the turtles all advance! They are waiting on the shingle—will you come and join the dance ?\n");

        System.out.println("O texto contém a palavra \"lobsters\" ? Resposta: " + textoDois.contains("lobsters"));
        System.out.println("Quantidade de palavras no trecho ? " + textoDois.codePointCount(0, textoDois.length()));
    }
}