package klasse12;



public class Main {

    public static void main(String[] args) {
        Screen1 screen1 = new Screen1();

        Model model = new Model();

        GUI gui = new GUI();
        
        Controller controller = new Controller(model , gui);

        /*options options = new options();
        screens mainscreen = new screens(options.default_screenwidth, options.default_screenheight);*/

    }

}
