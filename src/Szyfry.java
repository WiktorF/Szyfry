public class Szyfry {
    public String szyfrCezar(String tekst) {
        StringBuilder wyjscie = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (Character.isSpaceChar(znak)) {
                wyjscie.append(" ");
            }
            if (Character.isLetter(znak)) {
                if (Character.isUpperCase(znak)) {
                    wyjscie.append((char) ('A' + (znak - 'A' + 3) % 26));
                } else {
                    wyjscie.append((char) ('a' + (znak - 'a' + 3) % 26));
                }
            }

        }
        return wyjscie.toString();
    }

    public String deszyfrCezar(String tekst) {
        StringBuilder wyjscie = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (Character.isSpaceChar(znak)) {
                wyjscie.append(" ");
            }
            if (Character.isLetter(znak)) {
                if (Character.isUpperCase(znak)) {
                    wyjscie.append((char) ('A' + (znak - 'A' - 3 + 26) % 26));
                } else {
                    wyjscie.append((char) ('a' + (znak - 'a' - 3 + 26) % 26));
                }
            }

        }
        return wyjscie.toString();
    }

    public String deCezar(int s, String tekst) {
        StringBuilder wyjscie = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (Character.isSpaceChar(znak)) {
                wyjscie.append(" ");
            }
            if (Character.isLetter(znak)) {
                if (Character.isUpperCase(znak)) {
                    wyjscie.append((char) ('A' + (znak - 'A' - s + 26) % 26));
                } else {
                    wyjscie.append((char) ('a' + (znak - 'a' - s + 26) % 26));
                }
            }

        }
        return wyjscie.toString();
    }

    public String Cezar(int s, String tekst) {
        StringBuilder wyjscie = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if(Character.isSpaceChar(znak)){
                wyjscie.append(" ");
            }
            if (Character.isLetter(znak)) {
                if (Character.isUpperCase(znak)) {
                    wyjscie.append((char) ('A' + (znak - 'A' + s + 26) % 26));
                } else {
                    wyjscie.append((char) ('a' + (znak - 'a' + s + 26) % 26));
                }
            }

        }
        return wyjscie.toString();
    }
    public String szyfrGeometryczny(String tekst) {
        int k = (int) Math.ceil(Math.sqrt(tekst.length()));
        int w = (int) Math.ceil(tekst.length() / (double) k);

        char[][] tab = new char[w][k];
        int index;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                index = i * k + j;
                if (index < tekst.length()) {
                    tab[i][j] = tekst.charAt(index);
                } else {
                    tab[i][j] = 'X';
                }
            }
        }
        StringBuilder wyjscie = new StringBuilder();
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < w; i++) {
                wyjscie.append(tab[i][j]);
            }
        }
        return wyjscie.toString();
    }

    public String deszyfrGeometryczny(String tekst) {

        int k = (int) Math.ceil(Math.sqrt(tekst.length()));
        int w = (int) Math.ceil(tekst.length() / (double) k);

        char[][] tab = new char[w][k];
        int index = 0;

        for (int j = 0; j < k; j++) {
            for (int i = 0; i < w; i++) {
                if (index < tekst.length()) {
                    tab[i][j] = tekst.charAt(index);
                    index++;
                } else {
                    tab[i][j] = 'X';
                }
            }
        }

        StringBuilder wyjscie = new StringBuilder();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                if (tab[i][j] != 'X') {
                    wyjscie.append(tab[i][j]);
                }
            }
        }
        return wyjscie.toString();
    }
    public String szyfrViegenerea(String klucz, String tekst) {
            StringBuilder wyjscie = new StringBuilder();
            tekst = tekst.toUpperCase();
            klucz = klucz.toUpperCase();
            int index = 0;
            for (int i = 0; i < tekst.length(); i++) {
                char znak = tekst.charAt(i);
                if (znak >= 'A' && znak <= 'Z') {
                    int tekstidx = znak - 'A';
                    int kluczidx = klucz.charAt(index) - 'A';
                    int wyjscieidx = (tekstidx + kluczidx) % 26;
                    char znakSzyfru = (char) (wyjscieidx + 'A');
                    wyjscie.append(znakSzyfru);
                    index = (index + 1) % klucz.length();
                } else {
                    wyjscie.append(znak);
                }
            }
            return wyjscie.toString();
        }
    public String deszyfrViegenerea(String klucz, String tekst) {
        StringBuilder wyjscie = new StringBuilder();
        tekst = tekst.toUpperCase();
        klucz = klucz.toUpperCase();
        int index = 0;
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (znak >= 'A' && znak <= 'Z') {
                int tekstidx = znak - 'A';
                int kluczidx = klucz.charAt(index) - 'A';
                int wyjscieidx = (tekstidx - kluczidx + 26) % 26;
                char znakSzyfru = (char) (wyjscieidx + 'A');
                wyjscie.append(znakSzyfru);
                index = (index + 1) % klucz.length();
            } else {
                wyjscie.append(znak);
            }
        }
        return wyjscie.toString();
    }
}