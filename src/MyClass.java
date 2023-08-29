public class MyClass {
    public static void main(String[] args) {
        String primeiro = "Joaquim";
        String segundo = "Neto";
        String nomeCompleto2 = nomeCompleto(primeiro, segundo);

        System.out.println(nomeCompleto2);

    }
    public static String nomeCompleto(String primeiro, String segundo){
        return "Resultado do metodo " + primeiro.concat(" ").concat(segundo);
    }
}
