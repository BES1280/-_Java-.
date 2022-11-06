package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        System.out.println("Hello KATA Academy!");
        System.out.println("My name is Ivan.");
        System.out.println("I want to become a java-developer!");
        System.out.println("    +"); // ЁЛКА
        System.out.println("   +++");
        System.out.println("  +++++");
        System.out.println(" +++++++");
        System.out.println("+++++++++");
        System.out.println("   +++");
        System.out.println("   +++");
        System.out.println((5+5)*10);
        int a = 10;
        int b = 20;
        int c = 5;
        System.out.println((a+b)*c);
        String s = "I want to become ";
        String x = "a java-developer!";
        System.out.println(s + x);
        int q = 15, w = 10;
        int e = q+w;
        System.out.println(e);
        int t = 9, y = 2;
        double u = t/(double)y ;
        System.out.println(u);
        int ost = 17 % 5;
        System.out.println(ost);
        int n = 31460, m = 56494;
        int h = n-m;
        int f = 2;
        System.out.println(h * f);
        int k = 2233, l = 4455 % 13;
        double o = k*(double)l;
        System.out.println(o);
    }

    public static void main(String[] args) {
        launch();
    }
}