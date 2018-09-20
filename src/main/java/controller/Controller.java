package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.StageStyle;
import model.*;

public class Controller implements Initializable{
	
	Game game = new Game(new Player("agv19x", "PC", 30, new Gun("Pickaxe", 0)));
	 
    @FXML
    private Button button25;

    @FXML
    private Button button24;

    @FXML
    private Label platformtxt;

    @FXML
    private Button button27;

    @FXML
    private Button button26;

    @FXML
    private TitledPane nintendoTable;

    @FXML
    private Button button21;

    @FXML
    private Button button20;

    @FXML
    private Button button23;

    @FXML
    private Button button22;

    @FXML
    private Label bulletsTxt;

    @FXML
    private Button addPlayerBut;

    @FXML
    private TitledPane iPhoneTable;

    @FXML
    private Button button28;

    @FXML
    private ListView<String> gunsList;

    @FXML
    private TableView<Player> pcTable3;

    @FXML
    private Label gunName;

    @FXML
    private TableView<Player> pcTable4;

    @FXML
    private TableView<Player> pcTable5;

    @FXML
    private Label numBullets;

    @FXML
    private Button ButtonAddGun;

    @FXML
    private Label pingtxt;

    @FXML
    private TextField platformArea;

    @FXML
    private TableView<Player> pcTable1;

    @FXML
    private TableView<Player> pcTable2;

    @FXML
    private Button button14;

    @FXML
    private Button button4;

    @FXML
    private Button button13;

    @FXML
    private Button button5;

    @FXML
    private Button button16;

    @FXML
    private Button button2;

    @FXML
    private Button button15;

    @FXML
    private Button button3;

    @FXML
    private Button button8;

    @FXML
    private Button button10;

    @FXML
    private Button button9;

    @FXML
    private Button button12;

    @FXML
    private Button button6;

    @FXML
    private Button button11;

    @FXML
    private Button button7;

    @FXML
    private Button button18;

    @FXML
    private Button button17;

    @FXML
    private Button button19;

    @FXML
    private TableColumn<Player, String> pcC4;

    @FXML
    private TableColumn<Player, String> pcC5;

    @FXML
    private TableColumn<Player, String> pcC1;

    @FXML
    private TableColumn<Player, String> pcC2;

    @FXML
    private TableColumn<Player, String> pcC3;

    @FXML
    private TableColumn<Player, String> playC5;

    @FXML
    private TableColumn<Player, String> xboxC4;

    @FXML
    private TableColumn<Player, String> playC3;

    @FXML
    private TableColumn<Player, String> xboxC5;

    @FXML
    private TableColumn<Player, String> playC4;

    @FXML
    private TableColumn<Player, String> xboxC2;

    @FXML
    private TableColumn<Player, String> playC1;

    @FXML
    private TableColumn<Player, String> xboxC3;

    @FXML
    private TableColumn<Player, String> playC2;

    @FXML
    private TableColumn<Player, String> xboxC1;

    @FXML
    private Label gunImage;

    @FXML
    private Button shootButton;

    @FXML
    private TitledPane psTable;

    @FXML
    private TableView<Player> xboxTable4;

    @FXML
    private TableView<Player> xboxTable3;

    @FXML
    private TableView<Player> xboxTable5;

    @FXML
    private TableView<Player> nintTable1;

    @FXML
    private TableView<Player> nintTable2;

    @FXML
    private TableView<Player> nintTable3;

    @FXML
    private TableView<Player> nintTable4;

    @FXML
    private TableView<Player> nintTable5;

    @FXML
    private Button button1;

    @FXML
    private TableView<Player> xboxTable2;

    @FXML
    private TableView<Player> xboxTable1;

    @FXML
    private TableColumn<Player, String> nintC2;

    @FXML
    private TableColumn<Player, String> nintC3;

    @FXML
    private TableColumn<Player, String> nintC4;

    @FXML
    private TableColumn<Player, String> nintC5;

    @FXML
    private TableColumn<Player, String> iphoneC3;

    @FXML
    private TableColumn<Player, String> iphoneC2;

    @FXML
    private TableColumn<Player, String> iphoneC5;

    @FXML
    private TableColumn<Player, String> iphoneC4;

