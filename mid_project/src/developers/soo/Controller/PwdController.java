package developers.soo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import db.dbCommon;
import developers.soo.service.Member;
import developers.soo.service.MemberImpl;
import developers.soo.service.PwdSearch;
import developers.soo.service.PwdSearchImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PwdController implements Initializable {
	PwdSearch ps;
	Member mb;
	ImageView fxImageView;
	
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
		fxImageView = (ImageView)root.lookup("#fxImageView");
		fxImageView.setImage(new Image("/image/nutflix.png"));
		ps.setRoot(root);
		ps.setCombo();
	}
	
	public void onClick() {
		ps.setPwd();
	}
	
	public void onClose() {
		ps.setClose();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		dbCommon.setDBConnection();
		ps = new PwdSearchImpl();
		
	}

}
