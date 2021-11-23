package developers.soo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import db.dbCommon;
import developers.soo.main.ModifyMy;
import developers.soo.service.Mypage;
import developers.soo.service.MypageImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MyPageController implements Initializable {
	Mypage mp;
	dbCommon dbCommon;
	ModifyMy mm;
	ImageView fxImageView;
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
		fxImageView = (ImageView)root.lookup("#fxImageView");
		fxImageView.setImage(new Image("/image/nutflix.png"));
		mp.setRoot(root);
	}
	
	public void onClose() {
		mp.setClose();
	}
	
	public void onModify() {
		mp.setModify();
	}
	
	public void onView() {
		mp.setView();
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mp = new MypageImpl();
		dbCommon.setDBConnection();
	}

}
