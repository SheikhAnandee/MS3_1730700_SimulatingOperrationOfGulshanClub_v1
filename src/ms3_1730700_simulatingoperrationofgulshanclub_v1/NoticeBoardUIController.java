package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class NoticeBoardUIController implements Initializable {

    @FXML
    private VBox vboxNotice;
    @FXML
    private TextArea NoticeText;
    @FXML
    private Button ApproveNotice;
    @FXML
    private Button UpdateNotice;
    @FXML
    private Button ViewNotice;
    @FXML
    private Button SendNotice;
    @FXML
    private Pane NoticeBoardPane;
    @FXML
    private ComboBox<String> NoticeComboBox;

    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        NoticeComboBox.getItems().addAll("President","Investor",
                                        "Member","Employee");
    } 

    @FXML
    private void viewbtnClickOnToviewNotice(ActionEvent event) throws FileNotFoundException {
       /* String str = "";
        String location = "C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\notice.txt";
         try {
            File f = new File(location); ///could not track location
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                str += s.nextLine();
                
            }
             System.out.println(str);
            NoticeText.setText(str);
         }catch(Exception ex){
                    System.out.println(ex);   //
                    System.out.println("File not found");
                } */
         }
    
    }
    

