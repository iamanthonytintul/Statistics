package desktop_ui.Module.Proxy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by Cappoocha on 16.06.2017.
 */

/**
 * Прокси класс для получения данных из REST API
 */
public class Proxy
{
    /**
     * Возвращает список с названиями доступных сайтов
     *
     * @return ObservableList
     */
    public static ObservableList<String> getAvailableSiteList()
    {
        return FXCollections.observableArrayList("Lenta.ru", "Vk.com");
    }

    /**
     * Вовзращает список с именами доступных личностей
     *
     * @return ObservableList
     */
    public static ObservableList<String> getAvailablePersonNameList()
    {
        return FXCollections.observableArrayList("Путин", "Медведев", "Навальный");
    }
}
