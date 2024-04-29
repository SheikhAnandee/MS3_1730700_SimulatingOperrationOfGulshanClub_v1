
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class VisitorController implements Initializable {

    @FXML
    private VBox Vbox;
    @FXML
    private Button Policy;
    @FXML
    private Button Event;
    @FXML
    private Button Facilities;
    @FXML
    private Button Reservations;
    @FXML
    private Button BookVenue;
    @FXML
    private Button CreateInvoice;
    @FXML
    private Button Review;
    @FXML
    private Button Membership;
    @FXML
    private Button Contact;
    @FXML
    private BorderPane borderpane;
    @FXML
    private HBox Hbox;
    @FXML
    private Pane MenuPane;
    @FXML
    private MenuBar Logout;
    @FXML
    private Menu LogoutBtn;
    @FXML
    private Button Gallery;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ContactBtnClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Contact.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void PolicyBtnClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Policy.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void EventBtnClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Events.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void FacilitiesBtnClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Facilities.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void ReservationBtnClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Reservations.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void BookVenueBtnClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("BookVenue.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void InvoiceButtonClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("CreateInvoice.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void ReviewButtonClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Reviews.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void ApplyMembershipBtnClicked(ActionEvent event)  throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("ApplyForMembership.fxml"));
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
    
}

    

    