    @FXML
    private TextField userArea;

    @FXML
    private TextField pingArea;

    @FXML
    private TableColumn<Player, String> iphoneC1;

    @FXML
    private TableView<Player> iphoneTable5;

    @FXML
    private TableView<Player> iphoneTable4;

    @FXML
    private TableView<Player> iphoneTable3;

    @FXML
    private TableView<Player> iphoneTable2;

    @FXML
    private TableView<Player> playTable1;

    @FXML
    private TableView<Player> iphoneTable1;

    @FXML
    private Label gunTxt;

    @FXML
    private TableView<Player> playTable2;

    @FXML
    private TableView<Player> playTable3;

    @FXML
    private TableView<Player> playTable4;

    @FXML
    private TableView<Player> playTable5;

    @FXML
    private Label usertxt;

    @FXML
    private TableColumn<Player, String> nintC1;

    @FXML
    void butAddPlayer(ActionEvent event) {
        
        String user = userArea.getText();
        String platform = platformArea.getText();
        int ping =Integer.parseInt((pingArea.getText()));
        Player player = new Player(user, platform, ping, new Gun("Pickaxe", 0));
        game.addPlayer(player);
        int position = game.position(player);
        
        if(player.getPlatform().equalsIgnoreCase("PC")) {
			
        	if(position == 0) {
        		pcTable1.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "PC") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "PC");
            		
            		pcTable1.getItems().clear();
  		
            	}
        		
        	}else if(position == 1) {
        		
        		pcTable2.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "PC") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "PC");
            		
            		pcTable2.getItems().clear();
            		
        	}
        	}
        		else if(position == 2) {
        	
        		pcTable3.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "PC") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "PC");
            		
            		pcTable3.getItems().clear();
        		}
        		
        	}else if(position == 3) {
        		pcTable4.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "PC") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "PC");
            		
            		pcTable4.getItems().clear();
        		}
	
        	}else if(position == 4) {
        		pcTable5.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "PC") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "PC");
            		
            		pcTable5.getItems().clear();
            		
        		}
        	}
		
        	}
        
        	else if(player.getPlatform().equalsIgnoreCase("Xbox")) {
			
			if(position == 0) {

        		xboxTable1.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Xbox") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Xbox");
            		
            		xboxTable1.getItems().clear();
  		
            	}
        		
        	}else if(position == 1) {
        		
        		xboxTable2.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Xbox") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Xbox");
            		
            		xboxTable2.getItems().clear();
  		
            	}
        		
        	}else if(position == 2) {
        		
        		xboxTable3.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Xbox") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Xbox");
            		
            		xboxTable3.getItems().clear();
  		
            	}
        	}else if(position == 3) {
        		
        		xboxTable4.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Xbox") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Xbox");
            		
            		xboxTable4.getItems().clear();
  		
            	}
        		
        	}else if(position == 4) {
        		
        		xboxTable5.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Xbox") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Xbox");
            		
            		xboxTable5.getItems().clear();
  		
            	}
        		
        	}
			
			
		}else if(player.getPlatform().equalsIgnoreCase("Playstation")) {
			
			if(position == 0) {
        		playTable1.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Playstation") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Playstation");
            		
            		playTable1.getItems().clear();
  		
            	}
        		
        	}else if(position == 1) {
        		playTable2.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Playstation") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Playstation");
            		
            		playTable2.getItems().clear();
  		
            	}
        		
        	}else if(position == 2) {
        		
        		playTable3.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Playstation") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Playstation");
            		
            		playTable3.getItems().clear();
  		
            	}
        		
        	}else if(position == 3) {
        		
        		playTable4.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Playstation") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Playstation");
            		
            		playTable4.getItems().clear();
  		
            	}
        		
        	}else if(position == 4) {
        		playTable5.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Playstation") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Playstation");
            		
            		playTable5.getItems().clear();
  		
            	}
        	}
			
			
		}else if(player.getPlatform().equalsIgnoreCase("Nintendo")) {
			
			if(position == 0) {
				
        		nintTable1.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Nintendo") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Nintendo");
            		
            		nintTable1.getItems().clear();
  		
            	}
        	}else if(position == 1) {
        		
        		nintTable2.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Nintendo") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Nintendo");
            		
            		nintTable2.getItems().clear();
  		
            	}
        	}else if(position == 2) {
        		
        		nintTable3.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Nintendo") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Nintendo");
            		
            		nintTable3.getItems().clear();
  		
            	}

        	}else if(position == 3) {
        		nintTable4.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Nintendo") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Nintendo");
            		
            		nintTable4.getItems().clear();
  		
            	}
        	}else if(position == 4) {
        		nintTable5.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "Nintendo") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "Nintendo");
            		
            		nintTable5.getItems().clear();
  		
            	}
        	}
			
		}else if(player.getPlatform().equalsIgnoreCase("iPhone")) {
			
			if(position == 0) {
        		iphoneTable1.getItems().addAll(player);
        		
        			if(game.QueueFull(position, "iPhone") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "iPhone");
            		
            		iphoneTable1.getItems().clear();
  		
            	}
        	}else if(position == 1) {
        		iphoneTable2.getItems().addAll(player);
        		
        		if(game.QueueFull(position, "iPhone") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "iPhone");
            		
            		iphoneTable2.getItems().clear();
  		
            	}
        	}else if(position == 2) {
        		iphoneTable3.getItems().addAll(player);
        		if(game.QueueFull(position, "iPhone") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "iPhone");
            		
            		iphoneTable3.getItems().clear();
  		
            	}
        	}else if(position == 3) {
        		iphoneTable4.getItems().addAll(player);
        		if(game.QueueFull(position, "iPhone") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "iPhone");
            		
            		iphoneTable4.getItems().clear();
  		
            	}
        	}else if(position == 4) {
        		iphoneTable5.getItems().addAll(player);
        		if(game.QueueFull(position, "iPhone") == true) {
            		
            		Alert dialogue = new Alert(AlertType.INFORMATION);
            		dialogue.setTitle("Cola llena");
            		dialogue.setHeaderText(null);
            		dialogue.setContentText("Cola lista para entrar a partida");
            		dialogue.initStyle(StageStyle.UTILITY);
            		dialogue.showAndWait();
            		game.removeQueue(position, "iPhone");
            		
            		iphoneTable5.getItems().clear();
  		
            	}
        	}
			
		}
        

    }

       @FXML
    void but28(ActionEvent event) {
        
        URL route28 = getClass().getResource("/data/guns/28b.png");
        Image imageGun28 = new Image(route28.toString());
        gunImage.setGraphic(new ImageView(imageGun28));
        gunName.setText("Stink bomb");

    }

    @FXML
    void but27(ActionEvent event) {
        
        URL route27 = getClass().getResource("/data/guns/27b.png");
        Image imageGun27 = new Image(route27.toString());
        gunImage.setGraphic(new ImageView(imageGun27));
        gunName.setText("Remote explosives");

    }

    @FXML
    void but24(ActionEvent event) {
        
        URL route24 = getClass().getResource("/data/guns/24b.png");
        Image imageGun24 = new Image(route24.toString());
        gunImage.setGraphic(new ImageView(imageGun24));
        gunName.setText("Compact SMG");

    }

    @FXML
    void but25(ActionEvent event) {
        
        URL route25 = getClass().getResource("/data/guns/25b.png");
        Image imageGun25 = new Image(route25.toString());
        gunImage.setGraphic(new ImageView(imageGun25));
        gunName.setText("Grenade");

    }

    @FXML
    void but26(ActionEvent event) {
        
        URL route26 = getClass().getResource("/data/guns/26b.png");
        Image imageGun26 = new Image(route26.toString());
        gunImage.setGraphic(new ImageView(imageGun26));
        gunName.setText("Clinger");

    }

    @FXML
    void but22(ActionEvent event) {
        
        URL route22 = getClass().getResource("/data/guns/22b.png");
        Image imageGun22 = new Image(route22.toString());
        gunImage.setGraphic(new ImageView(imageGun22));
        gunName.setText("Grenade launcher");

    }

    @FXML
    void but23(ActionEvent event) {
        
        URL route23 = getClass().getResource("/data/guns/23b.png");
        Image imageGun23 = new Image(route23.toString());
        gunImage.setGraphic(new ImageView(imageGun23));
        gunName.setText("Guided missile");

    }

    @FXML
    void but15(ActionEvent event) {
        
        URL route15 = getClass().getResource("/data/guns/15b.png");
        Image imageGun15 = new Image(route15.toString());
        gunImage.setGraphic(new ImageView(imageGun15));
        gunName.setText("Pump shotgun");

    }

    @FXML
    void but20(ActionEvent event) {
        
        URL route20 = getClass().getResource("/data/guns/20b.png");
        Image imageGun20 = new Image(route20.toString());
        gunImage.setGraphic(new ImageView(imageGun20));
        gunName.setText("Hunting rifle");

    }

    @FXML
    void but19(ActionEvent event) {
        
        URL route19 = getClass().getResource("/data/guns/19b.png");
        Image imageGun19 = new Image(route19.toString());
        gunImage.setGraphic(new ImageView(imageGun19));
        gunName.setText("Semi-auto sniper rifle");

    }

    @FXML
    void but18(ActionEvent event) {
        
        URL route18 = getClass().getResource("/data/guns/18b.png");
        Image imageGun18 = new Image(route18.toString());
        gunImage.setGraphic(new ImageView(imageGun18));
        gunName.setText("Bolt-action sniper rifle");

    }

    @FXML
    void but17(ActionEvent event) {
        
        URL route17 = getClass().getResource("/data/guns/17b.png");
        Image imageGun17 = new Image(route17.toString());
        gunImage.setGraphic(new ImageView(imageGun17));
        gunName.setText("Heavy shotgun");

    }

    @FXML
    void but16(ActionEvent event) {
        
        URL route16 = getClass().getResource("/data/guns/16b.png");
        Image imageGun16 = new Image(route16.toString());
        gunImage.setGraphic(new ImageView(imageGun16));
        gunName.setText("Tactical shotgun");

    }

    @FXML
    void but21(ActionEvent event) {
        
        URL route21 = getClass().getResource("/data/guns/21b.png");
        Image imageGun21 = new Image(route21.toString());
        gunImage.setGraphic(new ImageView(imageGun21));
        gunName.setText("Rocket launcher");

    }

    @FXML
    void but9(ActionEvent event) {
        
        URL route9 = getClass().getResource("/data/guns/9b.png");
        Image imageGun9 = new Image(route9.toString());
        gunImage.setGraphic(new ImageView(imageGun9));
        gunName.setText("Minigun");

    }

    @FXML
    void but8(ActionEvent event) {
        
        URL route8 = getClass().getResource("/data/guns/8b.png");
        Image imageGun8 = new Image(route8.toString());
        gunImage.setGraphic(new ImageView(imageGun8));
        gunName.setText("Submachine gun");
        

    }

    @FXML
    void but12(ActionEvent event) {
        
        URL route12 = getClass().getResource("/data/guns/12b.png");
        Image imageGun12 = new Image(route12.toString());
        gunImage.setGraphic(new ImageView(imageGun12));
        gunName.setText("Suppressed pistol");

    }

    @FXML
    void but11(ActionEvent event) {
        
        URL route11 = getClass().getResource("/data/guns/11b.png");
        Image imageGun11 = new Image(route11.toString());
        gunImage.setGraphic(new ImageView(imageGun11));
        gunName.setText("Revolver");

    }

    @FXML
    void but10(ActionEvent event) {
        
        URL route10 = getClass().getResource("/data/guns/10b.png");
        Image imageGun10 = new Image(route10.toString());
        gunImage.setGraphic(new ImageView(imageGun10));
        gunName.setText("Pistol");

    }

    @FXML
    void but14(ActionEvent event) {
        
        URL route14 = getClass().getResource("/data/guns/14b.png");
        Image imageGun14 = new Image(route14.toString());
        gunImage.setGraphic(new ImageView(imageGun14));
        gunName.setText("Dual pistol");

    }

    @FXML
    void but13(ActionEvent event) {
        
        URL route13 = getClass().getResource("/data/guns/13b.png");
        Image imageGun13 = new Image(route13.toString());
        gunImage.setGraphic(new ImageView(imageGun13));
        gunName.setText("Hand cannon");

    }

    @FXML
    void but3(ActionEvent event) {
        
        URL route3 = getClass().getResource("/data/guns/3b.png");
        Image imageGun3 = new Image(route3.toString());
        gunImage.setGraphic(new ImageView(imageGun3));
        gunName.setText("Assault rifle (M4)");

    }

    @FXML
    void but2(ActionEvent event) {
        
        URL route2 = getClass().getResource("/data/guns/2b.png");
        Image imageGun2 = new Image(route2.toString());
        gunImage.setGraphic(new ImageView(imageGun2));
        gunName.setText("Assault rifle (BURST)");

    }

    @FXML
    void but1(ActionEvent event) {
        
        URL route1 = getClass().getResource("/data/guns/1b.png");
        Image imageGun1 = new Image(route1.toString());
        gunImage.setGraphic(new ImageView(imageGun1));
        gunName.setText("Assault rifle (SCOPED)");

    }

    @FXML
    void but7(ActionEvent event) {
        
        URL route7 = getClass().getResource("/data/guns/7b.png");
        Image imageGun7 = new Image(route7.toString());
        gunImage.setGraphic(new ImageView(imageGun7));
        gunName.setText("Suppressed submachine gun");

    }

    @FXML
    void but6(ActionEvent event) {
        
        URL route6 = getClass().getResource("/data/guns/6b.png");
        Image imageGun6 = new Image(route6.toString());
        gunImage.setGraphic(new ImageView(imageGun6));
        gunName.setText("Light machine gun");

    }

    @FXML
    void but5(ActionEvent event) {
        
        URL route5 = getClass().getResource("/data/guns/5b.png");
        Image imageGun5 = new Image(route5.toString());
        gunImage.setGraphic(new ImageView(imageGun5));
        gunName.setText("Assault rifle (BURST RARE)");
        
    }

    @FXML
    void but4(ActionEvent event) {

        URL route4 = getClass().getResource("/data/guns/4b.png");
        Image imageGun4 = new Image(route4.toString());
        gunImage.setGraphic(new ImageView(imageGun4));
        gunName.setText("Assault rifle (SCAR)");
        
    }

    @FXML
    void butAdd(ActionEvent event) {
    
        Gun gun = new Gun(gunName.getText(), 3);
        try {
            game.getPlayer().addGun(gun);
            gunsList.getItems().add(0, game.gunName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        numBullets.setText(String.valueOf(game.bullets()));

    }
    
    void paintGuns() {
        
        if(gunsList.getItems().isEmpty()) {
            
            try {
            gunsList.getItems().add(gunsList.getItems().size(), game.gunName());    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        numBullets.setText(String.valueOf(game.bullets()));
        
        
        
    }       
   
    
    @FXML
    void butShoot(ActionEvent event) {
        
        if(gunsList.getItems().get(0).toString() != "Pickaxe") {
            
            game.shoot();
            numBullets.setText(String.valueOf(game.bullets()));
            
            if(game.bullets() == 0) {
                
                gunsList.getItems().remove(game.gunName());
                numBullets.setText(String.valueOf(game.bullets()));

                
                
            }
            
        }
   
    }
    
    public void images() {
    
        URL route1 = getClass().getResource("/data/guns/1.png");
        Image imageGun1 = new Image(route1.toString());
        button1.setGraphic(new ImageView(imageGun1));
        
        URL route2 = getClass().getResource("/data/guns/2.png");
        Image imageGun2 = new Image(route2.toString());
        button2.setGraphic(new ImageView(imageGun2));
        
        URL route3 = getClass().getResource("/data/guns/3.png");
        Image imageGun3 = new Image(route3.toString());
        button3.setGraphic(new ImageView(imageGun3));
        
        URL route4 = getClass().getResource("/data/guns/4.png");
        Image imageGun4 = new Image(route4.toString());
        button4.setGraphic(new ImageView(imageGun4));
        
        URL route5 = getClass().getResource("/data/guns/5.png");
        Image imageGun5 = new Image(route5.toString());
        button5.setGraphic(new ImageView(imageGun5));
        
        URL route6 = getClass().getResource("/data/guns/6.png");
        Image imageGun6 = new Image(route6.toString());
        button6.setGraphic(new ImageView(imageGun6));
        
        URL route7 = getClass().getResource("/data/guns/7.png");
        Image imageGun7 = new Image(route7.toString());
        button7.setGraphic(new ImageView(imageGun7));
        
        URL route8 = getClass().getResource("/data/guns/8.png");
        Image imageGun8 = new Image(route8.toString());
        button8.setGraphic(new ImageView(imageGun8));
        
        URL route9 = getClass().getResource("/data/guns/9.png");
        Image imageGun9 = new Image(route9.toString());
        button9.setGraphic(new ImageView(imageGun9));
        
        URL route10 = getClass().getResource("/data/guns/10.png");
        Image imageGun10 = new Image(route10.toString());
        button10.setGraphic(new ImageView(imageGun10));
        
        URL route11 = getClass().getResource("/data/guns/11.png");
        Image imageGun11 = new Image(route11.toString());
        button11.setGraphic(new ImageView(imageGun11));
        
        URL route12 = getClass().getResource("/data/guns/12.png");
        Image imageGun12 = new Image(route12.toString());
        button12.setGraphic(new ImageView(imageGun12));
        
        URL route13 = getClass().getResource("/data/guns/13.png");
        Image imageGun13 = new Image(route13.toString());
        button13.setGraphic(new ImageView(imageGun13));
        
        URL route14 = getClass().getResource("/data/guns/14.png");
        Image imageGun14 = new Image(route14.toString());
        button14.setGraphic(new ImageView(imageGun14));
        
        URL route15 = getClass().getResource("/data/guns/15.png");
        Image imageGun15 = new Image(route15.toString());
        button15.setGraphic(new ImageView(imageGun15));
        
        URL route16 = getClass().getResource("/data/guns/16.png");
        Image imageGun16 = new Image(route16.toString());
        button16.setGraphic(new ImageView(imageGun16));
        
        URL route17 = getClass().getResource("/data/guns/17.png");
        Image imageGun17 = new Image(route17.toString());
        button17.setGraphic(new ImageView(imageGun17));
        
        URL route18 = getClass().getResource("/data/guns/18.png");
        Image imageGun18 = new Image(route18.toString());
        button18.setGraphic(new ImageView(imageGun18));
        
        URL route19 = getClass().getResource("/data/guns/19.png");
        Image imageGun19 = new Image(route19.toString());
        button19.setGraphic(new ImageView(imageGun19));
        
        URL route20 = getClass().getResource("/data/guns/20.png");
        Image imageGun20 = new Image(route20.toString());
        button20.setGraphic(new ImageView(imageGun20));
        
        URL route21 = getClass().getResource("/data/guns/21.png");
        Image imageGun21 = new Image(route21.toString());
        button21.setGraphic(new ImageView(imageGun21));
        
        URL route22 = getClass().getResource("/data/guns/22.png");
        Image imageGun22 = new Image(route22.toString());
        button22.setGraphic(new ImageView(imageGun22));
        
        URL route23 = getClass().getResource("/data/guns/23.png");
        Image imageGun23 = new Image(route23.toString());
        button23.setGraphic(new ImageView(imageGun23));
        
        URL route24 = getClass().getResource("/data/guns/24.png");
        Image imageGun24 = new Image(route24.toString());
        button24.setGraphic(new ImageView(imageGun24));
        
        URL route25 = getClass().getResource("/data/guns/25.png");
        Image imageGun25 = new Image(route25.toString());
        button25.setGraphic(new ImageView(imageGun25));
        
        URL route26 = getClass().getResource("/data/guns/26.png");
        Image imageGun26 = new Image(route26.toString());
        button26.setGraphic(new ImageView(imageGun26));
        
        URL route27 = getClass().getResource("/data/guns/27.png");
        Image imageGun27 = new Image(route27.toString());
        button27.setGraphic(new ImageView(imageGun27));
        
        URL route28 = getClass().getResource("/data/guns/28.png");
        Image imageGun28 = new Image(route28.toString());
        button28.setGraphic(new ImageView(imageGun28));

    }

    public void initialize(URL location, ResourceBundle resources) {
    
         	images();
            paintGuns();
            gunsList.setMouseTransparent( true );
            gunsList.setFocusTraversable( false );
            
            pcC1.setCellValueFactory(new PropertyValueFactory("name"));
            pcC2.setCellValueFactory(new PropertyValueFactory("name"));
            pcC3.setCellValueFactory(new PropertyValueFactory("name"));
            pcC4.setCellValueFactory(new PropertyValueFactory("name"));
            pcC5.setCellValueFactory(new PropertyValueFactory("name"));
        
            playC1.setCellValueFactory(new PropertyValueFactory("name"));
            playC2.setCellValueFactory(new PropertyValueFactory("name"));
            playC3.setCellValueFactory(new PropertyValueFactory("name"));
            playC4.setCellValueFactory(new PropertyValueFactory("name"));
            playC5.setCellValueFactory(new PropertyValueFactory("name"));
            
            xboxC1.setCellValueFactory(new PropertyValueFactory("name"));
            xboxC2.setCellValueFactory(new PropertyValueFactory("name"));
            xboxC3.setCellValueFactory(new PropertyValueFactory("name"));
            xboxC4.setCellValueFactory(new PropertyValueFactory("name"));
            xboxC5.setCellValueFactory(new PropertyValueFactory("name"));
            
            nintC1.setCellValueFactory(new PropertyValueFactory("name"));
            nintC2.setCellValueFactory(new PropertyValueFactory("name"));
            nintC3.setCellValueFactory(new PropertyValueFactory("name"));
            nintC4.setCellValueFactory(new PropertyValueFactory("name"));
            nintC5.setCellValueFactory(new PropertyValueFactory("name"));
            
            iphoneC1.setCellValueFactory(new PropertyValueFactory("name"));
            iphoneC2.setCellValueFactory(new PropertyValueFactory("name"));
            iphoneC3.setCellValueFactory(new PropertyValueFactory("name"));
            iphoneC4.setCellValueFactory(new PropertyValueFactory("name"));
            iphoneC5.setCellValueFactory(new PropertyValueFactory("name"));
            
            pcTable2.getItems().addAll(new Player("agv19x", "PC", 30, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("KaoWinchester", "PC", 15, new Gun("Pickaxe", 0)));
            pcTable1.getItems().addAll(new Player("KaoWinchester", "PC", 15, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("MelquiPittacus2", "Playstation", 15, new Gun("Pickaxe", 0)));
            playTable1.getItems().addAll(new Player("MelquiPittacus2", "Playstation", 15, new Gun("Pickaxe", 0)));
           
            game.addPlayer(new Player("afedo", "Xbox", 56, new Gun("Pickaxe", 0)));
            xboxTable3.getItems().addAll(new Player("afedo", "Xbox", 15, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("Judas", "Nintendo", 89, new Gun("Pickaxe", 0)));
            nintTable5.getItems().addAll(new Player("Judas", "Nintendo", 89, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("Carlos", "Nintendo", 30, new Gun("Pickaxe", 0)));
            nintTable2.getItems().addAll(new Player("Carlos", "Nintendo", 30, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("Claudio", "iPhone", 10, new Gun("Pickaxe", 0)));
            iphoneTable1.getItems().addAll(new Player("Claudio", "iPhone", 33, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("Virginia", "iPhone", 40, new Gun("Pickaxe", 0)));
            iphoneTable3.getItems().addAll(new Player("Virginia", "iPhone", 40, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("Julián", "PC", 41, new Gun("Pickaxe", 0)));
            pcTable3.getItems().addAll(new Player("Julián", "PC", 41, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("Diego", "Playstation", 60, new Gun("Pickaxe", 0)));
            playTable4.getItems().addAll(new Player("Diego", "Playstation", 60, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("Paulina", "PC", 80, new Gun("Pickaxe", 0)));
            pcTable5.getItems().addAll(new Player("Paulina", "PC", 80, new Gun("Pickaxe", 0)));
            
            game.addPlayer(new Player("Elena", "Xbox", 85, new Gun("Pickaxe", 0)));
            xboxTable5.getItems().addAll(new Player("Elena", "Xbox", 85, new Gun("Pickaxe", 0)));
            
    }

}
