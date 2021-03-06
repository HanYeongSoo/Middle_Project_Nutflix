package developers.soo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import db.DBService;
import db.dbCommon;
import developers.soo.main.RegisterMem;
import developers.soo.service.Member;
import developers.soo.service.MemberImpl;
import dto.MemberDTO;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MemController implements Initializable {
	DBService dbservice;
	MemberDTO memdto;
	Member mb;
	ImageView fxImageView;

	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
		fxImageView = (ImageView)root.lookup("#fxImageView");
		fxImageView.setImage(new Image("/image/nutflix.png"));
		mb.setRoot(root);
		mb.setCheckbox();
	}

	public void onSave() {
		mb.MemInput();
	}
	
	public void onClose() {
		mb.setClose();
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		dbCommon.setDBConnection();
		mb = new MemberImpl();
	}

}
