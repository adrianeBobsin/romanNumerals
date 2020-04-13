/**
 *  Classe que converte numerais para números romanos
 *  @author Adriane Bobsin de la Vega
 */

public class RomanNumerals {

    private String roman;
    private int numeral;
    private static RomanNumerals instance = null;

    public static RomanNumerals getInstance() {
        if (instance == null)
            instance = new RomanNumerals();
        return instance;
    }

    // == Construct ==
    private RomanNumerals(){}

    // == Setters ==
    private void setNumeral(int number) {
        try {
            this.numeral = (number);

        } catch(NumberFormatException e) {
            throw new IllegalArgumentException("O valor informado deve ser um número! %s", e);
        }
    }

    private void setRoman(String letter) {
        this.roman+= letter;
    }

    // == Getters ==
    private String getRoman() {
        return this.roman;
    }

    // == Public methods ==
    public String convertNumeralToRoman(int number) {
        this.roman = "";
        if (number == 0)           {    return "";
        } else if (number >= 3000) {    throw new IllegalArgumentException("O número deve ser menor que 3000 para realizar a conversão!"); }
        this.setNumeral(number);
        this.convertion();
        return this.getRoman();
    }

    public String convertNumeralToRoman(String number) {
        this.roman = "";
        try {
            this.setNumeral(Integer.parseInt(number));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("O valor informado deve ser um número!");
        }
        this.convertion();
        return this.getRoman();
    }

    // == Private methods ==
    private void convertion() {
       if (this.numeral/1000 > 0) { this.sum(this.numeral/1000, "M"); }
       if (this.numeral/100%10 > 0) { this.exceptions(this.numeral/100 % 10, "C,CM,D,CD"); }
       if (this.numeral/10%10 > 0) { this.exceptions(this.numeral/10 % 10, "X,XC,L,XL"); }
       this.exceptions(this.numeral % 10, "I,IX,V,IV");
    }

    private void exceptions(int n, String letters) {
        String[] letter = letters.split(",");
        switch(n) {
            case 9:
                this.setRoman(letter[1]);
                break;
            case 4:
                this.setRoman(letter[3]);
                break;
            default:
                if (n>=5) {
                    this.setRoman(letter[2]);
                    n -=5;
                }
                if (n>0) { this.sum(n, letter[0]); }
                break;
        }
    }

    private void sum(int n, String letter) {
        while(n>0) {
            this.setRoman(letter);
            n--;
        }
    }
}
