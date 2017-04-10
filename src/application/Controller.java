package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class Controller {
   testDB db = new testDB();

    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnLogin;
    @FXML
    private Label lblStatus;




    public void loginAuthentication(ActionEvent event) throws IOException {
        String usernameE = txtUsername.getText();
        String passwordE = txtPassword.getText();




        try(Connection con = DriverManager.getConnection(db.db_URL,db.db_Username,db.db_Password)){

            String sqlStatement = "SELECT * FROM Login WHERE Username=? and Password=?";
            PreparedStatement statement = con.prepareStatement(sqlStatement);

            statement.setString(1, usernameE);
            statement.setString(2, passwordE);

            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                //JOptionPane.showMessageDialog(null," Access Granted ");
                lblStatus.setText(" Login Successful ! ");
                txtUsername.setText("");
                txtPassword.setText("");
                Stage stage= new Stage();

                stage.setTitle("Results sheet");
                Pane mypane=null;
                mypane = FXMLLoader.load(getClass().getResource("resultsheet.fxml"));
                Scene scene = new Scene(mypane);
                stage.setScene(scene);

                stage.show();
            }else{
                //JOptionPane.showMessageDialog(null, " Invalid Username or Password ");
                lblStatus.setText(" Login Unsuccessful ! ");
            }


       con.close();

        }catch (SQLException e){
            System.out.println(e);

        }


    }


}
