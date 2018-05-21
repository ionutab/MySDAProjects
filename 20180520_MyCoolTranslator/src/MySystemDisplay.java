public class MySystemDisplay implements IDisplay {

    @Override
    public void display(String output) {

        if(output == null){
            return;
        }

        System.out.println(" Transalated text: ");
        System.out.println(output);
    }
}
