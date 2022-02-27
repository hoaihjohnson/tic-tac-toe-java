package tictactoe;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PersonVSBoot extends AnchorPane {
    
    protected final AnchorPane anchorPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button b3;
    protected final Button b6;
    protected final Button b2;
    protected final Button b1;
    protected final Button b5;
    protected final Button b8;
    protected final Button b9;
    protected final Button b4;
    protected final Button b7;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane anchorPane1;
    protected final ImageView imageView;
    protected final Label label;
    protected final Label label0;
    protected final Label playerXresult;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final ImageView imageView0;
    protected final Label label1;
    protected final Label label2;
    protected final Label computerYResult;
    protected final AnchorPane anchorPane4;
    protected final Button button;
    protected final ImageView imageView1;
    
    private int XWins = 0;
    private int OWins = 0;
    private int Draws = 0;
    private TicTacToeAI TTT;
    
    public PersonVSBoot(Stage stage) {
        TTT = new TicTacToeAI();
        TTT.NewGame();
        
        anchorPane = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        b3 = new Button();
        b6 = new Button();
        b2 = new Button();
        b1 = new Button();
        b5 = new Button();
        b8 = new Button();
        b9 = new Button();
        b4 = new Button();
        b7 = new Button();
        anchorPane0 = new AnchorPane();
        anchorPane1 = new AnchorPane();
        imageView = new ImageView();
        label = new Label();
        label0 = new Label();
        playerXresult = new Label();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        imageView0 = new ImageView();
        label1 = new Label();
        label2 = new Label();
        computerYResult = new Label();
        anchorPane4 = new AnchorPane();
        button = new Button();
        imageView1 = new ImageView();
      
        setId("AnchorPane");
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(1000.0);
        setStyle("-fx-background-color: #072A40;");

        anchorPane.setLayoutX(277.0);
        anchorPane.setLayoutY(101.0);
        anchorPane.setPrefHeight(375.0);
        anchorPane.setPrefWidth(463.0);

        gridPane.setHgap(10.0);
        gridPane.setPrefHeight(375.0);
        gridPane.setPrefWidth(458.0);
        gridPane.setVgap(10.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(b3, 2);
        
        b3.setMnemonicParsing(false);
        b3.setPrefHeight(95.0);
        b3.setPrefWidth(133.0);
        b3.setStyle("-fx-background-color: #1FA4E5; -fx-background-radius: 13;");
        b3.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        b3.setFont(new Font("Berlin Sans FB", 42.0));
        b3.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            int GO = TTT.isGameOver();
            if (TTT.Move(3, 1) && GO == 0) {
                System.out.println("YES");
                
                b3.setDisable(true);
                //P1.setForeground(pcolor);
                b3.setText("X");
                ComputerMove(-1,0);
                if ((GO = TTT.isGameOver()) != 0)
                    SetCounters(GO);
            }
        });
        
        GridPane.setColumnIndex(b6, 2);
        GridPane.setRowIndex(b6, 1);
        b6.setMnemonicParsing(false);
        b6.setPrefHeight(95.0);
        b6.setPrefWidth(133.0);
        b6.setStyle("-fx-background-color: #1FA4E5; -fx-background-radius: 13;");
        b6.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        b6.setFont(new Font("Berlin Sans FB", 42.0));
        b6.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            int GO = TTT.isGameOver();
            if (TTT.Move(6, 1) && GO == 0) {
                System.out.println("YES");
                b6.setDisable(true);
                //P1.setForeground(pcolor);
                b6.setText("X");
                ComputerMove(-1,0);
                if ((GO = TTT.isGameOver()) != 0)
                    SetCounters(GO);
            }
        });
        
        GridPane.setColumnIndex(b2, 1);
        b2.setMnemonicParsing(false);
        b2.setPrefHeight(95.0);
        b2.setPrefWidth(133.0);
        b2.setStyle("-fx-background-color: #1FA4E5; -fx-background-radius: 13;");
        b2.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        b2.setFont(new Font("Berlin Sans FB", 42.0));
        b2.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            int GO = TTT.isGameOver();
            if (TTT.Move(2, 1) && GO == 0) {
                System.out.println("YES");
                b2.setDisable(true);
                //P1.setForeground(pcolor);
                b2.setText("X");
                ComputerMove(-1,0);
                if ((GO = TTT.isGameOver()) != 0)
                    SetCounters(GO);
            }
        });
        
        b1.setMnemonicParsing(false);
        b1.setPrefHeight(95.0);
        b1.setPrefWidth(133.0);
        b1.setStyle("-fx-background-color: #1FA4E5; -fx-background-radius: 13;");
        b1.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        b1.setFont(new Font("Berlin Sans FB", 42.0));
        b1.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            int GO = TTT.isGameOver();
            if (TTT.Move(1, 1) && GO == 0) {
                System.out.println("YES");
                b1.setDisable(true);
                //P1.setForeground(pcolor);
                b1.setText("X");
                ComputerMove(-1,0);
                if ((GO = TTT.isGameOver()) != 0)
                    SetCounters(GO);
            }
        });
        
        GridPane.setColumnIndex(b5, 1);
        GridPane.setRowIndex(b5, 1);
        b5.setMnemonicParsing(false);
        b5.setPrefHeight(95.0);
        b5.setPrefWidth(133.0);
        b5.setStyle("-fx-background-color: #1FA4E5; -fx-background-radius: 13;");
        b5.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        b5.setFont(new Font("Berlin Sans FB", 42.0));
        b5.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            int GO = TTT.isGameOver();
            if (TTT.Move(5, 1) && GO == 0) {
                System.out.println("YES");
                b5.setDisable(true);
                //P1.setForeground(pcolor);
                b5.setText("X");
                ComputerMove(-1,0);
                if ((GO = TTT.isGameOver()) != 0)
                    SetCounters(GO);
            }
        });
        
        GridPane.setColumnIndex(b8, 1);
        GridPane.setRowIndex(b8, 2);
        b8.setMnemonicParsing(false);
        b8.setPrefHeight(95.0);
        b8.setPrefWidth(133.0);
        b8.setStyle("-fx-background-color: #1FA4E5; -fx-background-radius: 13;");
        b8.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        b8.setFont(new Font("Berlin Sans FB", 42.0));
        b8.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            int GO = TTT.isGameOver();
            if (TTT.Move(8, 1) && GO == 0) {
                System.out.println("YES");
                b8.setDisable(true);
                b8.setText("X");
                ComputerMove(-1,0);
                if ((GO = TTT.isGameOver()) != 0)
                    SetCounters(GO);
            }
        });
        
        GridPane.setColumnIndex(b9, 2);
        GridPane.setRowIndex(b9, 2);
        b9.setMnemonicParsing(false);
        b9.setPrefHeight(95.0);
        b9.setPrefWidth(133.0);
        b9.setStyle("-fx-background-color: #1FA4E5; -fx-background-radius: 13;");
        b9.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        b9.setFont(new Font("Berlin Sans FB", 42.0));
        b9.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            int GO = TTT.isGameOver();
            if (TTT.Move(9, 1) && GO == 0) {
                System.out.println("YES");
                b9.setDisable(true);
                //P1.setForeground(pcolor);
                b9.setText("X");
                ComputerMove(-1,0);
                if ((GO = TTT.isGameOver()) != 0)
                    SetCounters(GO);
            }
        });
        
        GridPane.setRowIndex(b4, 1);
        b4.setMnemonicParsing(false);
        b4.setPrefHeight(95.0);
        b4.setPrefWidth(133.0);
        b4.setStyle("-fx-background-color: #1FA4E5; -fx-background-radius: 13;");
        b4.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        b4.setFont(new Font("Berlin Sans FB", 42.0));
        b4.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            int GO = TTT.isGameOver();
            if (TTT.Move(4, 1) && GO == 0) {
                System.out.println("YES");
                b4.setDisable(true);
                b4.setText("X");
                ComputerMove(-1,0);
                if ((GO = TTT.isGameOver()) != 0)
                    SetCounters(GO);
            }
        });
        
        GridPane.setRowIndex(b7, 2);
        b7.setMnemonicParsing(false);
        b7.setPrefHeight(95.0);
        b7.setPrefWidth(133.0);
        b7.setStyle("-fx-background-color: #1FA4E5; -fx-background-radius: 13;");
        b7.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        b7.setFont(new Font("Berlin Sans FB", 42.0));
        b7.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            int GO = TTT.isGameOver();
            if (TTT.Move(7, 1) && GO == 0) {
                System.out.println("YES");
                b7.setDisable(true);
                b7.setText("X");
                ComputerMove(-1,0);
                if ((GO = TTT.isGameOver()) != 0)
                    SetCounters(GO);
            }
        });
        
        gridPane.setPadding(new Insets(10.0, 0.0, 10.0, 10.0));

        anchorPane0.setLayoutX(49.0);
        anchorPane0.setLayoutY(101.0);

        imageView.setFitHeight(142.0);
        imageView.setFitWidth(154.0);
        imageView.setLayoutX(9.0);
        imageView.setLayoutY(94.0);
        imageView.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
        imageView.setImage(new Image(getClass().getResourceAsStream("/tictactoe/Images/Gamer.png")));
       
        label.setLayoutX(144.0);
        label.setLayoutY(222.0);
        label.setText("X");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#CA2727"));
        label.setFont(new Font("Berlin Sans FB", 68.0));

        label0.setLayoutX(5.0);
        label0.setPrefHeight(75.0);
        label0.setPrefWidth(193.0);
        label0.setText("You");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
        label0.setFont(new Font("Berlin Sans FB", 36.0));

        playerXresult.setLayoutX(32.0);
        playerXresult.setLayoutY(297.0);
        playerXresult.setPrefHeight(54.0);
        playerXresult.setPrefWidth(109.0);
        playerXresult.setText("result1");
        playerXresult.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
        playerXresult.setFont(new Font("Berlin Sans FB", 36.0));

        anchorPane2.setLayoutX(763.0);
        anchorPane2.setLayoutY(104.0);

        anchorPane3.setPrefHeight(305.0);
        anchorPane3.setPrefWidth(196.0);

        imageView0.setFitHeight(142.0);
        imageView0.setFitWidth(154.0);
        imageView0.setLayoutX(9.0);
        imageView0.setLayoutY(94.0);
        imageView0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
        imageView0.setImage(new Image(getClass().getResourceAsStream("/tictactoe/Images/com.jpg")));

        label1.setLayoutX(144.0);
        label1.setLayoutY(222.0);
        label1.setText("O");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
        label1.setFont(new Font("Berlin Sans FB", 68.0));

        label2.setLayoutX(3.0);
        label2.setPrefHeight(64.0);
        label2.setPrefWidth(193.0);
        label2.setText("Computer");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
        label2.setFont(new Font("Berlin Sans FB", 36.0));

        computerYResult.setLayoutX(44.0);
        computerYResult.setLayoutY(294.0);
        computerYResult.setPrefHeight(54.0);
        computerYResult.setPrefWidth(109.0);
        computerYResult.setText("result2");
        computerYResult.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
     
       
        computerYResult.setFont(new Font("Berlin Sans FB", 36.0));

        anchorPane4.setLayoutX(29.0);
        anchorPane4.setLayoutY(501.0);

        button.setMnemonicParsing(false);
        button.setPrefHeight(75.0);
        button.setPrefWidth(185.0);
        button.setStyle("-fx-background-radius: 17;");
        button.setText("       Back");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#011317"));
        button.setFont(new Font("Berlin Sans FB", 33.0));

        imageView1.setFitHeight(54.0);
        imageView1.setFitWidth(62.0);
        imageView1.setLayoutX(13.0);
        imageView1.setLayoutY(11.0);
        imageView1.setOpacity(0.47);
        imageView1.setImage(new Image(getClass().getResourceAsStream("/tictactoe/Images/backbutton.jfif")));

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(b3);
        gridPane.getChildren().add(b6);
        gridPane.getChildren().add(b2);
        gridPane.getChildren().add(b1);
        gridPane.getChildren().add(b5);
        gridPane.getChildren().add(b8);
        gridPane.getChildren().add(b9);
        gridPane.getChildren().add(b4);
        gridPane.getChildren().add(b7);
        anchorPane.getChildren().add(gridPane);
        getChildren().add(anchorPane);
        anchorPane1.getChildren().add(imageView);
        anchorPane1.getChildren().add(label);
        anchorPane1.getChildren().add(label0);
        anchorPane0.getChildren().add(anchorPane1);
        anchorPane0.getChildren().add(playerXresult);
        getChildren().add(anchorPane0);
        anchorPane3.getChildren().add(imageView0);
        anchorPane3.getChildren().add(label1);
        anchorPane3.getChildren().add(label2);
        anchorPane2.getChildren().add(anchorPane3);
        anchorPane2.getChildren().add(computerYResult);
        getChildren().add(anchorPane2);
        anchorPane4.getChildren().add(button);
        anchorPane4.getChildren().add(imageView1);
        getChildren().add(anchorPane4);

    }
       public void SetCounters(int Num) {
		switch (Num) {
		case 1:
			XWins++;
                        break;
		case -1:
                        OWins++;
			break;
		case 2:
			Draws++;
			break;
		case 0:
			XWins = 0;
			OWins = 0;
			Draws = 0;
			break;
		}
	        System.out.println(XWins + "");
		System.out.println(OWins + "");
		System.out.println(Draws + "");
	}
        private void ComputerMove(int player,int move) {
		if (move==0) 
			move = TTT.isGameOver() == 0 ? TTT.GenerateMove(player) : 0;
		String PText = (player == -1) ? "O" : "X";

		switch (move) {
		case 1:
                        b1.setDisable(true);
                         b1.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
			b1.setText(PText);
			TTT.Move(move, player);
			break;
		case 2:
			b2.setDisable(true);
			 b2.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
			b2.setText(PText);
			TTT.Move(move, player);
			break;
		case 3:
			b3.setDisable(true);
			 b3.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
			b3.setText(PText);
			TTT.Move(move, player);
			break;
		case 4:
			b4.setDisable(true);
			b4.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
			b4.setText(PText);
			TTT.Move(move, player);
			break;
		case 5:
			b5.setDisable(true);
			b5.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
			b5.setText(PText);
			TTT.Move(move, player);
			break;
		case 6:
			b6.setDisable(true);
			b6.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
			b6.setText(PText);
			TTT.Move(move, player);
			break;
		case 7:
			b7.setDisable(true);
			b7.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
			b7.setText(PText);
			TTT.Move(move, player);
			break;
		case 8:
			b8.setDisable(true);
                        b8.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
			b8.setText(PText);
			TTT.Move(move, player);
			break;
		case 9:
			b9.setDisable(true);
		        b9.setTextFill(javafx.scene.paint.Color.valueOf("#edf1f2"));
			b9.setText(PText);
			TTT.Move(move, player);
			break;
		}

	}
}
