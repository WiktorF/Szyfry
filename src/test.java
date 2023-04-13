public class test {
    public static void main(String[] args) {
        Szyfry Szyfry = new Szyfry();
        System.out.println("Test Cezar");
        String testCezar = Szyfry.szyfrCezar("Hello World");
        System.out.println("Szyfr: " + testCezar);
        String deszyfr = Szyfry.deszyfrCezar(testCezar);
        System.out.println("Deszyfr: " + deszyfr);

        System.out.println();
        System.out.println("Test Cezar z dowolnym przeskokiem");

        String testCezar2 = Szyfry.Cezar(6, "Hello World");
        System.out.println("Szyfr: " + testCezar2);
        String deszyfr2 = Szyfry.deCezar(6, testCezar2);
        System.out.println("Deszyfr: " + deszyfr2);

        System.out.println();
        System.out.println("Test geometryczny");

        String testGeo = Szyfry.szyfrGeometryczny("alamawdomukotaipsa");
        System.out.println("Szyfr: " + testGeo);
        String deszyfrGeo = Szyfry.deszyfrGeometryczny(testGeo);
        System.out.println("Deszyfr: " + deszyfrGeo);

        System.out.println();
        System.out.println("Test Viegenerea");

        String testViege = Szyfry.szyfrViegenerea("tajne", "Hello World");
        System.out.println("Szyfr: "+testViege);
        String deszyfrViege = Szyfry.deszyfrViegenerea("tajne", testViege);
        System.out.println("Deszyfr: "+deszyfrViege);

    }
}
