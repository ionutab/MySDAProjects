public class Main {

    public static void translate(IReader iReader, ITranslator iTranslator, IDisplay iDisplay){
        String input = iReader.read();
        String translated = iTranslator.translate(input);
        iDisplay.display(translated);
    }

    public static void main(String[] args) {
	// write your code here

        MySystemReader mySystemReader = new MySystemReader();
        MyMorseTranslator myMorseTranslator = new MyMorseTranslator();
        MyMobileTranslator myMobileTranslator = new MyMobileTranslator();
        MySystemDisplay mySystemDisplay = new MySystemDisplay();
        MyFileReader myFileReader = new MyFileReader();
        MyFileWriter myFileWriter = new MyFileWriter();

        translate(mySystemReader, myMorseTranslator, mySystemDisplay);
        System.out.println("-----");
        translate(myFileReader, myMorseTranslator, mySystemDisplay);
        System.out.println("-----");
        translate(myFileReader, myMorseTranslator, myFileWriter);
        System.out.println("-----");
        translate(myFileReader, myMorseTranslator, myFileWriter);
        System.out.println("-----");
        translate(myFileReader, myMobileTranslator, mySystemDisplay);
    }

}
