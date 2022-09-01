public class Main {
    public static void main(String[] args) {
        System.out.println("Helworld!");

        var box = 9;
        System.out.println(box);
        byte box1 = 120;
        byte box2 = 125;
        var box3 = (box2 + 4) % box1;
        System.out.println( "перегруз равен " + box3+" ton." );

        byte a = 2;
        short b = 159;
        int c = 22__345_555;
        long d  = 123_123_123_123L;
        System.out.println(a + b + c + d+" ton.");
        System.out.println( a  + " ton, "  + b + " ton, " +  c + " ton, " + d + " ton, ");

        float box4 = 12.444f;
        double box5 = 12.5555555555555555555;
        System.out.println(box4 + box5 + " семечек в мешке");

        float box6 = box1 + box4;
        System.out.println(box6 + " фигни какой нибудь");

        float zadacha2 = 78.2f;
        float boxer1 = 82.7f;
        System.out.println( zadacha2 + boxer1 + " общий вес боксеров в кг");

        var raznuy = (boxer1) % zadacha2 ;
        System.out.println( raznuy + "  разница в весе у боксеров в кг");
        System.out.println(boxer1 - zadacha2  + " разница в весе у боксеров в кг ");

        byte banan = 80;
        byte moloko = 105;
        byte moroz = 100;
        byte yuzha = 70;
         var otrava = banan*5+ moloko*2+moroz*2+yuzha*4;
        System.out.println(otrava+" грамм"+"  или "+ otrava/1000+ " килограмм");
        float otrava1=otrava/1000f;
        System.out.println(otrava1+" в килограммах");

        byte dohlik1=7;
        float dohlik2=0.250f;
        float dohlik3=0.500f;
        System.out.println(dohlik1/dohlik2+" дней -если много жрать");
        System.out.println(dohlik1/dohlik3+" дней - если мало жрать");
        var dohlik4=(dohlik2+dohlik3)/2;
        System.out.println(dohlik1/dohlik4+" дней -если нормально жрать");


        int masha=67_760*12;
        int den=83_690*12;
        int kris=76_230*12;
        int m=masha/10;
        int de =den/10;
        int k=kris/10;
        int m1=masha+m;
        int d1=den+de;
        int k1=kris+k;
        System.out.println("маша теперь получает "+ m1+" рублей в год.Годовой доход вырос на "+m);
        System.out.println("ден теперь получает "+d1+" рублей в год.Годовой доход вырос на "+ de);
        System.out.println("крис теперь получает "+k1 +" рублей в год.Годовой доход вырос на "+ k);





















    }

    }
