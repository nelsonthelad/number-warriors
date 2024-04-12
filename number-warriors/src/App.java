import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class App extends Application {

    public void start(Stage primaryStage) {
        Game game = new Game();

        StartScreen startScreen = new StartScreen();
        GameScreen gameScreen = new GameScreen();
        primaryStage.setTitle("Number Warriors");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(startScreen, 700, 400));
        primaryStage.show();

        startScreen.getStart().setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                game.innit(startScreen.getP1Name().getText(), 10, 2, startScreen.getP2Name().getText(), 10, 2);
                primaryStage.setScene(new Scene(gameScreen, 1000, 600));
            }
        });
    }
}