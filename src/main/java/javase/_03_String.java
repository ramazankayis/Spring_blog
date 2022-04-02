package javase;

public class _03_String {
    public static void main(String[] args) {

        String kelime = "java full stack";

        kelime =kelime.concat(" and reactjs");
        System.out.println(kelime);

        String kelime2= "javaSe";
        System.out.println(kelime.replace(kelime,kelime2));
        //trim: kelimenin sadece başındaki ve sonundaki boşlukları siler
        System.out.println(kelime.length());
        System.out.println(kelime.trim().length());

        //startsWith ==> Bununla mı başlıyor ? evet:true hayır:false
        System.out.println("Bununla mı başlıyor: "+kelime.startsWith("j"));

        //endsWith ==> Bununla mı bitiyor ? evet:true hayır:false
        System.out.println("Bununla mı bitiyor:  "+kelime.endsWith("s"));


    }
}
