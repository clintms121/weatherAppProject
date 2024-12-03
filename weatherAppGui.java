import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

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

        //search button
        JButton searchButton = new JButton(loadImage("C:/Users/clint/OneDrive/Documents/School/My Major!/Code/Projects/unfinished projects/weatherApp/weather/src/assets/search.png"));

        //change the cursor to a hand cursor when hovering over this button
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);
    }

    //method to create image in our gui components
    private ImageIcon loadImage(String resourcePath) {
        try {


            //read the image file from thepath given
            BufferedImage image = ImageIO.read(new File(resourcePath));

            //return image icon so that our component renders it
            return new ImageIcon(image);
        }catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("Could not find resource"); //send error message to the console
        return null;
    
        }

    }

