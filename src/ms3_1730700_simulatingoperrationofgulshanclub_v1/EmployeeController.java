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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


 public class EmployeeController implements Initializable {

    @FXML
    private VBox Vbox;
    @FXML
    private Button Profile;
    @FXML
    private Button Notice;
    @FXML
    private Button Policy;
    @FXML
    private Button Reports;
    @FXML
    private Button LeaveApplicatin;
    @FXML
    private Button CreateInvoice;
    @FXML
    private Button Event;
    @FXML
    private Button Facilities;
    @FXML
    private Button Review;
    @FXML
    private Button contact;
    @FXML
    private BorderPane borderpane;
    @FXML
    private HBox Hbox;
    @FXML
    private Pane pane;
    @FXML
    private MenuBar logout;
    @FXML
    private Menu logoutBtn;
    @FXML
    private Button Gallery;
    @FXML
    private Button Duties;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void LeaveApplicationBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("LeaveApplication.fxml"));
        borderpane.setCenter(root);
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
        Parent root  = FXMLLoader.load(getClass().getResource("PresidentReportUI.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void CreateInvoiceBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Invoice.fxml"));
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
    private void ReviewBtnClicked(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Reviews.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void LogutBtnClicked(ActionEvent event) throws IOException{
         Parent root  = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void GalleryBtnClicked(ActionEvent event) throws IOException{
         Parent root  = FXMLLoader.load(getClass().getResource("Gallery.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void LogutBtnClicked(MouseEvent event) {
    }

    @FXML
    private void DutiesBtnClicked(ActionEvent event) {
    }
    }
 
 
