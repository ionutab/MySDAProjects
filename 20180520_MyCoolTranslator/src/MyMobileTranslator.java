import java.util.HashMap;

public class MyMobileTranslator implements ITranslator {

    public static final HashMap<Integer, String> MOBILE_KEYS = new HashMap<>();

    static {
        MOBILE_KEYS.put(0, "\n");
        MOBILE_KEYS.put(1, " ");
        MOBILE_KEYS.put(2, "abc");
        MOBILE_KEYS.put(3, "def");
        MOBILE_KEYS.put(4, "ghi");
        MOBILE_KEYS.put(5, "jkl");
        MOBILE_KEYS.put(6, "mnop");
        MOBILE_KEYS.put(7, "qrs");
        MOBILE_KEYS.put(8, "tuv");
        MOBILE_KEYS.put(9, "wxyz");
    }

    @Override
    public String translate(String input) {

        String output = "";

        if(input == null){
            return null;
        }

        input = input.toLowerCase();
        for(int i = 0; i< input.length(); i++){

            char x = input.charAt(i);
            String c = String.valueOf(x);

            String cTranslated = "";
            for(Integer k : MOBILE_KEYS.keySet()){
                String ks = MOBILE_KEYS.get(k);

                Integer cIndex = ks.indexOf(c);
                if(cIndex >= 0){
                    for(int j = 0; j <= cIndex; j++){
                        cTranslated = cTranslated.concat(String.valueOf(k));
                    }
                }
            }

            cTranslated = cTranslated.concat(".");
            output = output.concat(cTranslated);
        }

        return output;
    }
}
