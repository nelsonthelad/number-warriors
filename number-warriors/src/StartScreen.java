import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class StartScreen extends Pane{
    private TextField p1Name, p2Name;
    private Button start;
    public StartScreen() {

        p1Name = new TextField();
        p1Name.setPrefSize(150,30);
        p1Name.relocate(50, 320);

        p2Name = new TextField();
        p2Name.setPrefSize(150, 30);
        p2Name.relocate(500, 320);

        start = new Button("Start");
        start.setPrefSize(150,50);
        start.relocate(275,300);

        Label p1PlayerNameLabel = new Label("Player 1 Name");
        p1PlayerNameLabel.relocate(70, 295);

        Label p2PlayerNameLabel = new Label("Player 2 Name");
        p2PlayerNameLabel.relocate(520, 295);

        Label title = new Label("Number Warriors");
        title.relocate(140, 20);

        Image background = new Image("file:assets/background.png");
        ImageView backgroundView = new ImageView(background);
        backgroundView.setFitWidth(700);
        backgroundView.setFitHeight(400);

        Image player1 = new Image("file:assets/player1.png");
        ImageView player1View = new ImageView(player1);
        player1View.setFitHeight(150);
        player1View.setFitWidth(150);
        player1View.relocate(30, 130);

        Image player2 = new Image("file:assets/player2.png");
        ImageView player2View = new ImageView(player2);
        player2View.setFitHeight(150);
        player2View.setFitWidth(150);
        player2View.relocate(500, 130);

        //Styles

        title.setFont(Font.font("Minecraft", FontWeight.BOLD, 50));
        title.setTextFill(Color.BLACK);

        start.setStyle("-fx-background-color: black; -fx-background-radius: 50px; -fx-text-fill: white; -fx-border-color: white; " + "-fx-border-width: 2px; -fx-border-radius: 50px; -fx-font-family: 'Minecraft'; -fx-font-size: 30px;");

        p2PlayerNameLabel.setFont(Font.font("Minecraft", FontWeight.BOLD, 16));
        p2PlayerNameLabel.setTextFill(Color.BLACK);

        p1PlayerNameLabel.setFont(Font.font("Minecraft", FontWeight.BOLD, 16));
        p1PlayerNameLabel.setTextFill(Color.BLACK);

        p1Name.setStyle("-fx-background-color: black; -fx-background-radius: 50px; -fx-text-fill: white; -fx-border-color: white; -fx-border-width: 2px; -fx-border-radius: 50px; -fx-font-family: 'Minecraft'; -fx-font-size: 20px;");
        p2Name.setStyle("-fx-background-color: black; -fx-background-radius: 50px; -fx-text-fill: white; -fx-border-color: white; -fx-border-width: 2px; -fx-border-radius: 50px; -fx-font-family: 'Minecraft'; -fx-font-size: 20px;");

        //Adding items to pane
        getChildren().addAll(backgroundView, player2View, player1View, p1Name, p2Name, start, title, p1PlayerNameLabel, p2PlayerNameLabel);
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
