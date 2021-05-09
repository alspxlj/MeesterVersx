package week5.les10.practicum8_3;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class BoekingenApp extends Application implements EventHandler<ActionEvent>{
	private Label gegevensLabel, naamLabel, adresLabel, aankomstLabel, vetrektLabel, kamerTypeLabel;
	private TextField naamTekstVeld, adresTekstVeld;
	private DatePicker adatumDatumPrikker, vdatumDatumPrikker;
//	private ComboBox<KamerType> kamertypeBox;
	private Button resetButton, boekButton;



	@Override
	public void start(Stage primaryStage) {
		FlowPane root = new FlowPane(10, 10);
		root.setPadding(new Insets(10));
		
		Label gegevensLabel = new Label("Voer uw gegevens in!");
		gegevensLabel.setPrefWidth(330);
		root.getChildren().add(gegevensLabel);

		Label naamLabel = new Label("Naam:");
		naamLabel.setPrefWidth(100);
		root.getChildren().add(naamLabel);
		
		TextField naamTekstVeld = new TextField();
		naamTekstVeld.setPrefWidth(230);
		root.getChildren().add(naamTekstVeld);
		
		Label adresLabel = new Label("Adres:");
		adresLabel.setPrefWidth(100);
		root.getChildren().add(adresLabel);
		
		TextField adrestTextVeld = new TextField();
		adrestTextVeld.setPrefWidth(230);
		root.getChildren().add(adrestTextVeld);

		Label aankomstLabel = new Label("Aankomstdatum:");
		aankomstLabel.setPrefWidth(100);
		root.getChildren().add(aankomstLabel);
		
		DatePicker adatumDatumPrikker = new DatePicker();
		adatumDatumPrikker.setPrefWidth(230);
		adatumDatumPrikker.setValue(LocalDate.now());
		root.getChildren().add(adatumDatumPrikker);
		
		Label vetrektLabel = new Label("Vertrektdatum:");
		vetrektLabel.setPrefWidth(100);
		root.getChildren().add(vetrektLabel);
		
		DatePicker vdatumDatumPrikker = new DatePicker();
		vdatumDatumPrikker.setPrefWidth(230);
		vdatumDatumPrikker.setValue(LocalDate.now().plusDays(1));
		root.getChildren().add(vdatumDatumPrikker);

		Label kamerTypeLabel = new Label("Kamertypen:");
		kamerTypeLabel.setPrefWidth(100);
		root.getChildren().add(kamerTypeLabel);
		
		ComboBox kamertypeBox = new ComboBox();
		kamertypeBox.setPrefWidth(230);
		root.getChildren().add(kamertypeBox);
		
		
		Button resetButton = new Button();
		resetButton.setText("Reset");
		resetButton.setOnAction(this); 
		root.getChildren().add(resetButton);

		Button boekButton = new Button();
		boekButton.setText("Boek");
		boekButton.setOnAction(this); 
		root.getChildren().add(boekButton);


		Scene scene = new Scene(root, 375, 275); 
		primaryStage.setTitle("Tweepersonsboekingen"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	public void handle(ActionEvent event) {
		System.out.println("Hello World!"); 
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}