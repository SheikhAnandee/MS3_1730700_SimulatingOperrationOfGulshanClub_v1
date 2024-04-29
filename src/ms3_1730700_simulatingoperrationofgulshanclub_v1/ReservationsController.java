package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author User50
 */
public class ReservationsController implements Initializable {

    @FXML
    private VBox reservationsVbox;
    @FXML
    private Pane reservationPane;
    @FXML
    private ComboBox<String> RestuarantCombo;
    @FXML
    private ComboBox<String> TableSizeCombo;
    @FXML
    private DatePicker DayPicker;
    @FXML
    private CheckBox CheckBoxCombo;
    @FXML
    private ComboBox<String> TimeCombo;
    @FXML
    private Button SubmitButton;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         TableSizeCombo.getItems().addAll("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15");
         TimeCombo.getItems().addAll("8:00am","9:00am","10:00am","11:00am","12:00pm","1:00pm",
                 "2:00pm","3:00pm","4:00pm","5:00pm","6:00pm","7:00pm","8:00pm","9:00pm","10:00pm");
           RestuarantCombo.getItems().addAll("Baton Rouge","Sky Pool Restuarant","Royal Buffet");
    }  

    @FXML
    private void SubmitBtnClicked(ActionEvent event) {
        //if(CheckBoxCombo.isSelected()){
        
        
           ButtonType yes = new ButtonType("OK");
           /* Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("Your Reservation has been confirmed "
                    + "Check your email for details");
            alert.getButtonTypes().clear();
            alert.getButtonTypes().add(yes);
            Optional<ButtonType> option = alert.showAndWait();
            if(option.get() == yes){
                alert.close(); */
            Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Reservation Sucessfull!"
                    + "Check your email for details", ButtonType.CLOSE);
                a.show();
    }
}
