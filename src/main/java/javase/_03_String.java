package javase;

public class _03_String {
    public static void main(String[] args) {

        String kelime = "java full stack";

        kelime =kelime.concat(" and reactjs");
        System.out.println(kelime);

        String kelime2= "javaSe";
        System.out.println(kelime.replace(kelime,kelime2));
    }
}
