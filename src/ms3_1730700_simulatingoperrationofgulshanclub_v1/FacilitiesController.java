/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms3_1730700_simulatingoperrationofgulshanclub_v1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author User50
 */
public class FacilitiesController implements Initializable {

    @FXML
    private VBox FacilitiesVbox;
    @FXML
    private Pane FacilitiesPane;
    @FXML
    private ComboBox<String> FacilitiesCombobox;
    @FXML
    private Button ReadButton;
    @FXML
    private ImageView Image2;
    @FXML
    private ImageView Image3;
    @FXML
    private ImageView Image4;
    @FXML
    private ImageView Image1;
    @FXML
    private ImageView Image5;
    @FXML
    private ImageView Image6;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         FacilitiesCombobox.getItems().addAll("Gym","Restuarant","Squash","Library",
                                        "Tennis","Swimming Pool");
    }    
    
}
