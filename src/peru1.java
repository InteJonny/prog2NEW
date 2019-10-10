import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class peru extends Application{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Creating recangles
        Rectangle rectangleLeft = new Rectangle();
        Rectangle rectangleRight = new Rectangle();

        //LEFT RECTANGEL size and position
        rectangleLeft.setX(0);
        rectangleLeft.setY(0);
        rectangleLeft.setWidth(210);
        rectangleLeft.setHeight(300);
        //RIGHT RECTANGEL  size and position
        rectangleRight.setX(390);
        rectangleRight.setY(0);
        rectangleRight.setWidth(210);
        rectangleRight.setHeight(300);
        //setting color to rectangles
        rectangleLeft.setFill(Color.RED);
        rectangleRight.setFill(Color.RED);

        //SÄTTER IHOP DOM
        Group root = new Group(rectangleLeft, rectangleRight);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);
        scene.setFill(Color.WHITE);
        //Setting title to the Stage
        primaryStage.setTitle("Drawing a Rectangle");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

}