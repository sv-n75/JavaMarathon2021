package day19.task3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Neil Alishev
 */

public class DisplayTaxiMap extends Application {
    private static final int FIELD_SIZE = 100;
    private static final double SCENE_WIDTH = 1000;
    private static final double SCENE_HEIGHT = 1000;
    private static final double gridWidth = SCENE_WIDTH / FIELD_SIZE;
    private static final double gridHeight = SCENE_HEIGHT / FIELD_SIZE;

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Set<Point> taxiCars = loadTaxiCars();

        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                MyCell node;
                Point currentCar = new Point(i, j);

                if (taxiCars.contains(currentCar))
                    node = new MyCell(i * gridWidth, j * gridHeight, gridWidth, gridHeight, "red");
                else
                    node = new MyCell(i * gridWidth, j * gridHeight, gridWidth, gridHeight, "blue");

                root.getChildren().add(node);
            }
        }

        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Set<Point> loadTaxiCars() {
        Set<Point> taxiCars = new HashSet<>();

        try {
            File file = new File("src/main/resources/taxi_cars.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                int[] taxiCar = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                taxiCars.add(new Point(taxiCar[1], taxiCar[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return taxiCars;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static class MyCell extends StackPane {
        public MyCell(double x, double y, double width, double height, String color) {
            Rectangle rectangle = new Rectangle(width, height);
            rectangle.setStroke(Color.BLACK);

            if (color.equals("blue"))
                rectangle.setFill(Color.LIGHTBLUE);
            else
                rectangle.setFill(Color.RED);

            setTranslateX(x);
            setTranslateY(y);

            getChildren().add(rectangle);
        }
    }

}