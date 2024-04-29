package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import cls.employee.Employee;
import cls.president.President;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author User50
 */
public class MS3_1730700_SimulatingOperrationOfGulshanClub_v1 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        /*
        // Write admin files
        File file = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream= null;
        
        try {
            file = new File("C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Employee.bin");

            if(file.exists()){
                fileOutputStream = new FileOutputStream(file, true);
                //objectOutputStream = new AppendableObjectOutputStream(fileOutputStream);
            }
            else {
                fileOutputStream = new FileOutputStream(file);
                //objectOutputStream = new ObjectOutputStream(fileOutputStream);
            }
            // Only for Admin
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            Employee employee = new Employee(
                    20000,
                    "Manager",
                    110,
                    "Anandee Hasan",
                    "anandeehasan@gmail.com",
                    "anandeehasan",
                    "Employee",
                    "Female",
                    22
            );

            objectOutputStream.writeObject(employee);
            
        } catch(IOException IOE){
            System.out.println(IOE);
        } finally{
            try{
                if(objectOutputStream!=null) objectOutputStream.close();
            } catch(IOException IOE){
                System.out.println(IOE);
            }
        }
        */
 
        
        
        
        
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
