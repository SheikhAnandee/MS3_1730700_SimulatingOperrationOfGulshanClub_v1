package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import cls.employee.Employee;
import cls.investor.Investor;
import cls.member.Member;
import cls.president.President;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author User50
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private PasswordField Password;
    @FXML
    private Button Login;
    @FXML
    private ComboBox<String> UserType;
    @FXML
    private ImageView Image;
    @FXML
    private TextField UserID;
    @FXML
    private Label User;
    @FXML
    private Label label;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        UserType.getItems().addAll("President","Investor","Member","Employee","Guest");
        UserType.setValue("Guest");
        
    }    


    @FXML
    private void loginBtnActionPerformed(ActionEvent event) throws IOException {
        String userType = UserType.getValue();
        if(userType.equals("Guest")){
            Parent presidentView = FXMLLoader.load(getClass().getResource("Visitor.fxml"));
            Scene presidentViewScene = new Scene(presidentView);

            Stage currentWindow = (Stage)((Node)event.getSource()).getScene().getWindow();

            currentWindow.setScene(presidentViewScene);
            currentWindow.show();
        }
        else{
            int userId = parseInt(UserID.getText());
            String password = Password.getText();



            if(userType == "President"){
                ObjectInputStream in = null; 
                boolean isMatch = false;
                File f = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;

                try {  
                    in = new ObjectInputStream(new FileInputStream("C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\President.bin"));
                    President president;
                    while( (president = (President)in.readObject()) != null ) {
                        if(president.getPassword().equals(password) && president.getMemberId()==userId){                       
                            isMatch = true;
                            break;
                        }
                    }
                    in.close();
                } catch (Exception e) {
                    Alert a = new Alert(AlertType.NONE, "Log In Failed! \nPlease Try again", ButtonType.CLOSE);
                    a.show();
                }

                if(isMatch == true){
                    Parent presidentView = FXMLLoader.load(getClass().getResource("President.fxml"));
                    Scene presidentViewScene = new Scene(presidentView);

                    Stage currentWindow = (Stage)((Node)event.getSource()).getScene().getWindow();

                    currentWindow.setScene(presidentViewScene);
                    currentWindow.show();
                }
                else{
                    Alert a = new Alert(AlertType.NONE, "Log In Failed! \nPlease Try again", ButtonType.CLOSE);
                    a.show();
                }  
            }
            else if(userType == "Member"){
                ObjectInputStream in = null;
                boolean isMatch = false;
                File f = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;

                try {  
                    in = new ObjectInputStream(new FileInputStream("C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Member.bin"));
                    Member member;
                    while( (member = (Member)in.readObject()) != null ) {
                        if(member.getPassword().equals(password) && member.getMemberId()==userId){                       
                            isMatch = true;
                            break;
                        }
                    }
                    in.close();
                } catch (Exception e) {
                    System.out.println(e);
                    Alert a = new Alert(AlertType.NONE, "Log In Failed! \nPlease Try again", ButtonType.CLOSE);
                    a.show();
                }

                if(isMatch == true){
                    Parent presidentView = FXMLLoader.load(getClass().getResource("Member.fxml"));
                    Scene presidentViewScene = new Scene(presidentView);

                    Stage currentWindow = (Stage)((Node)event.getSource()).getScene().getWindow();

                    currentWindow.setScene(presidentViewScene);
                    currentWindow.show();
                }
                else{
                    Alert a = new Alert(AlertType.NONE, "Log In Failed! \nPlease Try again", ButtonType.CLOSE);
                    a.show();
                }     
            }
            else if(userType == "Investor"){
                ObjectInputStream in = null;
                boolean isMatch = false;
                File f = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;

                try {  
                    in = new ObjectInputStream(new FileInputStream("C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Investor.bin"));
                    Investor investor;
                    while( (investor = (Investor)in.readObject()) != null ) {
                        if(investor.getPassword().equals(password) && investor.getInvestorId()==userId){                       
                            isMatch = true;
                            break;
                        }
                    }
                    in.close();
                } catch (Exception e) {
                    System.out.println(e);
                    Alert a = new Alert(AlertType.NONE, "Log In Failed! \nPlease Try again", ButtonType.CLOSE);
                    a.show();
                }

                if(isMatch == true){
                    Parent presidentView = FXMLLoader.load(getClass().getResource("Investor.fxml"));
                    Scene presidentViewScene = new Scene(presidentView);

                    Stage currentWindow = (Stage)((Node)event.getSource()).getScene().getWindow();

                    currentWindow.setScene(presidentViewScene);
                    currentWindow.show();
                }
                else{
                    Alert a = new Alert(AlertType.NONE, "Log In Failed! \nPlease Try again", ButtonType.CLOSE);
                    a.show();  
                }
            } 

            else if(userType == "Employee"){
                ObjectInputStream in = null;
                boolean isMatch = false;
                File f = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;

                try {  
                    in = new ObjectInputStream(new FileInputStream("C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Employee.bin"));
                    Employee employee;

                    while( (employee = (Employee)in.readObject()) != null ) {
                        if(employee.getPassword().equals(password) && employee.getId()==userId){   

                            isMatch = true;
                            break;
                        }
                    }
                    in.close();
                } catch (Exception e) {
                    System.out.println(e);
                    Alert a = new Alert(AlertType.NONE, "Log In Failed! \nPlease Try again", ButtonType.CLOSE);
                    a.show();
                }

                if(isMatch == true){
                    Parent presidentView = FXMLLoader.load(getClass().getResource("Employee.fxml"));
                    Scene presidentViewScene = new Scene(presidentView);

                    Stage currentWindow = (Stage)((Node)event.getSource()).getScene().getWindow();

                    currentWindow.setScene(presidentViewScene);
                    currentWindow.show();
                }
                else{
                    Alert a = new Alert(AlertType.NONE, "Log In Failed! \nPlease Try again", ButtonType.CLOSE);
                    a.show();  
                }
             }
        }
        
    }

    @FXML
    private void forgetBtnActionPerformed(ActionEvent event) throws IOException {
        Parent presidentView = FXMLLoader.load(getClass().getResource("forgotPasswaord.fxml"));
        Scene presidentViewScene = new Scene(presidentView);
        
        Stage currentWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        currentWindow.setScene(presidentViewScene);
        currentWindow.show();
    }

    @FXML
    private void signupBtnClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

} 
              
            
    

