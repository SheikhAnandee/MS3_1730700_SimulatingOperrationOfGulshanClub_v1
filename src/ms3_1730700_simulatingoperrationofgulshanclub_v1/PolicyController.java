
package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User50
 */
public class PolicyController implements Initializable {

    @FXML
    private ComboBox<String> PolicyCombo;
    @FXML
    private Button ViewPolicy;
    @FXML
    private Button ChangePolicy;
    @FXML
    private TextArea Policy;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        PolicyCombo.getItems().addAll("President","Investor",
                                        "Member","Employee","Guest");
    } 
    
        // TODO
    }    
    

