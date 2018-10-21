import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Собери подарок!");
        primaryStage.setScene(new Scene(root, 410, 310));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
        //В нашем случае можно было бы обойтись одним классом для конфет, а не создавать 3 отдельных
        //Можно было бы сделать второе окно, в котором при запуске программы заполняются параметры сладостей
        //Сделал бы это через сеттеры, но усложнение конструкции особо не повлияет на работу программы,
        //но для этого придется делать второе окно для заполнения параметров у конфеток, 3 коллекции для хранения
        //различных объектов конфеток с разными параметрами и тд. Решил так сильно не усложнять :)
    }
}
