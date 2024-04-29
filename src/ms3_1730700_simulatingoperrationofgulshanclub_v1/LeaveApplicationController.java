/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User50
 */
public class LeaveApplicationController implements Initializable {

    @FXML
    private RadioButton SigleDayButton;
    @FXML
    private RadioButton HalfDaybutton;
    @FXML
    private RadioButton MultipleButton;
    @FXML
    private TextArea Reason;
    @FXML
    private ComboBox<String> LeaveTypeButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         LeaveTypeButton.getItems().addAll("Casual","Medical",
                                        "Privileged","Maternity");
    }    
    
}
