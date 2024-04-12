import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class GameScreen extends Pane{
    private TextField p1Name, p2Name;
    private Button start;
    public GameScreen() {

        p1Name = new TextField();
        p1Name.setPrefSize(110,30);
        p1Name.relocate(20, 10);

        p2Name = new TextField();
        p2Name.setPrefSize(110, 30);
        p2Name.relocate(20, 50);

        getChildren().addAll(p2Name, p1Name);
    }

    public TextField getP1Name() {
        return p1Name;
    }

    public TextField getP2Name() {
        return p2Name;
    }

    public Button getStart() {
        return start;
    }
}
