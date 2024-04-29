/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author User50
 */
public class BookVenueController implements Initializable {

    @FXML
    private VBox BookVenueVbox;
    @FXML
    private Pane BookVenuePane;
    @FXML
    private TextArea DetailsText;
    @FXML
    private CheckBox Checkbox;
    @FXML
    private Button submitButton;
    @FXML
    private ComboBox<?> VenueList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SubmitBtnClicked(ActionEvent event) { 
        ButtonType yes = new ButtonType("OK");
        Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Your booking has been confirmed"
                    + "Check your email for details", ButtonType.CLOSE);
                a.show();
    }
    
}
