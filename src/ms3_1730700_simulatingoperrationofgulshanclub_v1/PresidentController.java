
package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PresidentController implements Initializable {

    @FXML
    private VBox Vbox;
    @FXML
    private Button Profile;
    @FXML
    private Button Notice;
    @FXML
    private Button ScheduleMeeting;
    @FXML
    private Button Policy;
    @FXML
    private Button Reports;
    @FXML
    private Button Event;
    @FXML
    private Button Facilities;
    @FXML
    private Button Reservations;
    @FXML
    private Button Reviews;
    @FXML
    private Button BookVenue;
    @FXML
    private BorderPane borderpane;
    @FXML
    private Button Contact;
    @FXML
    private Button AssignTask;
    @FXML
    private Pane MenuPane;
    @FXML
    private MenuBar Logout;
    @FXML
    private Menu logoutBtn;
    @FXML
    private Button Gallery;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void sceduleMeetingBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("PresidentUI1.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void noticeBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("NoticeBoardUI.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void reportBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("PresidentReportUI.fxml"));
        borderpane.setCenter(root);
    }
    @FXML
    private void profileBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("PresidentProfileUI.fxml"));
        borderpane.setCenter(root);
    } 
    @FXML
        private void EventBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Events.fxml"));
        borderpane.setCenter(root);
        }
    @FXML
        private void policyBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Policy.fxml"));
        borderpane.setCenter(root);
        }
        
        @FXML
        private void ContactBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Contact.fxml"));
        borderpane.setCenter(root);
    } 
           @FXML
        private void FacilitiesBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Facilities.fxml"));
        borderpane.setCenter(root);
    } 
        @FXML
        private void ReservationBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Reservations.fxml"));
        borderpane.setCenter(root);
    } 
 @FXML
        private void BookVenueBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("BookVenue.fxml"));
        borderpane.setCenter(root);
    } 

    @FXML
    private void LogoutBtnClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void GalleryBtnClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Gallery.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void AssignBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("EmployeeList.fxml"));
        borderpane.setCenter(root);
    }
    
    
}
