package klasse12;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


public class Controller implements Observer, ActionListener {
    private Model model;
    private GUI gui;
  //  private Screen1;
    
    
    public Controller (Model model, GUI gui){
        
      this.model =model;
      this. gui = gui;
      //this screen1 =screen1;
      
      
        model.addObserver(this);
        
        gui.getExitButton().addActionListener(this);
            gui.getAlgoButton().addActionListener(this);
              gui.getJaButton().addActionListener(this);  
              gui.getDaButton().addActionListener(this);
                gui.getProButton().addActionListener(this);
                gui.getTIButton().addActionListener(this);
                  gui.getDowButton().addActionListener(this);
                    
  
        gui.setVisible(true);
    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case GUI.Exit:
                model.GO();
                break;
    }
     
        switch (ae.getActionCommand()) {
            case GUI.Algorithmen:
        //    addActionListener (this);
                break;
    }
    
}
}

 class Controller1 implements Observer, ActionListener{
    
     private Model model;
    private Screen1 screen1;
    
     public Controller1 (){
        this.model =model;
      this. screen1 = screen1;
        
            model.addObserver(this);
            
           screen1.getExitButton().addActionListener(this);
           screen1.getAufButton().addActionListener(this);
             screen1.getTheButton().addActionListener(this);  
              screen1.getVidButton().addActionListener(this);
                screen1.getLosButton().addActionListener(this);
                screen1.getBeiButton().addActionListener(this);
            
 
 
     screen1.setVisible(true);
    
}

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         switch (ae.getActionCommand()) {
            case Screen1.Exit:
                model.GO();
                break;
    }
         
}
 }
// geändert

