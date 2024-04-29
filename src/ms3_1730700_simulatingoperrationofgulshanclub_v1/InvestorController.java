package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class InvestorController implements Initializable {

    @FXML
    private Button notice;
    @FXML
    private Button Policy;
    @FXML
    private Button Reports;
    @FXML
    private Button ScheduleMeeting;
    @FXML
    private Button Event;
    @FXML
    private Button Facitities;
    @FXML
    private Button Reservations;
    @FXML
    private Button Reviews;
    @FXML
    private Button BookVenue;
    @FXML
    private Button Contact;
    @FXML
    private AnchorPane anchorPaneInvestor;
    @FXML
    private VBox InvestorVbox;
    @FXML
    private HBox Hbox;
    @FXML
    private BorderPane borderpane;
    @FXML
    private Pane pane;
    @FXML
    private MenuBar logout;
    @FXML
    private Menu LogoutBtn;
    @FXML
    private Button Gallery;
    @FXML
    private Button FinancialSubsidiaries;
    @FXML
    private Button ShareHolding;
    @FXML
    private Button AnnualRerort;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void NoticeBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("NoticeBoardUI.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void ContactBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Contact.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void PolicyBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Policy.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void ReportBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("PresidentReportUT.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void MeetingBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("PresidentUI1.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void EventBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Events.fxml"));
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
    private void ReviewBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Reviews.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void BookVenueBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("BookVenue.fxml"));
        borderpane.setCenter(root);
    }


    @FXML
    private void LogoutBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void GalleryBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Gallery.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void LogoutBtnClicked(MouseEvent event) {
    }

    @FXML
    private void FinalcialSubsidiariesBtnClicked(ActionEvent event) {
    }

    @FXML
    private void ShareholdingBtnClicked(ActionEvent event) {
    }

    @FXML
    private void AnnualReportBtnClicked(ActionEvent event) {
    }
    
    
}
