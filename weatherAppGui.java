import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Font;

public class weatherAppGui extends JFrame { //inheritance to the jFrame class gui
    public weatherAppGui () {
        //setup gui and add title
        setTitle("Weather App");

        //make the gui end the programs process once it has been closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set the size of gui (pixels)
        setSize(450, 650);
        
        //load gui at the center of the screen
        //null
        setLocationRelativeTo(null);

        //make layoutmanager null to manually position our components within the gui
        setLayout(null);

        //prevent resizing of gui
        setResizable(false);

        addGuiComponents();
    }


    private void addGuiComponents(){ //declare method
        //search field
        JTextField searchTextField = new JTextField();

        //set the location and size of our component
        searchTextField.setBounds(15, 15, 351, 45);

        //change the font style and size
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(searchTextField);
    }
}
