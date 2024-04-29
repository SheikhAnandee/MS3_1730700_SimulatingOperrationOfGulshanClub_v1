package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import cls.employee.Employee;
import cls.investor.Investor;
import cls.member.Member;
import cls.president.President;
import cls.user.User;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

 public class SignUpController implements Initializable {
     

    @FXML
    private Button Resister;
    @FXML
    private TextField emailField;
    @FXML
    private ComboBox<String> typeField;
    @FXML
    private TextField nameField;
    @FXML
    private RadioButton maleField;
    @FXML
    private RadioButton femaleField;
    @FXML
    private RadioButton othersField;
    @FXML
    private DatePicker dobField;
    @FXML
    private PasswordField passField;
    @FXML
    private PasswordField cpassField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        typeField.getItems().addAll("Investor","Member","Employee");
        typeField.setValue("Investor");
    }    

    @FXML
    private void registerBtnClicked(ActionEvent event) {
        String gender;
        if(maleField.isSelected()){
            gender = "Male";
        }
        else if(femaleField.isSelected()){
            gender = "Female";
        }
        else{
            gender = "Others";
        }
        
        String name = nameField.getText();
        String email = emailField.getText();
        String pass = passField.getText(); 
        String cpass = cpassField.getText();
        String userType = typeField.getValue();
        int age = 0;
        
        if(name.isEmpty() || email.isEmpty() || pass.isEmpty() || cpass.isEmpty() || userType.isEmpty()){
            Alert a = new Alert(Alert.AlertType.ERROR, "Sign Up Failed! \nFill all the fields", ButtonType.CLOSE);
            a.show();
        }
        else{
            LocalDate dob;
            try{
                dob = dobField.getValue();
                LocalDate now = LocalDate.now(); //Todays date
                Period p = Period.between(dob, now);
                age = p.getYears();
            } catch(Exception e){
                Alert a = new Alert(Alert.AlertType.ERROR, "Sign Up Failed! \nFill all the fields", ButtonType.CLOSE);
                a.show();
            } 
            
            if(age<18){
                Alert a = new Alert(Alert.AlertType.ERROR, "Age must be >18", ButtonType.CLOSE);
                a.show();
            }
            else if(cpass.equals(pass)){
                if(userType == "Member"){
                    Member member = new Member(LocalDate.now().toString(), "Basic", 101, name, email, pass, userType, gender, age);
                     
                    String fileName="C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Member.bin";
                    File file = new File (fileName);

                    ObjectOutputStream out = null;
                    boolean append=true;
                    try{
                        if (!file.exists () || !append) out =
                        new ObjectOutputStream (new FileOutputStream (fileName));
                        else out =
                        new AppendableObjectOutputStream (new FileOutputStream (fileName, append));

                        out.writeObject(member);
                        out.flush ();
                    }catch (Exception e){
                        System.out.println(e);
                    }finally{
                        try{
                            if (out != null) out.close();
                        }catch (Exception e){
                            System.out.println(e);
                        }
                    }


                }
                else if(userType == "Investor"){
                   Investor investor= new Investor("CompanyA", 102, name, email, pass, userType, gender, age);
                     
                    String fileName="C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Investor.bin";
                    File file = new File (fileName);

                    ObjectOutputStream out = null;
                    boolean append=true;
                    try{
                        if (!file.exists () || !append) out =
                        new ObjectOutputStream (new FileOutputStream (fileName));
                        else out =
                        new AppendableObjectOutputStream (new FileOutputStream (fileName, append));

                        out.writeObject(investor);
                        out.flush ();
                    }catch (Exception e){
                        System.out.println(e);
                    }finally{
                        try{
                            if (out != null) out.close();
                        }catch (Exception e){
                            System.out.println(e);
                        }
                    } 
                }
                
           /*     else if(userType == "Employee"){
                   Employee employee= new Employee(LocalDate.now().toString(), 103, name, email, pass, userType, gender, age);
                     
                    String fileName="C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Employee.bin";
                    File file = new File (fileName);

                    ObjectOutputStream out = null;
                    boolean append=true;
                    try{
                        if (!file.exists () || !append) out =
                        new ObjectOutputStream (new FileOutputStream (fileName));
                        else out =
                        new AppendableObjectOutputStream (new FileOutputStream (fileName, append));

                        out.writeObject(employee);
                        out.flush ();
                    }catch (Exception e){
                        System.out.println(e);
                    }finally{
                        try{
                            if (out != null) out.close();
                        }catch (Exception e){
                            System.out.println(e);
                        }
                    } 
                }
          
                else if(userType == "President"){
                   President president= new President(LocalDate.now().toString(), 100, name, email, pass, userType, gender, age);
                     
                    String fileName="C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\President.bin";
                    File file = new File (fileName);

                    ObjectOutputStream out = null;
                    boolean append=true;
                    try{
                        if (!file.exists () || !append) out =
                        new ObjectOutputStream (new FileOutputStream (fileName));
                        else out =
                        new AppendableObjectOutputStream (new FileOutputStream (fileName, append));

                        out.writeObject(president);
                        out.flush ();
                    }catch (Exception e){
                        System.out.println(e);
                    }finally{
                        try{
                            if (out != null) out.close();
                        }catch (Exception e){
                            System.out.println(e);
                        }
                    } 
                }
                    */
                
                Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Signup Sucessfull!", ButtonType.CLOSE);
                a.show();
            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR, "Passwords are not same", ButtonType.CLOSE);
                a.show();
            }
        }
        
        
    }

    @FXML
    private void loginBtnClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void maleBtnClicked(ActionEvent event) {
        if(femaleField.isSelected()){
            femaleField.setSelected(false);
        }
        else if(othersField.isSelected()){
            othersField.setSelected(false);
        }
    }

    @FXML
    private void femaleBtnClicked(ActionEvent event) {
        if(maleField.isSelected()){
            maleField.setSelected(false);
        }
        else if(othersField.isSelected()){
            othersField.setSelected(false);
        }
    }

    @FXML
    private void otherBtnClicked(ActionEvent event) {
        if(femaleField.isSelected()){
            femaleField.setSelected(false);
        }
        else if(maleField.isSelected()){
            maleField.setSelected(false);
        }
    }
    
}
