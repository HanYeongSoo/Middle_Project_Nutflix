package developers.soo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import developers.soo.main.MainClass;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FirstPageController implements Initializable {
	MainClass ms;
	ImageView fxImageView;
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
		fxImageView = (ImageView)root.lookup("#fxImageView");
		fxImageView.setImage(new Image("/image/nutflix.png"));
		ms.setRoot(root);
	}
	
	public void onLogin() {
		System.out.println("하이");
		ms.mainClass();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ms = new MainClass();
	}

}
