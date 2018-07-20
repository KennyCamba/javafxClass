/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterfazgrafica;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * 
 */
public class IterfazGrafica extends Application{
    
    @Override
    public void init() {
        System.out.println("Inicio");
    }
    
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        //VBox root2 = new VBox();
        HBox root3 = new HBox();
        StackPane root4 = new StackPane();
        Scene scene = new Scene(root3, 500, 300);
        stage.setScene(scene);
        stage.show();
        
        Button bt1 = new Button();
        bt1.setText("BT1");
        Button bt2 = new Button("BT2");
        Button bt3 = new Button("BT3");
        root3.getChildren().addAll(bt1, bt2, bt3);
        //root2.setAlignment(Pos.CENTER); 
//        root4.setSpacing(30); 
        root3.setAlignment(Pos.CENTER); 
        root3.setPadding(new Insets(20, 10, 20, 10)); 
        //root2.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        //root.getChildren().addAll(bt1, bt2, bt3);
//        bt1.setTranslateX(0);
//        bt2.setTranslateX(40); 
//        bt3.setTranslateX(50);
//        bt3.setTranslateY(100); 
        Label label = new Label("Nombre"); 
        Text text = new Text("Hola como estas\nSiguiente linea");
        text.setLineSpacing(3); 
        TextField cuadrodetext = new TextField();
        TextArea ta;
        ComboBox cb;
        root3.getChildren().addAll(label, text, cuadrodetext);
        Stage stage2 = new Stage();
        stage2.show();
    }
    
    @Override
    public void stop() {
        System.out.println("Fin del programa");
    }
   
    public static void main(String[] args) {
        launch(args);
    }
}
