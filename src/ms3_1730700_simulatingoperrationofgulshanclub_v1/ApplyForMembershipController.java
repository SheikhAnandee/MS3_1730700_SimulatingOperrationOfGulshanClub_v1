/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author User50
 */
public class ApplyForMembershipController implements Initializable {

    @FXML
    private VBox ApplyforMembershipVbox;
    @FXML
    private Pane ApplyforMembershipPane;
    @FXML
    private RadioButton MaleButton;
    @FXML
    private RadioButton Femalebutton;
    @FXML
    private RadioButton Other;
    @FXML
    private ComboBox<?> MembershipType;
    @FXML
    private Button SubmitButton;
    @FXML
    private TextArea TextToApply;
    @FXML
    private CheckBox Checkbox;

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
        Alert a = new Alert(Alert.AlertType.CONFIRMATION, "WELLCOME"
                    + "to GULSHAN CLUB", ButtonType.CLOSE);
                a.show();
    }
    
}
