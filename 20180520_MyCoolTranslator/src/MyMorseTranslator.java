public class MyMorseTranslator implements ITranslator {

    @Override
    public String translate(String input) {
        String output = "";
        if(input == null){
            return null;
        }
        try {
            input = input.toLowerCase();

            for (int i = 0; i < input.length(); i++) {
                char x = input.charAt(i);
                String c = String.valueOf(x);
                if(!c.equals("\n")){
                    String o = MorseCode.MORSE_CODE.get(c);
                    if ( o == null) {
                        o = " ";
                    }
                    output = output.concat(o);
                } else {
                    output = output.concat("\n");
                }
            }
        } catch (NullPointerException npe){
            System.out.println("Translation Null Pointer Exception");
            return null;
        } catch (Exception e){
            System.out.println("Translation Exception");
            return null;
        }

        return output;
    }
}
