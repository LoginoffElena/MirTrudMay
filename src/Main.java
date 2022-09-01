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





    }

    }
