package developers.soo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import db.dbCommon;
import developers.soo.service.ModifyImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ModifyController implements Initializable {
	ModifyImpl modi;
	ImageView fxImageView;
	
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
		fxImageView = (ImageView)root.lookup("#fxImageView");
		fxImageView.setImage(new Image("/image/nutflix.png"));
		modi.setRoot(root);
	}
	
	public void onModify() {
		fxImageView = (ImageView)root.lookup("#fxImageView");
		fxImageView.setImage(new Image("/image/nutflix.png"));
		modi.modify();
	}

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		dbCommon.setDBConnection();
		modi = new ModifyImpl();
	}

}
