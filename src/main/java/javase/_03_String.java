package javase;

public class _03_String {
    public static void main(String[] args) {

        String kelime = " java full stack  java javase ";

        //kelime =kelime.concat(" and reactjs");
        System.out.println(kelime);
        System.out.println(kelime.length());

      //  String kelime2= "javaSe";
       // System.out.println(kelime.replace(kelime,kelime2));
        //trim: kelimenin sadece başındaki ve sonundaki boşlukları siler
        System.out.println(kelime.length());
        System.out.println(kelime.trim().length());

        //startsWith ==> Bununla mı başlıyor ? evet:true hayır:false
        System.out.println("Bununla mı başlıyor: "+kelime.startsWith("j"));

        //endsWith ==> Bununla mı bitiyor ? evet:true hayır:false
        System.out.println("Bununla mı bitiyor:  "+kelime.endsWith("s"));


        //charAt: sıfır(0) indiste başlar
        //charAt: biz sayı veriririz ilgili indisi bize döndürür
        //charAt: aramalarda sıklıkla kullanılır.
        System.out.println(kelime.charAt(14));

        //indexOf veya lastIndexOf =-1 demek bulamadı anlamına geliyor.
        //indexOf:arama
        System.out.println("soldan arama: "+ kelime.indexOf("java"));

        //lastIndexOf:
        System.out.println("sağdan arama: "+kelime.lastIndexOf("java"));


        //toLowerCase() ==> bütün karakterleri küçük yaz
        System.out.println(kelime.toLowerCase());

        //toUpperCase() ==> bütün karakterleri büyük yaz
        System.out.println(kelime.toUpperCase());

        //String nokta(.) koyarak ilerleyebiliyoruz
        System.out.println(kelime.concat("Mysql").trim().toLowerCase().length());

    }
}
