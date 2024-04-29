
package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ForgotPasswaordController implements Initializable {

    @FXML
    private TextField Email;
    @FXML
    private Button Reset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GotoLoginPage(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")); 
             
        Scene scene = new Scene(root);
        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }
        
    
    }
    

