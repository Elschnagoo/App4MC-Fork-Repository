/*******************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 * Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.execution.ui.widget.comunication;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.eclipse.app4mc.multicore.execution.model.XContainer;
import org.eclipse.app4mc.multicore.execution.model.XUtil;
import org.eclipse.app4mc.multicore.execution.model.elements.XAccess;
import org.eclipse.app4mc.multicore.execution.model.elements.XRunnable;
import org.eclipse.app4mc.multicore.execution.model.elements.XScheduler;
import org.eclipse.app4mc.multicore.execution.ui.widget.eventcanves.SimpleLabelChain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.*;

public  class ComUtil {
    private final static int MAXELEMENT=100;

    public static void taskInfo(String title, long start, double end, boolean underSampling, boolean overSampling, LinkedList<CollumEntry> outOver, LinkedList<CollumEntry> outUnder){

    final float scale =2.5f;
    final Insets minPadding = new Insets(5);




        Region tableOver;
        Region tableUnder;

        if (outOver.size()>0){
            tableOver = tabelFactory(outOver);
        }
        else{
            tableOver=new Label("No Producer found");
        }
        if (outUnder.size()>0){
            tableUnder = tabelFactory(outUnder);
        }
        else{
            tableUnder=new Label("No Consumer found");
        }


        /* #Header# */
        final VBox header = new VBox();

        final Label label = new Label(title);
        label.setFont(new Font("Arial", 20));
        label.setPadding(new Insets(5,0,0,0));
        header.getChildren().add(label);

        HBox resTime=new HBox(),samp=new HBox();


        final Label st = new Label("Start: "+start);
        st.setFont(new Font("Arial", 14));
        st.setPadding(minPadding);
        final Label en = new Label("End: "+end);
        en.setFont(new Font("Arial", 14));
        en.setPadding(minPadding);

        resTime.getChildren().add(st);
        resTime.getChildren().add(en);

        resTime.setPadding(minPadding);


        final Label over = new Label("Oversampling: "+overSampling);
        over.setFont(new Font("Arial", 14));
        over.setPadding(minPadding);
        final Label under = new Label("Undersampling: "+underSampling);
        under.setFont(new Font("Arial", 14));
        under.setPadding(minPadding);


        samp.getChildren().add(over);
        samp.getChildren().add(under);
        samp.setPadding(minPadding);


        header.getChildren().add(resTime);
        header.getChildren().add(samp);

        ScrollPane layout = new ScrollPane();

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(header,
                    new Label("Producer"),
                    tableOver,
                    new Label("Consumer"),
                    tableUnder
        );
        tableOver.prefWidthProperty().bind(layout.widthProperty());
        //tableOver.prefHeightProperty().bind(vbox.heightProperty());
        tableUnder.prefWidthProperty().bind(layout.widthProperty());
        //tableUnder.prefHeightProperty().bind(vbox.heightProperty());


        layout.setContent(vbox);
        layout.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        layout.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

        Scene scene = new Scene(layout);

        Stage newWindow = new Stage();
        newWindow.setTitle(title);
        newWindow.setScene(scene);
        //newWindow.setAlwaysOnTop(true);
        // Set position of second window, related to primary window.
        newWindow.setX(230);
        newWindow.setY(100);

        newWindow.setMinWidth(400);
        newWindow.setMaximized(true);
        newWindow.show();

    }
    private static Region tabelFactory(LinkedList<CollumEntry> inp){
        final ObservableList<CollumEntry> data = FXCollections.observableList(
                inp
        );


        TableView table = new TableView();

        table.setEditable(true);
        TableColumn e1 = new TableColumn("Name");
        TableColumn e2 = new TableColumn("Start Time");
        TableColumn e3 = new TableColumn("Status");
        TableColumn e4 = new TableColumn("Over-/UnderSampling");
        TableColumn e5 = new TableColumn("Type");


        e2.setStyle("-fx-alignment: CENTER;");
        e3.setStyle("-fx-alignment: CENTER;");
        e4.setStyle("-fx-alignment: CENTER;");
        e5.setStyle("-fx-alignment: CENTER;");


        e1.setCellValueFactory(
                new PropertyValueFactory<CollumEntry,String>("e1")
        );
        e2.setCellValueFactory(
                new PropertyValueFactory<CollumEntry,String>("e2")
        );

        e3.setCellValueFactory(
                new PropertyValueFactory<CollumEntry,String>("e3")
        );

        e4.setCellValueFactory(
                new PropertyValueFactory<CollumEntry,String>("e4")
        );
        e5.setCellValueFactory(
                new PropertyValueFactory<CollumEntry,String>("e5")
        );


        table.setItems(data);

        table.getColumns().addAll(e1, e2, e3,e4,e5);
        return table;

    }
    public static void PopUpWindow(String title,String inString)
    {
        Label text =new Label(inString);
        StackPane secondaryLayout = new StackPane();
        secondaryLayout.getChildren().add(text);

        int scale=3;

        Scene secondScene = new Scene(secondaryLayout, 230*scale, 100*scale);


        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle(title);
        newWindow.setScene(secondScene);
        newWindow.setAlwaysOnTop(true);
        // Set position of second window, related to primary window.
        newWindow.setX(230);
        newWindow.setY(100);

        newWindow.show();

        return;
    }
    public static void openManual()
    {
        StackPane secondaryLayout = new StackPane();


        int scale=4;

        Scene secondScene = new Scene(secondaryLayout, 160*scale, 100*scale);

        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();

        String url = "https://gsocdoku.echo5.me/";

// Load a page from remote url.
        webEngine.load(url);
        secondaryLayout.getChildren().add(browser);

        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("Manual");
        newWindow.setScene(secondScene);

        // Set position of second window, related to primary window.
        newWindow.setX(230);
        newWindow.setY(100);

        newWindow.show();
        return;
    }
    public static void PopUpTable(String title,String fromTo, String time, String labels)
    {


        Stage stage = new Stage();
        stage.setTitle(title);
        Scene scene = new Scene(new Group());

        // Set position of second window, related to primary window.
        stage.setX(230);
        stage.setY(100);


        final Label label = new Label(fromTo);
        label.setFont(new Font("Arial", 20));
        final Label labelTime = new Label(time);
        label.setFont(new Font("Arial", 14));

        XContainer container= XContainer.getInstance(null);

        String[] arr =labels.split(",");

        for (int x=0;x<arr.length;x++){
                arr[x]+=" - "+container.getLabels().get(arr[x]).getSizeInBytes()+" Byte";
        }

        List<String> xLabel= Arrays.asList(arr);
        ListView<String> list = new ListView<String>();
        ObservableList<String> items =FXCollections.observableArrayList (
                xLabel);
        list.setItems(items);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label,labelTime, list);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        stage.setAlwaysOnTop(true);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void ShowTaskDepend(String core){



                    XContainer xContainer=XContainer.getInstance(null);
                    XScheduler xS=new XScheduler();
                    Iterator<String> it;
                    if (xContainer!=null && xContainer.validateExecutable())
                    {
                        it=xContainer.getScheduler().keySet().iterator();
                        while (it.hasNext())
                        {

                            xS=xContainer.getScheduler().get(it.next());
                            System.out.println("ASSERT 0 "+xS.getName());
                            if (xS.getCore().getName().compareTo(core)==0)
                            {
                                break;
                            }
                            xS=null;

                        }

                    }

                    if (xS==null){
                        System.out.println("ASSERT 1 error");
                        return;
                    }


                    TabPane tabpane = new TabPane();


                    // create multiple tabs
                    for (int i = 0; i < xS.getTasks().size() ; i++) {


                            System.out.println("ASSERT 2_"+i);
                            // create Tab
                            String sel=xS.getTasks().get(i).getName();
                            Tab tab = new Tab(sel);
                            Label l1 =new Label("Access info");
                            Label l2 =new Label("Producer info");
                            Label l3 =new Label("Consumer info");
                                l1.setFont(new Font("Arial", 16));
                                l2.setFont(new Font("Arial", 16));
                                l3.setFont(new Font("Arial", 16));
                            l1.setPadding(new Insets(5));
                            l1.setPadding(new Insets(5));
                            tab.setClosable(false);
                            // create a label

                            // add label to the tab
                            SimpleLabelChain cur=new SimpleLabelChain(xS,false);
                            Separator separator = new Separator();
                            separator.setHalignment(HPos.LEFT);
                            separator.setStyle(
                                    "-fx-border-width: 2;"+
                                            "-fx-padding: 4 "

                            );
                            Separator separator2 = new Separator();
                            separator2.setHalignment(HPos.LEFT);
                            separator2.setStyle(
                                    "-fx-border-width: 2;"+
                                            "-fx-padding: 4 "

                            );
                            // add label to the tab
                            SimpleLabelChain curCons=new SimpleLabelChain(xS,true);
                            Separator separatorcons = new Separator();
                            separator.setHalignment(HPos.LEFT);
                            separator.setStyle(
                                    "-fx-border-width: 2;"+
                                            "-fx-padding: 4 "

                            );


                            Node ttmp;
                            if ( XUtil.hasDepended(xS.getTasks().get(i).getName(),xS)) {

                                ttmp = cur.getCanvas(sel);
                            }
                            else {
                                ttmp=new Label("No Producer Detected");

                            }

                            Node ttmp2;
                            if (   xS.getTasks().get(i).getConsumer().size()>0 ) {

                                ttmp2 = curCons.getCanvas(sel);
                            }
                            else {
                                ttmp2=new Label("No Consumer Detected");

                            }

                            Node labelAc;
                            if (xContainer.isMergingArrow()){
                                labelAc=generateLabbelAccess(sel,core);
                            }
                            else {
                                labelAc=new Label("Only available in Extended Simulation \nClick on the \uD83D\uDEC8 button on the TraceView for more information");
                            }

                            VBox box=new VBox(  l1,
                                                labelAc,
                                                separator,
                                                l2,
                                                ttmp,
                                                separatorcons,
                                                l3,
                                                ttmp2,
                                                separator2);
                            tab.setContent(box);


                            // add tab
                            tabpane.getTabs().add(tab);


                    }


                    StackPane secondaryLayout = new StackPane();

                    if (tabpane.getTabs().size()>0){
                        secondaryLayout.getChildren().add(tabpane);
                    }
                    else {
                        secondaryLayout.getChildren().add(new Label("No Dependency detected"));
                    }


                    Scene secondScene = new Scene(secondaryLayout);

                    System.out.println("ASSERT 3_1");
                    // New window (Stage)
                    Stage newWindow = new Stage();
                    newWindow.setTitle("Task View");
                    newWindow.setX(100);
                    newWindow.setY(100);
                    newWindow.setScene(secondScene);
                    newWindow.setMaximized(true);
                    // Set position of second window, related to primary window.


                    newWindow.show();
                    //circle.setFill(Color.DARKSLATEBLUE);
                    System.out.println("ASSERT 3_2");



    }

    private static Node generateLabbelAccess(String sel, String core) {

         NumberAxis xAxis = new NumberAxis();
         CategoryAxis yAxis = new CategoryAxis();
         BarChart<Number,String> bc =
                new BarChart<>(xAxis,yAxis);
        xAxis.setLabel("Access");
        xAxis.setTickLabelRotation(90);
        yAxis.setLabel(" ");

        XContainer container=XContainer.getInstance(null);

       XContainer.XResult result= container.getLabelAcces(sel,core);


        XYChart.Series series1 = new XYChart.Series();
        series1.setName("");

        XYChart.Data tmp1 = new XYChart.Data(result.getWrite(), "Write");
        series1.getData().add(tmp1);

        XYChart.Data tmp2 = new XYChart.Data(result.getRead(), "Read");

        series1.getData().add(tmp2);
        // series1.getData().add(new XYChart.Data(20148.82, "Global"));





        // series2.getData().add(new XYChart.Data(41941.19, "Global"));

        bc.getData().addAll(series1);


        bc.setPadding(new Insets(0,5,0,0));
        return new HBox(bc);



    }


    public static void showGlobalChains(XContainer con) {


        JTabbedPane tabbedPane = new JTabbedPane();


        LinkedList<LinkedList<XContainer.ChainElement>> global = con.getGlobalChain();
        LinkedList<XContainer.ChainElement> globalTmp ;

        Iterator<LinkedList<XContainer.ChainElement>> it=global.iterator();
        LinkedList <JComponent> compList=new LinkedList<>();
        int count=0;
        JComponent tmp;
        while (it.hasNext()){

            globalTmp=it.next();

            tmp = GlobalmxChartt(globalTmp);
            tabbedPane.addTab("Chain #"+(count+1), null, tmp, "Show chain #"+(count+1));
            tabbedPane.setSize(800 ,600);
            switch (count){
                case 0:
                    tabbedPane.setMnemonicAt(count, KeyEvent.VK_1);
                    break;
                case 1:
                    tabbedPane.setMnemonicAt(count, KeyEvent.VK_2);
                    break;
                case 2:
                    tabbedPane.setMnemonicAt(count, KeyEvent.VK_3);
                    break;
                case 3:
                    tabbedPane.setMnemonicAt(count, KeyEvent.VK_4);
                    break;
                case 4:
                    tabbedPane.setMnemonicAt(count, KeyEvent.VK_5);
                    break;
                case 5:
                    tabbedPane.setMnemonicAt(count, KeyEvent.VK_6);
                    break;
                case 6:
                    tabbedPane.setMnemonicAt(count, KeyEvent.VK_7);
                    break;
                case 7:
                    tabbedPane.setMnemonicAt(count, KeyEvent.VK_8);
                    break;
                case 8:
                    tabbedPane.setMnemonicAt(count, KeyEvent.VK_9);
                    break;
            }
            count++;
        }


        JFrame frame = new JFrame("Event Chain View");
        frame.setResizable(true);


        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());



        panel.add(tabbedPane);

        frame.add(panel);
        frame.setExtendedState( frame.getExtendedState()|JFrame.MAXIMIZED_BOTH );

        frame.setLocationRelativeTo(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    static JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    static JComponent GlobalmxChartt(LinkedList<XContainer.ChainElement> globalTmp) {

        JPanel panel = new JPanel(false);
        panel.setLayout(new FlowLayout());

        mxGraph graph;
        graph=new mxGraph();
        graph.setCellsEditable(false);
        Object style=new Object();


        LinkedList listLabel =new LinkedList();
        HashMap <String,Object> listRunnable =new HashMap<>();
        HashMap <String,Object> listTask =new HashMap<>();

        for (XContainer.ChainElement curr:globalTmp
             ) {
        //Add Label
            String fillTask="#FA0031",textTask="white";
            String fillRun="#00FFFF",textRun="black";
            String fillLabel="white",textLabel="blue";

            listLabel.add(graph.insertVertex(null,null,curr.getLabel().getName(),0,0,80,30,"fillColor="+fillLabel+";fontColor="+textLabel));

            if (listLabel.size()>1){

                //Link Label
                graph.insertEdge(null,null,"",listLabel.get(listLabel.size()-2),listLabel.get(listLabel.size()-1),"strokeColor=orange");

            }


            for (XRunnable runn:curr.getRead()){
                String run=runn.getName();
                String task=runn.getTask().getName();

                if (listRunnable.get(run) ==null){

                    listRunnable.put(run,graph.insertVertex(null,null,run,0,0,80,30,"fillColor="+fillRun+";fontColor="+textRun));
                }
                if (listTask.get(task) ==null){

                    listTask.put(task,graph.insertVertex(null,null,task,0,0,80,30,"fillColor="+fillTask+";fontColor="+textTask));
                }
                graph.insertEdge(null,null,"",listLabel.getLast(),listRunnable.get(run),"strokeColor=blue");
                graph.insertEdge(null,null,"",listRunnable.get(run),listTask.get(task),"strokeColor=blue");


            }
            for (XRunnable runn:curr.getWrite()){
                String run=runn.getName();
                String task=runn.getTask().getName();

                if (listRunnable.get(run) ==null){

                    listRunnable.put(run,graph.insertVertex(null,null,run,0,0,80,30,"fillColor="+fillRun+";fontColor="+textRun));
                }
                if (listTask.get(task) ==null){

                    listTask.put(task,graph.insertVertex(null,null,task,0,0,80,30,"fillColor="+fillTask+";fontColor="+textTask));
                }
                graph.insertEdge(null,null,"",listRunnable.get(run),listLabel.getLast(),"strokeColor=red");

                graph.insertEdge(null,null,"",listTask.get(task),listRunnable.get(run),"strokeColor=red");


            }

        }



//        graph.insertEdge(null,null,"",a,b);
        //      graph.insertEdge(null,null,"",b,c);

        mxGraphComponent graphComponent=new mxGraphComponent(graph);


        mxIGraphLayout layout = new mxHierarchicalLayout(graph);
        layout.execute(graph.getDefaultParent());




        graphComponent.setAutoscrolls(true);
        JScrollPane scrollFrame = new JScrollPane(graphComponent);
        scrollFrame.setPreferredSize(new Dimension( 900,650));



        return scrollFrame;
    }
    private static void StartAllChain(LinkedList<XContainer.ChainElement> list){
        JFrame frame = new JFrame("Event Chain View");
        frame.setResizable(true);


        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());



        panel.add(GlobalmxChartt(list));

        frame.add(panel);
        frame.setSize(800 ,600);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState( frame.getExtendedState()|JFrame.MAXIMIZED_BOTH );

        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private static void prepareAllChain(LinkedList<String> name, LinkedList<Integer> val){

        LinkedList<XContainer.ChainElement> out=new LinkedList<>();
        XContainer con =XContainer.getInstance(null);

        for (int i=0;i<name.size();i++){
            for (int j=0;j<name.size();j++){
                if (val.get(j).intValue()==i)
                {
                    out.add(new XContainer.ChainElement(con.getLabels().get(name.get(j))));
                    System.out.println(name.get(j));
                    break;
                }
            }
        }


        XRunnable ttmp;
        for (String ss:con.getRunnables().keySet()){
            ttmp=con.getRunnables().get(ss);

            for (XAccess acc:ttmp.getList()){

                for (XContainer.ChainElement el: out
                     ) {
                        el.saveAdd(ttmp,acc);
                }
            }

        }

        if (out.size()>0){

            StartAllChain(out);
        }
        else {
            JOptionPane.showMessageDialog(null,"Error");
        }


    }
    public static void showAllChains(XContainer xContainer) {
        Stage newWindow = new Stage();

        final Node depIcon  =null;
        LinkedList<String> output=new LinkedList<>();


        final CheckBoxTreeItem<String>  rootNode = new CheckBoxTreeItem<>("Model");

        List<ULabel> label = XUtil.getAllLabels(xContainer);


        rootNode.setExpanded(false);

        for (ULabel ulabel : label) {

            CheckBoxTreeItem<String> labelLeaf = new CheckBoxTreeItem<>(ulabel.getName(),new Label("\uD83D\uDCBE"));
            boolean found = false;



            for (TreeItem<String> taskLeaf : rootNode.getChildren()) {

                if (taskLeaf.getValue().contentEquals(ulabel.getTask()))
                {
                    found = true;
                    boolean found2=false;
                    for (TreeItem<String> runLeaf : taskLeaf.getChildren()) {
                        if (runLeaf.getValue().contentEquals( ulabel.getRunnable() ) ){

                            found2=true;
                            runLeaf.getChildren().add(labelLeaf);
                            break;
                        }


                    }
                    if (!found2)
                    {
                        CheckBoxTreeItem<String> runLeaf = new CheckBoxTreeItem<>(
                                ulabel.getRunnable(),
                                depIcon
                        );
                        taskLeaf.getChildren().add(runLeaf);
                        runLeaf.getChildren().add(labelLeaf);
                        break;
                    }else {
                        break;
                    }



                }
            }
            if (!found) {
                CheckBoxTreeItem<String> taskLeaf = new CheckBoxTreeItem<>(
                        ulabel.getTask(),
                        depIcon
                );
                CheckBoxTreeItem<String> runLeaf = new CheckBoxTreeItem<>(
                        ulabel.getRunnable(),
                        depIcon
                );

                rootNode.getChildren().add(taskLeaf);
                taskLeaf.getChildren().add(runLeaf);
                runLeaf.getChildren().add(labelLeaf);
            }
        }

        VBox box = new VBox();
        final Scene scene = new Scene(box, 400, 300);
        scene.setFill(Color.LIGHTGRAY);

        TreeView<String> treeView = new TreeView<>(rootNode);
        treeView.setCellFactory(CheckBoxTreeCell.<String>forTreeView());

        Button button=new Button("Plot Event Chain");
        button.setPadding(new Insets(5));
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                LinkedList<String> output=new LinkedList<>();
                for (TreeItem task:rootNode.getChildren()
                ) {

                    for (CheckBoxTreeItem run:(List<CheckBoxTreeItem>)task.getChildren()
                    ) {
                        for (CheckBoxTreeItem label:(List<CheckBoxTreeItem>)run.getChildren()
                        ) {

                            if (label.isSelected() && output.indexOf(label.getValue())==-1){
                                output.add(label.getValue().toString());


                            }

                        }

                    }
                }
                for(String aa:output){
                    System.out.println(aa);
                }
                if (output.size()>0&&output.size()<MAXELEMENT+1){
                    selectOrder(output);
                    newWindow.close();

                }
                else {
                    JOptionPane.showMessageDialog(null ,"Please select 1 - "+MAXELEMENT+" Label\nCurrent selectet: "+output.size());
                }

            }
        });

        box.getChildren().add(new Label("Please select 1 - "+MAXELEMENT+" items"));
        box.getChildren().add(treeView);
        box.getChildren().add(button);


        newWindow.setTitle("LabelSelect");
        newWindow.setScene(scene);

        // Set position of second window, related to primary window.
        newWindow.setX(100);
        newWindow.setY(100);

        newWindow.show();
    }
    private static void selectOrder(LinkedList <String> it){

        Stage stage = new Stage();
        stage.setTitle("Define sequence");
        VBox box=new VBox();
        LinkedList<Integer> options=new LinkedList<>();

        for (int i=0;i<it.size();i++){
            options.add(i);
        }

        LinkedList <String> name=it;
        LinkedList <ChoiceBox> boxes=new LinkedList<>();
        LinkedList <Integer> val=new LinkedList<>();

        int count=0;
        for (String cur:it){
            val.add(count);
            ChoiceBox <Integer> sb=new ChoiceBox<>(FXCollections.observableList(options));
            sb.setValue(count);
            final int x=count;
            sb.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

                    val.set(x,newValue.intValue());
                    for (Integer ii:val
                    ) {
                        System.out.println(ii);
                    }
                }
            });

            boxes.add(sb);
            HBox boxi=new HBox();

            Label ll=new Label(cur);
            Insets insets =new Insets(5) ;
            ll.setPadding(insets);
            sb.setPadding(insets);
            boxi.setPadding(insets);
            boxi.getChildren().add(ll);
            boxi.getChildren().add(sb);
            box.getChildren().add(
                        boxi

            );

            count++;
        }

        Button bt=new Button("Confirm sequence");
        final int WINDOWIDTH=350;
        bt.setPrefWidth(WINDOWIDTH-5);
        bt.setOnMouseClicked(event -> {System.out.println(validate(val));
            if (validate(val)){

                prepareAllChain(name,val);
                stage.close();
            }
            else {

                JOptionPane.showMessageDialog(null ,"Error\n Each position may only be occupied once");
            }
        });
        //box.getChildren().add(bt);
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(box);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);


        stage.setScene(new Scene(new VBox(scrollPane,bt), WINDOWIDTH, 500));
        stage.setResizable(false);
        stage.show();

    }
    private static boolean validate (LinkedList <Integer> inp){

        System.out.println(""+inp.size());
        for (int i=-1;i<inp.size();i++){
            boolean tmp=false;

            for (Integer x:inp){

                if (x.intValue()==i&&!tmp){
                    tmp=true;
                }
                else if ((x==i&&tmp)|| x.intValue()==-1){
                    return false;
                }
            }

        }
        if (inp.size()==0){
            return false;
        }
        else {
            return true;
        }

    }

    public static class CollumEntry{
        private final SimpleStringProperty e1;
        private final SimpleStringProperty e2;
        private final SimpleStringProperty e3;
        private final SimpleStringProperty e4;
        private final SimpleStringProperty e5;

        public CollumEntry(String e1, String e2, String e3, String e4) {
            this.e1 = new SimpleStringProperty(e1);
            this.e2 = new SimpleStringProperty(e2);
            this.e3 = new SimpleStringProperty(e3);
            this.e4 = new SimpleStringProperty(e4);
            this.e5 = new SimpleStringProperty("");
        }
        public CollumEntry(String e1, String e2, String e3, String e4,String e5) {
            this.e1 = new SimpleStringProperty(e1);
            this.e2 = new SimpleStringProperty(e2);
            this.e3 = new SimpleStringProperty(e3);
            this.e4 = new SimpleStringProperty(e4);
            this.e5 = new SimpleStringProperty(e5);
        }

        public String getE1() {
            return e1.get();
        }

        public SimpleStringProperty e1Property() {
            return e1;
        }

        public void setE1(String e1) {
            this.e1.set(e1);
        }

        public String getE2() {
            return e2.get();
        }

        public SimpleStringProperty e2Property() {
            return e2;
        }

        public void setE2(String e2) {
            this.e2.set(e2);
        }

        public String getE3() {
            return e3.get();
        }

        public SimpleStringProperty e3Property() {
            return e3;
        }

        public void setE3(String e3) {
            this.e3.set(e3);
        }

        public String getE4() {
            return e4.get();
        }

        public SimpleStringProperty e4Property() {
            return e4;
        }

        public void setE4(String e4) {
            this.e4.set(e4);
        }

        public String getE5() {
            return e5.get();
        }

        public SimpleStringProperty e5Property() {
            return e5;
        }

        public void setE5(String e5) {
            this.e5.set(e5);
        }
    }
    public static class ULabel {

        private final SimpleStringProperty name;
        private final SimpleStringProperty runnable;
        private final SimpleStringProperty task;

        public ULabel(String name, String runnable, String task) {
            this.name = new SimpleStringProperty(name);
            this.runnable = new SimpleStringProperty(runnable);
            this.task = new SimpleStringProperty(task);
        }

        public String getName() {
            return name.get();
        }

        public SimpleStringProperty nameProperty() {
            return name;
        }

        public void setName(String name) {
            this.name.set(name);
        }

        public String getRunnable() {
            return runnable.get();
        }

        public SimpleStringProperty runnableProperty() {
            return runnable;
        }

        public void setRunnable(String runnable) {
            this.runnable.set(runnable);
        }

        public String getTask() {
            return task.get();
        }

        public SimpleStringProperty taskProperty() {
            return task;
        }

        public void setTask(String task) {
            this.task.set(task);
        }
    }

}
