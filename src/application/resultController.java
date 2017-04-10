package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by Ashfaq on 4/7/17.
 */
public class resultController {

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtStudId;
    @FXML
    private TextField mod1;
    @FXML
    private TextField mod2;
    @FXML
    private TextField mod3;
    @FXML
    private TextField mod4;
    @FXML
    private TextField mod5;
    @FXML
    private TextField mod6;
    @FXML
    private TextField mod7;
    @FXML
    private TextField mod8;
    @FXML
    private TextField mod9;
    @FXML
    private TextField mod10;



    public void btnSubmit(ActionEvent event) throws IOException {
        String nameE= txtName.getText();
        String studentE= txtStudId.getText();
        String mod1E= mod1.getText();
        String mod2E= mod2.getText();
        String mod3E= mod3.getText();
        String mod4E= mod4.getText();
        String mod5E= mod5.getText();
        String mod6E= mod6.getText();
        String mod7E= mod7.getText();
        String mod8E= mod8.getText();
        String mod9E= mod9.getText();
        String mod10E= mod10.getText();

        int i1 = Integer.parseInt(mod1E);
        int i2 = Integer.parseInt(mod2E);
        int i3 = Integer.parseInt(mod3E);
        int i4 = Integer.parseInt(mod4E);
        int i5 = Integer.parseInt(mod5E);
        int i6 = Integer.parseInt(mod6E);
        int i7 = Integer.parseInt(mod7E);
        int i8 = Integer.parseInt(mod8E);
        int i9 = Integer.parseInt(mod9E);
        int i10 = Integer.parseInt(mod10E);

        try(Connection con = DriverManager.getConnection()){
            String sqlStatement = "INSERT INTO Marks Sheet(Name,Student Id,Module 1,Module 2,Module 3,Module 4, Module 5,Module 6,Module 7, Module 8, Module 9, Module 10) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sqlStatement);

            statement.setString(1, nameE);
            statement.setInt(2, i1);
            statement.setInt(3, i2);
            statement.setInt(4, i3);
            statement.setInt(5, i4);
            statement.setInt(6, i5);
            statement.setInt(7, i6);
            JOptionPane.showMessageDialog(null, "Results Added Successfully");
            statement.executeUpdate();
            clearReuslts();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
