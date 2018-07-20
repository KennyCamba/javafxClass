/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * 
 */
public class ExamApp extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Scene scene = new Scene(crearInterfaz());
        Scene scene = new Scene(votacionDiputados());
        stage.setScene(scene); 
        stage.setTitle("Votación de Diputados"); 
        stage.show();
    }
    
    private Pane votacionDiputados() {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(15);
        Text text = new Text("Escoja 2 candiadatos");
        text.setFont(Font.font(text.getFont().getFamily(), FontWeight.BOLD, 14)); 
        root.getChildren().add(text);
        GridPane grid = new GridPane();
        Button cod1 = new Button("Cod1");
        Button cod2 = new Button("Cod2");
        Button cod3 = new Button("Cod3");
        Button cod4 = new Button("Cod4");
        grid.add(cod1, 0, 0); 
        grid.add(cod2, 0, 1);
        grid.addColumn(1, new Label("Juan Peña"), new Label("Pedro Marmol"));
        grid.add(cod3, 2, 0); 
        grid.add(cod4, 2, 1); //nodo, columna, fila
        grid.addColumn(3, new Label("José Pérez"), new Label("Manuel García"));
        root.getChildren().add(grid);
        grid.setVgap(15);
        grid.setHgap(15); 
        grid.setAlignment(Pos.CENTER); 
        root.setPadding(new Insets(15, 15, 15, 15)); //añade un margen
        Button votar = new Button("Votar");
        root.getChildren().add(votar);
        return root;
    }
    
    private Pane crearInterfaz() {
        VBox root = new VBox();
        Label label = new Label("Procesando");
        Button empezar = new Button("Empezar");
        Button salir = new Button("Salir");
        HBox botones = new HBox(10, empezar, salir);
        //botones.getChildren().addAll(empezar, salir);
        //botones.setSpacing(10); 
        root.getChildren().addAll(label, botones);
        root.setSpacing(15);
        
        TextArea ta = new TextArea();
        TextArea ta2 = new TextArea();
        ta.setMaxWidth(150);
        ta2.setMaxWidth(150);
        HBox textos = new HBox(10, ta, ta2);
        root.getChildren().add(textos);
        
        empezar.setOnAction(e ->{
            ta.setText(ta.getText() + "\n" + "Hola"); 
            ta2.setText(ta2.getText() + "\n" + "Adios"); 
        }); 
        
        salir.setOnAction(e -> {
            Platform.exit();
        }); 
        return root;
    }
    
}
