package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MinimalistWebViewApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a WebView
        WebView webView = new WebView();

        // Load a web page
        webView.getEngine().load("http://www.google.com");

        // Create a StackPane and add the WebView to it
        StackPane root = new StackPane();
        root.getChildren().add(webView);

        // Create a Scene with the StackPane as its root node
        Scene scene = new Scene(root, 800, 600); // Width and height of the window

        // Configure the Stage
        primaryStage.setTitle("Minimalist WebView App");
        primaryStage.setScene(scene);

        // Show the Stage (window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}