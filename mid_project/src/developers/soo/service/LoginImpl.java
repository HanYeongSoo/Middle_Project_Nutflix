package developers.soo.service;

import java.io.IOException;

import developers.eb.mainMovie.MainController;
import developers.eb.mainMovie.MainMovie;
import developers.soo.Controller.MyPageController;
import developers.soo.db.DBService;
import developers.soo.db.DBServiceImpl;
import developers.soo.main.MyPageMain;
import dto.MemberDTO;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LoginImpl implements Login {
	MemberDTO memdto;
	DBService ds;
	MyPageMain mpm = new MyPageMain();
	MainMovie mm = new MainMovie();
	static String id;
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
		mm.setRoot(root);
	}
	
	public LoginImpl() {
		ds = new DBServiceImpl();
	}
	

	@Override
	public void login() {
//		memdto = new MemberDTO();
		System.out.println("로그인 버튼 클릭 시 떠야함");
		
		TextField id = (TextField)root.lookup("#fxId");
		PasswordField pwd = (PasswordField)root.lookup("#fxPwd");
		
		// 잘 되는지 확인
		System.out.println("id : " + id.getText());
		System.out.println("pwd : " + pwd.getText());
		
		
		MemberDTO memdto = ds.loginCheck(id.getText());
		if (memdto != null) {
			if (memdto.getId().equals(id.getText()) && memdto.getPassword().equals(pwd.getText())) {
//			Alert alert = new Alert(AlertType.INFORMATION);
//			alert.setContentText("인증 성공");
//			alert.show();
			
//			mpm.myPage();
				
				Stage stage = new Stage();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/developers/soo/fxml/MyPage.fxml"));
				Parent root = null;
				try {
					root = loader.load();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Scene scene = new Scene(root);
				MyPageController ctl = loader.getController();
				ctl.setRoot(root);
				stage.getIcons().add(new Image("/developers/soo/style/nutflix.PNG"));	// 넷플릭스 아이콘 설정
				stage.setScene(scene);
				stage.show();	
				

				
				MemberDTO dto = ds.idCheck(id.getText());
				Label fxId2 = (Label)root.lookup("#fxId2");
				fxId2.setText(dto.getId());
				
			
//				MainMovie mm = new MainMovie();
//				this.id =id.getText();
//				mm.start();
				
				
			} else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText("아이디와 비밀번호를 확인해 주세요.");
				alert.show();
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("해당하는 아이디나 비밀번호가 존재하지 않습니다.");
			alert.show();
		}
	}
}
