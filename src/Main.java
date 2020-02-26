import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) {
        initStage(mainStage);
        mainStage.show();
    }

    private void initStage(Stage mainStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 860, 640);

        Canvas canvas = new Canvas(860,640);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(75,75,100,100);
        root.getChildren().add(canvas);

        mainStage.setTitle("A* Pathfinding");
        mainStage.setScene(scene);
    }
}
