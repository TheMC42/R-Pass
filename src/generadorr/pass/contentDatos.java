package generadorr.pass;

import java.security.SecureRandom;


/**
 *
 * @author Eduardo
 */
public class contentDatos {
    private static final String CHAR_LOWERUPPER = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //private static final String CHAR_UPPER = CHAR_LOWERUPPER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String OTHER_CHAR = "!@#$%&*()_+-=[]?";
    private static final String RECOMEND = OTHER_CHAR + CHAR_LOWERUPPER + NUMBER;
    private static final String AlphaNumeric = NUMBER + CHAR_LOWERUPPER;
    private int length = 16;
    protected static SecureRandom random = new SecureRandom();
    
   /* public static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return letters.stream().collect(Collectors.joining());
    }*/
    static char[] contraGeneradaRecomend (int len){
        char[] contrasenia = new char[len];
        for (int i = 0; i < len; i++) {
            contrasenia[i] = RECOMEND.charAt(random.nextInt(RECOMEND.length()));
        }
        return contrasenia;
    }
    static char[] contraGeneradaAlphaNum (int len){
        char[] contrasenia = new char[len];
        for (int i = 0; i < len; i++) {
            contrasenia[i] = AlphaNumeric.charAt(random.nextInt(AlphaNumeric.length()));
        }
        return contrasenia;
    }
    static char[] contraGeneradaAlpha (int len){
        char[] contrasenia = new char[len];
        for (int i = 0; i < len; i++) {
            contrasenia[i] = CHAR_LOWERUPPER.charAt(random.nextInt(CHAR_LOWERUPPER.length()));
        }
        return contrasenia;
    }
    static char[] contraGeneradaNum (int len){
        char[] contrasenia = new char[len];
        for (int i = 0; i < len; i++) {
            contrasenia[i] = NUMBER.charAt(random.nextInt(NUMBER.length()));
        }
        return contrasenia;
    }
  
}
