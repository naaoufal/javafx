package application;

import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.coffeemachine.controllers.ClientController;
import com.coffeemachine.controllers.MachineController;
import com.coffeemachine.controllers.ProductController;
import com.coffeemachine.controllers.TechnicianController;
import com.coffeemachine.models.Client;
import com.coffeemachine.models.Machine;
import com.coffeemachine.models.Product;
import com.coffeemachine.models.Technician;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class SampleController implements Initializable {


	@FXML
	private BorderPane bo;

	@FXML
	private AnchorPane ap;

	@FXML
	private TextField idtech;

	@FXML
	private TextField nametech;

	@FXML
	private TextField phonetech;

	@FXML
	private TextField idrefftech;

	@FXML
	private TextField accessidtech;

	

	@FXML
	private TextField idClient;

	@FXML
	private TextField nameClient;

	@FXML
	private TextField phoneClient;

	@FXML
	private TextField choiceClient;

	@FXML
	private TextField coinsClient;

	@FXML
	private TextField rest;

	@FXML
	private TextField id2;

	@FXML
	private TextField name2;

	@FXML
	private TextField price;

	@FXML
	private TableView<?> tb2;

	@FXML
	private TextField id3;

	@FXML
	private TextField sumChange;

	@FXML
	private TableView<?> tb3;

	@FXML
	private ListView<?> proList;
	
	//Techniciant section :
	
	@FXML
	private TableView<Technician> technicians_table;

	@FXML
	private TableColumn<Technician, Long> id;

	@FXML
	private TableColumn<Technician, String> name;

	@FXML
	private TableColumn<Technician, String> phone;

	@FXML
	private TableColumn<Technician, String> idref;

	@FXML
	private TableColumn<Technician, String> code;
	
	//Client section :
	
    @FXML
    private TableColumn<Client, Long> idClient1;
    
    @FXML
    private TableColumn<Client, String> nameClient1;

    @FXML
    private TableColumn<Client, String> phoneClient1;

    @FXML
    private TableColumn<Client, Double> choiceClient1;

    @FXML
    private TableColumn<Client, Double> coinsClient1;

    @FXML
    private TableView<Client> tbClient1;
    
    // Product section :
    
    @FXML
    private TableView<Product> tbProduct;

    @FXML
    private TableColumn<Product, Long> idProduct;

    @FXML
    private TableColumn<Product, String> nameProduct;

    @FXML
    private TableColumn<Product, Double> priceProduct;
    
    //Machine section :
    @FXML
    private TableColumn<Machine, Double> sumChange1;

    @FXML
    private TableView<Machine> tbMachine;

    @FXML
    private TableColumn<Machine, Long> idMachine;

    @FXML
    private TableColumn<Machine, Boolean> statChange;
    
    //Home section :
    @FXML
    private ComboBox<Machine> machinelist;
    
    

	TechnicianController techC = new TechnicianController();
	//public ArrayList<Technician> technicians = new ArrayList<Technician>();
	public ObservableList<Technician> technicianss = FXCollections.observableArrayList();
	Technician tech;

	ClientController cliC = new ClientController();
	public ObservableList<Client> clients = FXCollections.observableArrayList();
	
	Client cli;

	ProductController proC = new ProductController();
	public ObservableList<Product> products = FXCollections.observableArrayList();
	Product pro;

	MachineController machC = new MachineController();
	public ObservableList<Machine> machines = FXCollections.observableArrayList();
	Machine mach;

	
	@Override
	public void initialize(URL location, ResourceBundle rc) {
		machinelist.setItems(machines);
		
	}
	
	//Techniciants section :
	public void initialize1(URL url, ResourceBundle rb) {
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		name.setCellValueFactory(new PropertyValueFactory<>("name"));
		phone.setCellValueFactory(new PropertyValueFactory<>("phone"));
		idref.setCellValueFactory(new PropertyValueFactory<>("idRef"));
		code.setCellValueFactory(new PropertyValueFactory<>("accessCode"));
		
	}	
	
	 public void loadTechnicianData() {
		 technicians_table.setItems(technicianss);
         initialize1(null, null);
     }
	 
	 //Clients section :
	 public void initialize2(URL url, ResourceBundle rb1) {
		 
		 idClient1.setCellValueFactory(new PropertyValueFactory<>("id"));
		 nameClient1.setCellValueFactory(new PropertyValueFactory<>("name"));
		 phoneClient1.setCellValueFactory(new PropertyValueFactory<>("phone"));
		 choiceClient1.setCellValueFactory(new PropertyValueFactory<>("choice"));
		 coinsClient1.setCellValueFactory(new PropertyValueFactory<>("coins"));
		 
	 }
	 
	 public void loadClientData () {
		 
		 tbClient1.setItems(clients);
		 initialize2(null, null);
		 
	 }
	 
	 //Products section :
	 public void initialize3 (URL url, ResourceBundle rb2) {
		 
		 idProduct.setCellValueFactory(new PropertyValueFactory<>("id"));
		 nameProduct.setCellValueFactory(new PropertyValueFactory<>("name"));
		 priceProduct.setCellValueFactory(new PropertyValueFactory<>("price"));
		 
	 }
	 
	 public void loadProductData () {
		 
		 tbProduct.setItems(products);
		 initialize3(null, null);
		 
	 }
	 
	 // Machine section :
	 public void initialize4 (URL url, ResourceBundle rb3) {
		 
		 idMachine.setCellValueFactory(new PropertyValueFactory<>("id"));
		 //statChange.setCellValueFactory(new PropertyValueFactory<>("isTurnedOn"));
		 sumChange1.setCellValueFactory(new PropertyValueFactory<>("sumChange"));
		 
	 }
	 
	 public void loadMachineData() {
		 
		 tbMachine.setItems(machines);
		 initialize4(null, null);
		 
	 }
	
	public void home() {

		bo.setCenter(ap);

	}

	public void page1() {

		loadPage("page1");

	}

	public void page2() {

		loadPage("page2");

	}

	public void page3() {

		loadPage("page3");

	}

	public void page4() {

		loadPage("page4");

	}

	public void addTech() throws Exception {

		tech = new Technician(Long.parseLong(String.valueOf(idtech.getText())), nametech.getText(), phonetech.getText(),
		idrefftech.getText(), accessidtech.getText());
		technicianss.add(tech);
		System.out.println(technicianss);
		loadTechnicianData();
		
		

	}

	public void addClient() throws Exception {

		cli = new Client(Long.parseLong(String.valueOf(idClient.getText())), nameClient.getText(),
		phoneClient.getText(), choiceClient.getText(), Double.parseDouble(coinsClient.getText()));
		clients.add(cli);
		System.out.println(clients);
		loadClientData();
		

	}

	public void addProduct() throws Exception {

		pro = new Product(Long.parseLong(String.valueOf(id2.getText())), name2.getText(),
		Double.parseDouble(price.getText()));
		//proC.AddProduct(products, pro);
		products.add(pro);
		System.out.println(products);
		loadProductData();
		
	}

	public void addMachine() throws Exception {

    	mach = new Machine(Long.parseLong(String.valueOf(id3.getText())) , Double.parseDouble(sumChange.getText()));
    	//machC.AddMachine(machines, mach);
    	machines.add(mach);
    	System.out.println(machines);
    	loadMachineData();

	}

	

	private void loadPage(String page) {

		Parent root = null;

		try {

			root = FXMLLoader.load(getClass().getResource(page + ".fxml"));

		} catch (Exception e) {

			System.out.println(e);

		}

		bo.setCenter(root);

	}







}
