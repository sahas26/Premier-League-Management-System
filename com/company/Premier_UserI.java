package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;

public class Premier_UserI extends Application {

    public static PremierLeagueManager sss = new PremierLeagueManager();

    public static Comparator SortAsGoal(){
        Comparator<FootballClub>sortGoalList = new Comparator<FootballClub>() {
            @Override
            public int compare(FootballClub o1, FootballClub o2) {
                return o2.getNumberOfGoalsScore()-o1.getNumberOfGoalsScore();
            }
        };

        return sortGoalList;
    }

    public static Comparator SortAsWins(){
        Comparator<FootballClub>sortWinsList = new Comparator<FootballClub>() {
            @Override
            public int compare(FootballClub o1, FootballClub o2) {
                return o2.getWins()-o1.getWins();
            }
        };

        return sortWinsList;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {


        Stage stage = new Stage();
        Scene scene1, scene2, scene3, scene4,scene5,scene6;
        stage.setTitle("premier league");


        Pane Pane_Sick1 = new Pane(); //////////////////////////
        Pane Pane_Sick2 = new Pane();
        Pane Pane_Sick3 = new Pane();     //(panes)
        Pane Pane_Sick4 = new Pane();
        Pane Pane_Sick5 = new Pane();
        Pane Pane_Sick6 = new Pane();


        scene1 = new Scene(Pane_Sick1, 650, 525);
        scene2 = new Scene(Pane_Sick2, 650, 525);
        scene3 = new Scene(Pane_Sick3, 650, 525);//(scenes)
        scene4 = new Scene(Pane_Sick4, 650, 525);
        scene5 = new Scene(Pane_Sick5, 650, 525);
        scene6 = new Scene(Pane_Sick6, 650, 525); //user Login interface



        //<<<<<<<<<<<<<     pane1    (Main)    >>>>>>>>>>>>>>


        //Main

        Label iit = new Label("  Premier League   ");
        iit.setLayoutX(200);
        iit.setLayoutY(45);
        iit.setPrefWidth(280);
        iit.setPrefHeight(60);
        iit.setStyle("-fx-font-size:34px ;-fx-text-fill:#faf8f8");





        ImageView imgFirstMain = imageCreator("image/vec3.png",650,525,0,0);    //call imagecreater method


        //LeftSide Buttons for activate a new windows

        Button AL1 = new Button(" View Table");
        AL1.setLayoutX(160);
        AL1.setLayoutY(145);
        AL1.setPrefWidth(170);
        AL1.setPrefHeight(40);
        AL1.setStyle("-fx-font-size:16px");
       // bt_k1.setStyle("-fx-background-color:LightCyan");



        Button AL2 = new Button("Match Start ");
        AL2.setLayoutX(160);
        AL2.setLayoutY(225);
        AL2.setPrefWidth(170);
        AL2.setPrefHeight(40);
        AL2.setStyle("-fx-font-size:16px");


        Button AL3 = new Button(" History of matchers");
        AL3.setLayoutX(160);
        AL3.setLayoutY(305);
        AL3.setPrefWidth(170);
        AL3.setPrefHeight(40);
        AL3.setStyle("-fx-font-size:16px");


        //


        Button AL4 = new Button(" Quite ");
        AL4.setLayoutX(160);
        AL4.setLayoutY(385);
        AL4.setPrefWidth(170);
        AL4.setPrefHeight(40);
        AL4.setStyle("-fx-font-size:16px;-fx-background-color:#fdea7a");



        Pane_Sick1.getChildren().addAll(imgFirstMain, iit, AL1, AL2, AL3, AL4);




//////////////////////////////////////////////////////////////////////////////////

        //<<<<<<<<<<<<<<<  pane 2    (add club)       >>>>>>>>>>>>>>>>>>>>

        Label solidAdd = new Label("  Table   ");
        solidAdd.setLayoutX(180);
        solidAdd.setLayoutY(10);
        solidAdd.setPrefWidth(280);
        solidAdd.setPrefHeight(60);
        solidAdd.setStyle("-fx-font-size:30px ;-fx-text-fill:#faf9f9");

        ImageView imgTablViewMain = imageCreator("image/debue.png",650,525,0,0);


        //table1

        TableView<FootballClub> tableScore = new TableView();
        tableScore.setPrefSize(490,440);
        tableScore.setLayoutX(145);
        tableScore.setLayoutY(60);


        //columns

        TableColumn<FootballClub,String> columnClub = new TableColumn("Club Name");
        columnClub.setMaxWidth(150);
        columnClub.setMinWidth(150);
        columnClub.setCellValueFactory(new PropertyValueFactory("nameOfTheClub"));

        TableColumn<FootballClub,Integer> columnPlayed = new TableColumn("MP");
        columnPlayed.setMaxWidth(41);
        columnPlayed.setMinWidth(41);
        columnPlayed.setCellValueFactory(new PropertyValueFactory("numberOfMatchesPlayed"));

        TableColumn<FootballClub,Integer> columnWin = new TableColumn("W");
        columnWin.setMaxWidth(41);
        columnWin.setMinWidth(41);
        columnWin.setCellValueFactory(new PropertyValueFactory("wins"));

        TableColumn<FootballClub,Integer> columnDraw = new TableColumn("D");
        columnDraw.setMaxWidth(41);
        columnDraw.setMinWidth(41);
        columnDraw.setCellValueFactory(new PropertyValueFactory("draws"));

        TableColumn<FootballClub,Integer> columnLose = new TableColumn("L");
        columnLose.setMaxWidth(41);
        columnLose.setMinWidth(41);
        columnLose.setCellValueFactory(new PropertyValueFactory("defeats"));

        TableColumn<FootballClub,Integer> columnGoalScore = new TableColumn("GF");
        columnGoalScore.setMaxWidth(41);
        columnGoalScore.setMinWidth(41);
        columnGoalScore.setCellValueFactory(new PropertyValueFactory("numberOfGoalsScore"));

        TableColumn<FootballClub,Integer> columnGoalAgainst = new TableColumn(" GA");
        columnGoalAgainst.setMaxWidth(41);
        columnGoalAgainst.setMinWidth(41);
        columnGoalAgainst.setCellValueFactory(new PropertyValueFactory("getNumberOfGoalsDefeats"));

        TableColumn<FootballClub,Integer>  columnDeferance= new TableColumn("GD");
        columnDeferance.setMaxWidth(41);
        columnDeferance.setMinWidth(41);
        columnDeferance.setCellValueFactory(new PropertyValueFactory("goalDifference"));

        TableColumn<FootballClub,Integer>  columnPoints= new TableColumn("Pts");
        columnPoints.setMaxWidth(51);
        columnPoints.setMinWidth(51);
        columnPoints.setCellValueFactory(new PropertyValueFactory("numberOfPoints"));

        tableScore.getColumns().addAll(
                columnClub,
                columnPlayed,
                columnWin,
                columnDraw,
                columnLose,
                columnGoalScore,
                columnGoalAgainst,
                columnDeferance,
                columnPoints
        );

        for(FootballClub Prime:sss.ArrayPremierLeague){      //arraylist
            tableScore.getItems().addAll(Prime);             //forLoop
        }




        Button Bt__ADD1 = new Button("BACK");
        Bt__ADD1.setLayoutX(25);
        Bt__ADD1.setLayoutY(450);
        Bt__ADD1.setPrefWidth(100);
        Bt__ADD1.setPrefHeight(40);
        Bt__ADD1.setStyle("-fx-font-size:15px;-fx-background-color:#fdea7a");
        Bt__ADD1.setOnAction(e -> stage.setScene(scene1));  //lamda expresion to event handler

        Button Bt__ADD2 = new Button("Goal");
        Bt__ADD2.setLayoutX(25);
        Bt__ADD2.setLayoutY(150);
        Bt__ADD2.setPrefWidth(100);
        Bt__ADD2.setPrefHeight(40);
        Bt__ADD2.setStyle("-fx-font-size:15px");
        Bt__ADD2.setStyle(";-fx-background-color:#4ee3de");
        Bt__ADD2.setOnAction(e ->{
            tableScore.getItems().clear();
            sss.ArrayPremierLeague.sort(SortAsGoal());

            for(FootballClub Prime:sss.ArrayPremierLeague){      //arraylist
                tableScore.getItems().addAll(Prime);             //forLoop
            }

        });

        Button Bt__ADD3 = new Button("Statics");
        Bt__ADD3.setLayoutX(25);
        Bt__ADD3.setLayoutY(230);
        Bt__ADD3.setPrefWidth(100);
        Bt__ADD3.setPrefHeight(40);
        Bt__ADD3.setStyle("-fx-font-size:15px");
        Bt__ADD3.setStyle(";-fx-background-color:#4ee3de");
        Bt__ADD3.setOnAction(e ->{
            tableScore.getItems().clear();
            sss.ArrayPremierLeague.sort(FootballClub::compareTo);

            for(FootballClub Prime:sss.ArrayPremierLeague){      //arraylist
                tableScore.getItems().addAll(Prime);             //forLoop
            }

        });

        Button Bt__ADD4 = new Button("wins");
        Bt__ADD4.setLayoutX(25);
        Bt__ADD4.setLayoutY(310);
        Bt__ADD4.setPrefWidth(100);
        Bt__ADD4.setPrefHeight(40);
        Bt__ADD4.setStyle("-fx-font-size:15px");
        Bt__ADD4.setStyle(";-fx-background-color:#4ee3de");
        Bt__ADD4.setOnAction(e ->{
            tableScore.getItems().clear();
            sss.ArrayPremierLeague.sort(SortAsWins());

            for(FootballClub Prime:sss.ArrayPremierLeague){      //arraylist
                tableScore.getItems().addAll(Prime);             //forLoop
            }

        });

        Pane_Sick2.getChildren().addAll(imgTablViewMain,solidAdd, Bt__ADD1,tableScore,Bt__ADD2,Bt__ADD3,Bt__ADD4);


        /////////////////////////////////////////////////////////////////

        //<<<<<<<<<<<<<<   pane 3     (match club)    >>>>>>>>>>>>>>>>>>>>


        Label destroyed = new Label("  Match   ");
        destroyed.setLayoutX(230);
        destroyed.setLayoutY(2);
        destroyed.setPrefWidth(320);
        destroyed.setPrefHeight(100);
        destroyed.setStyle("-fx-font-size:40px ;-fx-text-fill:#faf6f6");

        ImageView imgMatchRanMain = imageCreator("image/zlatan.png",650,525,0,0);


        Pane MatchBox = new Pane();
        MatchBox.setPrefSize(320,120);
        MatchBox.setLayoutX(140);
        MatchBox.setLayoutY(215);
        MatchBox.setStyle("-fx-background-color: #fafcfc");



        Label Lb_1 =new Label("");
        Lb_1.setLayoutX(190);
        Lb_1.setLayoutY(150);
        Lb_1.setPrefWidth(300);
        Lb_1.setPrefHeight(180);
        //Lb_1.setStyle("-fx-background-color: #040909");

        Label Lb_2 =new Label("");
        Lb_2.setLayoutX(190);
        Lb_2.setLayoutY(200);
        Lb_2.setPrefWidth(300);
        Lb_2.setPrefHeight(180);
        //Lb_2.setStyle("-fx-background-color: #000505");




        Button Bt__DEL01 = new Button("BACK");
        Bt__DEL01.setLayoutX(100);
        Bt__DEL01.setLayoutY(410);
        Bt__DEL01.setPrefWidth(100);
        Bt__DEL01.setPrefHeight(40);
        Bt__DEL01.setStyle("-fx-font-size:15px;-fx-background-color:#fdea7a");
        Bt__DEL01.setOnAction(e -> stage.setScene(scene1));


        Button Bt__DEL02 = new Button("Generate");
        Bt__DEL02.setLayoutX(280);
        Bt__DEL02.setLayoutY(410);
        Bt__DEL02.setPrefWidth(100);
        Bt__DEL02.setPrefHeight(40);
        Bt__DEL02.setStyle("-fx-font-size:15px;-fx-background-color:#09e7e7");
        Bt__DEL02.setOnAction(e -> stage.setScene(scene1));
        Bt__DEL02.setOnAction(e ->{
            MatchDay clubNew = sss.matchRandom();
            Lb_1.setText(""+clubNew.getDay()+"/"+clubNew.getMonth()+"/"+clubNew.getYear());
            Lb_2.setText(""+clubNew.getFirstClub()+ "\t" +clubNew.firstTeamResult + "\t"
                    + "VS"+"\t" +clubNew.secondTeamResult + "\t"+ clubNew.secondClub);

        });

        Pane_Sick3.getChildren().addAll(imgMatchRanMain,destroyed,MatchBox, Bt__DEL01,Bt__DEL02,Lb_1,Lb_2);


////////////////////////////////////////////////////////////////////////////


        //<<<<<<<<<<<<<<   pane 4    (history)       >>>>>>>>>>>>>>>>>>>>>>


        Label findPush = new Label("  History   ");
        findPush.setLayoutX(260);
        findPush.setLayoutY(5);
        findPush.setPrefWidth(280);
        findPush.setPrefHeight(60);
        findPush.setStyle("-fx-font-size:25px ;-fx-text-fill:#faf7f7");

        ImageView imgHistMain = imageCreator("image/beer.png",650,525,0,0);

        TextField tf_his1 = new TextField();
        tf_his1.setPrefSize(60,30);
        tf_his1.setLayoutX(470);
        tf_his1.setLayoutY(4);

        TextField tf_his2 = new TextField();
        tf_his2.setPrefSize(50,30);
        tf_his2.setLayoutX(535);
        tf_his2.setLayoutY(4);

        TextField tf_his3 = new TextField();
        tf_his3.setPrefSize(50,30);
        tf_his3.setLayoutX(590);
        tf_his3.setLayoutY(4);

        Button btn_his1 =new Button("search");
        btn_his1.setPrefSize(100,30);
        btn_his1.setLayoutX(500);
        btn_his1.setLayoutY(45);
        btn_his1.setStyle("-fx-font-size:15px;-fx-background-color:#5ae7cc");



        //table2

        TableView<MatchDay> tableScore_Match = new TableView();
        tableScore_Match.setPrefSize(630,400);
        tableScore_Match.setLayoutX(10);
        tableScore_Match.setLayoutY(80);

        //columns

        TableColumn<MatchDay,String> homeClub = new TableColumn("Home Club ");
        homeClub.setMaxWidth(150);
        homeClub.setMinWidth(150);
        homeClub.setCellValueFactory(new PropertyValueFactory("firstClub"));

        TableColumn<MatchDay,Integer> homeClubGoal = new TableColumn("Home Goal");
        homeClubGoal.setMaxWidth(85);
        homeClubGoal.setMinWidth(85);
        homeClubGoal.setCellValueFactory(new PropertyValueFactory("firstTeamResult"));

        TableColumn<MatchDay,String> awayClub = new TableColumn("Away Club");
        awayClub.setMaxWidth(150);
        awayClub.setMinWidth(150);
        awayClub.setCellValueFactory(new PropertyValueFactory("secondClub"));

        TableColumn<MatchDay,Integer> awayClubGoal = new TableColumn("Away Goal");
        awayClubGoal.setMaxWidth(85);
        awayClubGoal.setMinWidth(85);
        awayClubGoal.setCellValueFactory(new PropertyValueFactory("secondTeamResult"));

        TableColumn<MatchDay,Integer> DateYear = new TableColumn("Year");
        DateYear.setMaxWidth(55);
        DateYear.setMinWidth(55);
        DateYear.setCellValueFactory(new PropertyValueFactory("year"));

        TableColumn<MatchDay,Integer> DateMonth = new TableColumn("Month");
        DateMonth.setMaxWidth(55);
        DateMonth.setMinWidth(55);
        DateMonth.setCellValueFactory(new PropertyValueFactory("month"));

        TableColumn<MatchDay,Integer> DateDay = new TableColumn("Day");
        DateDay.setMaxWidth(55);
        DateDay.setMinWidth(55);
        DateDay.setCellValueFactory(new PropertyValueFactory("day"));



        tableScore_Match.getColumns().addAll(
                homeClub,
                homeClubGoal,
                awayClub,
                awayClubGoal,
                DateYear,
                DateMonth,
                DateDay
        );

        for(MatchDay MatchPrime:sss.matchList){                   //arraylist
            tableScore_Match.getItems().addAll(MatchPrime);             //forLoop
        }



        Button Bt__Find01 = new Button("BACK");
        Bt__Find01.setLayoutX(35);
        Bt__Find01.setLayoutY(10);
        Bt__Find01.setPrefWidth(100);
        Bt__Find01.setPrefHeight(40);
        Bt__Find01.setStyle("-fx-font-size:15px;-fx-background-color:#fdea7a");
        Bt__Find01.setOnAction(e -> stage.setScene(scene1));



        Pane_Sick4.getChildren().addAll(imgHistMain,findPush, Bt__Find01,tableScore_Match,tf_his1,tf_his2,tf_his3,btn_his1);


/////////////////////////////////////////////////////////////////////////////////


        //<<<<<<<<<<<<<<   pane 5    (search match)       >>>>>>>>>>>>>>>>>>>>>>
        ImageView imgSearch_Date = imageCreator("image/arse.png",650,525,0,0);    //call imagecreater method

        Button Bt__backSearch = new Button("BACK");
        Bt__backSearch.setLayoutX(70);
        Bt__backSearch.setLayoutY(445);
        Bt__backSearch.setPrefWidth(100);
        Bt__backSearch.setPrefHeight(40);
        Bt__backSearch.setStyle("-fx-font-size:15px;-fx-background-color:#fdea7a");
        Bt__backSearch.setOnAction(e -> stage.setScene(scene1));


//        TextArea TA_dark =new TextArea();
//        TA_dark.setLayoutX(60);
//        TA_dark.setLayoutY(50);
//        TA_dark.setPrefSize(525,340);
//        TA_dark.setStyle("-fx-font-size:27px;");

        VBox TA_dark = new VBox();
        TA_dark.setLayoutX(60);
        TA_dark.setLayoutY(50);
        TA_dark.setPrefSize(525,340);
        TA_dark.setStyle("-fx-font-size:20px;");











        Pane_Sick5.getChildren().addAll(imgSearch_Date,Bt__backSearch,TA_dark);


        //----------------------------------------------------------------

        //<<<<<<<<<<<<<<   pane 6    ( user login)       >>>>>>>>>>>>>>>>>>>>>>

        ImageView imageLog = imageCreator("image/pllog.png",650,525,0,0);    //call imagecreater method





        Label loginName = new Label("User Name ");
        loginName.setLayoutX(80);
        loginName.setLayoutY(45);
        loginName.setPrefWidth(320);
        loginName.setPrefHeight(100);
        loginName.setStyle("-fx-font-size:20px ;-fx-text-fill:#151414");

        Label loginPassword = new Label("Password ");
        loginPassword.setLayoutX(80);
        loginPassword.setLayoutY(150);
        loginPassword.setPrefWidth(320);
        loginPassword.setPrefHeight(100);
        loginPassword.setStyle("-fx-font-size:20px ;-fx-text-fill:#090808");

        TextField nameTxT =new TextField();
        nameTxT.setLayoutX(80);
        nameTxT.setLayoutY(125);
        nameTxT.setPrefWidth(180);
        nameTxT.setPrefHeight(30);
        nameTxT.setStyle("-fx-font-size:20px ;-fx-text-fill:#100a0a");

        PasswordField nameTxT1 =new PasswordField();
        nameTxT1.setLayoutX(80);
        nameTxT1.setLayoutY(230);
        nameTxT1.setPrefWidth(180);
        nameTxT1.setPrefHeight(30);
        nameTxT1.setStyle("-fx-font-size:20px ;-fx-text-fill:#100a0a");

        Label loginReject = new Label("");
        loginReject.setLayoutX(79);
        loginReject.setLayoutY(400);
        loginReject.setPrefWidth(420);
        loginReject.setPrefHeight(100);
        loginReject.setStyle("-fx-font-size:20px ;-fx-text-fill:#0a0a0a");

        Button btnLogin = new Button("Login");
        btnLogin.setLayoutX(100);
        btnLogin.setLayoutY(300);
        btnLogin.setPrefWidth(100);
        btnLogin.setPrefHeight(25);
        btnLogin.setStyle("-fx-font-size:20px ;-fx-text-fill:#100a0a");
        btnLogin.setOnAction(event -> {
            String user = nameTxT.getText();
            String password =nameTxT1.getText();
            System.out.println(user + "," +password);

            if (user.equals("sahas kulasekera") && password.equals("arsen")){
                loginReject.setText("login successful !!");
                stage.setScene(scene1);

            }
            else {
                loginReject.setText("your password is incorrect,Try again");
                nameTxT.clear();
                nameTxT1.clear();
            }
        });






        Pane_Sick6.getChildren().addAll(imageLog,loginName,loginPassword,nameTxT,nameTxT1,btnLogin,loginReject);











        //-------------------------------------------Main Actions

        //table action 1 for update and view
        AL1.setOnAction(e ->{
            stage.setScene(scene2);
            tableScore.getItems().clear();
            sss.ArrayPremierLeague.sort(FootballClub::compareTo);

            for(FootballClub Prime:sss.ArrayPremierLeague){      //arraylist
                tableScore.getItems().addAll(Prime);             //forLoop
            }



        });

        //random match start

        AL2.setOnAction(e -> stage.setScene(scene3));

        //match history update and view

        AL3.setOnAction(e ->{
            stage.setScene(scene4);
            tableScore_Match.getItems().clear();
            sss.matchList.sort(MatchDay::compareTo);

            for(MatchDay MatchPrime:sss.matchList){                   //arraylist
                tableScore_Match.getItems().addAll(MatchPrime);             //forLoop
            }


        });

        //match history update and view search button action

        btn_his1.setOnAction(e ->{
            TA_dark.getChildren().clear();

            stage.setScene(scene5);
           for (MatchDay matchSearch :sss.searchDate(tf_his1.getText() , tf_his2.getText()  ,tf_his3.getText()) ){
               TA_dark.getChildren().add(searchResultBlockResult(matchSearch));
           }









//            for (MatchDay match:sss.matchList){
//                if ( match.getYear()+"/"+match.getMonth()+"/"+match.getDay()==(tf_his1.getText())){
//                    TA_dark.setText("Date :" +match.getYear()+"/"+match.getMonth()+"/"+match.getDay()+"\n"+"match :"+match.getFirstClub()
//                            +"\t"+match.getFirstTeamResult()+"\t"+"Vs"+match.getSecondTeamResult()+"\t"+match.getSecondClub());
//
//
//                }
//
//            }

        });





        //quite

        AL4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = (Stage) AL4.getScene().getWindow();
                stage.close();
            }
        });





        //-----------------------------------------------------------------

        stage.setScene(scene6);
        stage.showAndWait();


        ////////////////////////////////////////////////////////////////////////////





    }

    public static Label searchResultBlockResult(MatchDay match){
        Label lb = new Label(""+match.getFirstClub()+"\t"+match.getFirstTeamResult()+ "\t Vs"+"\t"+match.getSecondTeamResult()+"\t"+match.getSecondClub());
        lb.setPrefSize(525,50);
        return lb;
    }

    public static ImageView imageCreator(String fileparth,double width,double height,double x,double y) {
        Image image = new Image(fileparth);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);                            //imageCreator Method use to use my images to all
        imageView.setLayoutX(x);
        imageView.setLayoutY(y);

        return imageView;

    }






}











