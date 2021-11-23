package developers.soo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import db.DBService;
import db.dbCommon;
import developers.soo.service.Login;
import developers.soo.service.LoginImpl;
import dto.MemberDTO;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LoginController implements Initializable {
	DBService dbservice;
	MemberDTO memdto;
	Login login;
	ImageView fxImageView;

	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
		fxImageView = (ImageView)root.lookup("#fxImageView");
		fxImageView.setImage(new Image("/image/nutflix.png"));
		login.setRoot(root);
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		dbCommon.setDBConnection();
		login = new LoginImpl();
	}

}
