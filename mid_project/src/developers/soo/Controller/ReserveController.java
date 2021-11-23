package developers.soo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import db.dbCommon;
import developers.soo.service.ReserveImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ReserveController implements Initializable {
	ReserveImpl ri;
	ImageView fxImageView;
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
		fxImageView = (ImageView)root.lookup("#fxImageView");
		fxImageView.setImage(new Image("/image/nutflix.png"));
		ri.setRoot(root);
	}
	
	public void showInfo() {
		ri.showInfo();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		dbCommon.setDBConnection();
		ri = new ReserveImpl();
	}

}
