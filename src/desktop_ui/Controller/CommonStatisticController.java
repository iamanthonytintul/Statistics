package desktop_ui.Controller;

import desktop_ui.Main;
import desktop_ui.Module.Proxy.Proxy;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

/**
 * Created by Cappoocha on 16.06.2017.
 */
public class CommonStatisticController
{
    @FXML
    private ChoiceBox sites;

    public CommonStatisticController()
    {
    }

    @FXML
    private void initialize()
    {
        sites.setItems(Proxy.getAvailableSiteList());
        sites.setValue(sites.getItems().get(0));
    }

    @FXML
    private void setScene()
    {
        Main.setScene(Main.dailyStatistic);
    }
}
