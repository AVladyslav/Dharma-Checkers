package checkers.frontend.view;

import checkers.opencv.camera.Camera;
import checkers.opencv.utils.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class indexController {
	@FXML
	private ImageView currentFrame;
	@FXML
	private ImageView displayPhoto;
	@FXML
	private Button button1;

	private Camera camera;

	public Camera getCamera() {
		return this.camera;
	}

	public ImageView getCurrentFrame() {
		return currentFrame;
	}

	public indexController getController() {
		return this;
	}

	@FXML
	public void initialize() {
		System.out.println("start");
		camera = new Camera(currentFrame);
		camera.startCamera();

	}

	@FXML
	public void takePhoto(ActionEvent event) {
		Image imageToAnalysis = Utils.mat2Image(camera.getFrame()); // TO ZDJECIE BEDZIEMY OBRABIAC POTEM
		Utils.onFXThread(displayPhoto.imageProperty(), imageToAnalysis);

	}

}
