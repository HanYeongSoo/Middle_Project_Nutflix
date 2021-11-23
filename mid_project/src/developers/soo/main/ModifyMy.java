package developers.soo.main;

import java.io.IOException;

import developers.soo.Controller.ModifyController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ModifyMy {
	public void ModifyMyPage() {
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/developers/soo/fxml/Modify.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		ModifyController ctl = loader.getController();
		ctl.setRoot(root);
		stage.getIcons().add(new Image("/developers/soo/style/nutflix.PNG"));	// 넷플릭스 아이콘 설정
		stage.setScene(scene);
		stage.show();
	}
}
