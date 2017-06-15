/**
 * Created by Cappoocha on 15.06.2017.
 */

package desktop_ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application
{
    private static Stage stage;
    public static Scene commonStatistic, dailyStatistic;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();

        stage = primaryStage;
        primaryStage.setTitle("Statistic");

        commonStatistic = new Scene(FXMLLoader.load(getClass().getResource("View/CommonStatistic.fxml")));
        dailyStatistic = new Scene(FXMLLoader.load(getClass().getResource("View/DailyStatistic.fxml")));
        primaryStage.setScene(commonStatistic);
        primaryStage.show();
    }

    public static void setScene(Scene scene)
    {
        stage.setScene(scene);
    }
}
