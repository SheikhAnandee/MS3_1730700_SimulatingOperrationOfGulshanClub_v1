package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import cls.investor.Investor;
import cls.employee.Employee;
import cls.member.Member;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class PresidentReportUIController implements Initializable {

    @FXML
    private BorderPane reportBorderPane;
    @FXML
    private ComboBox<String> typeComboBox;
    @FXML
    private Button generateBtn;
    @FXML
    private Pane paneView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeComboBox.getItems().addAll("Monthly Turnover","Annually Turnover",
                                        "Member List","Employee List");
    }    

    @FXML
    private void onClickGenerate(ActionEvent event) {
        String type = typeComboBox.getValue(); 
        paneView.getChildren().clear(); 
        if(type.equals("Monthly Turnover")){
            LocalDate now = LocalDate.now();
            int year = now.getYear();    
            float[] turnover = new float[12]; 
            
            File f = null;
            Scanner sc; String str; String[] tokens;
            try {
                f = new File("C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Bill.txt");
                sc = new Scanner(f);
                if(f.exists()){
                    while(sc.hasNextLine()){
                        str=sc.nextLine();
                        tokens = str.split(","); 
                        if(tokens[2].equals(Integer.toString(year))){ 
                            System.out.println(year);
                            if(tokens[1].equals("January")){
                                turnover[0]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("February")){
                                turnover[1]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("March")){
                                turnover[2]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("April")){
                                turnover[3]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("May")){
                                turnover[4]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("June")){
                                turnover[5]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("July")){
                                turnover[6]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("August")){
                                turnover[7]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("September")){
                                turnover[8]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("October")){
                                turnover[9]+=Float.parseFloat(tokens[3]);
                            }
                            else if(tokens[1].equals("November")){
                                turnover[10]+=Float.parseFloat(tokens[3]);
                            }
                            else{
                                turnover[11]+=Float.parseFloat(tokens[3]);
                            }
                        }
                        
                    }
                }
                else{
                    System.out.println("File not available");
                }

            } 
            catch (IOException ex) {
                System.out.println(ex);
            } 
            finally {
            }
            
            XYChart.Series series = new XYChart.Series();
            String[] months = {"January", "February", "March", "April", "May", "June",
                                "July", "August", "September", "October", "November", "December"};
            for(int i=0; i<12; i++){
                series.getData().add(new XYChart.Data(months[i],turnover[i]));
            }
            series.setName(""+year); 
            
            final CategoryAxis xAxis = new CategoryAxis();
            final NumberAxis yAxis = new NumberAxis();
            final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
            
            bc.getData().add(series);
            bc.setTitle("Monthly Turnover");
            xAxis.setLabel("Month");       
            yAxis.setLabel("Amount(Tk)");
            
            paneView.getChildren().add(bc);
        }
        else if(type.equals("Annually Turnover")){
            LocalDate now = LocalDate.now();
            int year = now.getYear();
            float[] turnover = new float[3];
            
            File f = null;
            Scanner sc; String str; String[] tokens;
            try {
                f = new File("C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Bill.txt");
                sc = new Scanner(f);
                if(f.exists()){
                    while(sc.hasNextLine()){
                        str=sc.nextLine();
                        tokens = str.split(",");
                        if(tokens[2].equals(Integer.toString(year-2))){
                            turnover[0]+=Float.parseFloat(tokens[3]);
                        }
                        else if(tokens[2].equals(Integer.toString(year-1))){
                            turnover[1]+=Float.parseFloat(tokens[3]);
                        }
                        else if(tokens[2].equals(Integer.toString(year))){
                            turnover[1]+=Float.parseFloat(tokens[3]);
                        }
                    }
                }
                else{
                    System.out.println("File not available");
                }

            } 
            catch (IOException ex) {
                System.out.println(ex);
            } 
            finally {
            }

            XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
            String[] years = {Integer.toString(year-2), Integer.toString(year-1), Integer.toString(year)};
            for(int i=0; i<3; i++){
                System.out.println(turnover[i]);
                series.getData().add(new XYChart.Data<String,Number>(years[i],turnover[i]));
            }
            
            final CategoryAxis xAxis = new CategoryAxis();
            final NumberAxis yAxis = new NumberAxis();
            final LineChart<String,Number> bc = new LineChart<String,Number>(xAxis,yAxis);
            series.setName("Turnover");
            bc.getData().add(series);
            bc.setTitle("Annually Turnover");
            xAxis.setLabel("Year");      
            yAxis.setLabel("Amount(Tk)");
            
            paneView.getChildren().add(bc);
        }
        else if(type.equals("Employee List")){
            File f = null;
            FileInputStream fis = null;      
            ObjectInputStream ois = null;
            
            int male = 0, female = 0, others =0;

            try {
                f = new File("C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Employee.bin");
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                Employee emp;
                try{
                    while(true){
                        emp = (Employee)ois.readObject();
                        if(emp.getGender().equals("Male")){
                            male+=1;
                        }
                        else if(emp.getGender().equals("Female")){
                            female += 1;
                        }
                        else{
                            others += 1;
                        }
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }              
            } catch (IOException ex) { System.out.println(ex);} 
            finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }
            }
            
            ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
            list.add(new PieChart.Data("Male", male));
            list.add(new PieChart.Data("Feale", female));
            list.add(new PieChart.Data("Others", others));
            PieChart chart = new PieChart(list);
            chart.setTitle("Employee");
            paneView.getChildren().add(chart);
        }
        else if(type.equals("Member List")){
            File f = null;
            FileInputStream fis = null;      
            ObjectInputStream ois = null;
            
            int basic = 0, standard = 0, premium =0;

            try {
                f = new File("C:\\Users\\User50\\Documents\\NetBeansProjects\\MS3_1730700_SimulatingOperrationOfGulshanClub_v1\\src\\files\\Member.bin");
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                Member mem;
                try{
                    while(true){
                        mem = (Member)ois.readObject();
                        if(mem.getMembershipType().equals("Basic")){
                            basic+=1;
                        }
                        else if(mem.getMembershipType().equals("Standard")){
                            standard += 1;
                        }
                        else{
                            premium += 1;
                        }
                    }
                }
                catch(Exception e){
                    //
                }              
            } catch (IOException ex) { } 
            finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }
            }
            ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
            list.add(new PieChart.Data("Basic", basic));
            list.add(new PieChart.Data("Standard", standard));
            list.add(new PieChart.Data("Premium", premium));
            PieChart chart = new PieChart(list);
            chart.setTitle("Member");
            paneView.getChildren().add(chart);
        }
    }

    @FXML
    private void onClickPrint(ActionEvent event) {
    }
    
}
