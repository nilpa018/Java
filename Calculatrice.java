import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculatrice {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("Quel type de calcul souhaitez vous ? (+, -, *, /) ou exit pour quitter le programme ");
            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

                String calcul = bufferRead.readLine();
                if(calcul.equals("exit")){
                    check = false;
                }

                for(int i = 0; i < calcul.length(); i++) {
                    if(calcul.charAt(i) == '+') {
                        int num1 = Integer.parseInt(calcul.substring(0, i));
                        int num2 = Integer.parseInt(calcul.substring(i+1, calcul.length()));
                        String resultat = String.valueOf(num1 + num2);
                        System.out.println("Votre résultat est de : " + resultat);
                    } else if(calcul.charAt(i) == '-') {
                        int num1 = Integer.parseInt(calcul.substring(0, i));
                        int num2 = Integer.parseInt(calcul.substring(i+1, calcul.length()));
                        String resultat = String.valueOf(num1 - num2);
                        System.out.println("Votre résultat est de : " + resultat);
                    } else if(calcul.charAt(i) == '*') {
                        int num1 = Integer.parseInt(calcul.substring(0, i));
                        int num2 = Integer.parseInt(calcul.substring(i+1, calcul.length()));
                        String resultat = String.valueOf(num1 * num2);
                        System.out.println("Votre résultat est de : " + resultat);
                    } else if(calcul.charAt(i) == '/') {
                        int num1 = Integer.parseInt(calcul.substring(0, i));
                        int num2 = Integer.parseInt(calcul.substring(i + 1, calcul.length()));
                        String resultat = String.valueOf(num1 / num2);
                        System.out.println("Votre résultat est de : " + resultat);
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
