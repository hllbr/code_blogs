       /*
        kod blokları fonksiyonlarda , koşullu durumlarda , döngü yapılarında kullandığımız bloklardır.
        {}süslü pazantezler arasına yazdığımız alan kod blokumuzdur.
        Pythonda bu olay yok süslü paratezlerin yerini tab boşlukları ile ifade ederek işlemlerimizi gerçekleştiriyor...
        bloklarımızı yazıyoruz...
        bir methodun parantezleri(sınırları) dışında yazılmış kodlar methodu ilgilendirmez...
        JAVA da kodları temiz yazmak(clear code) diğer dillerde de olduğu gibi önemlidir.
        
        
        */
public class Main {
    public static void main(String[] args) {
        //karşılaştırma operatörleri...
        /*
        == Eşit mi ?
        != eşit değil mi ? 
        > Büyük mü ? 
        >= Büyük veya Eşit mi ? 
        < Küçük mü ? 
        <= Küçük veya Eşit mi ? 
        */
 
        System.out.println(4 == 3 );
        System.out.println("a" == "15");
        System.out.println("a" == "a");
        System.out.println("!" != "!!");
        System.out.println(85>58);
        System.out.println(44>45);
        System.out.println(2>=1);
        System.out.println(22>=22.5);
        System.out.println(22<11);
        System.out.println(22<= 22.11);
        /*
        Mantıksal Operatörler....
        &&(and operatörü) == Bütün Sonuçlar Kendi içinde True(Doğru) ise sonuç True ....
        En az birisi bile True ise genel sonuç False olur.
        ||(Or Operatörü) == Sonuçlardan en az birisi bile True ise genel sonuç True...
        Hepsi False ise genel sonuç False olur...
        !(Not Operatörü) ==(Değilleme) bir işlemi veya sorguyu tersler
        */
        System.out.println("***************************************");
        System.out.println("///////////////////////////////////////");
        System.out.println("***************************************");
        System.out.println("///////////////////////////////////////");

        System.out.println(3 == 3 || 3!= 5);
        System.out.println("ali" != "boksör" && 58> 57);
        System.out.println(588<855 && 1!=1);
        System.out.println((588+855)>1000 && "hllbr" !="@prince" || 1000>999.998);
        System.out.println(15 == 12 || "12" !="oniki" || "I am not junior" !="I feel master(yi)");
        System.out.println(!(15 == 12 || "12" !="oniki" || "I am not junior" !="I feel master(yi)"));
        System.out.println(!((588+855)>1000 && "hllbr" !="@prince" || 1000>999.998));
        System.out.println(!("a" == "a"));
        System.out.println("***************************************");
        System.out.println("///////////////////////////////////////");
        System.out.println("***************************************");
        System.out.println("///////////////////////////////////////");



        
    }
    
}
