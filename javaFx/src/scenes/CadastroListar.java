package scenes;

import db.SQLite;
import entities.Cadastros;
import entities.Produto;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableView;

import java.sql.SQLException;

public class CadastroListar extends Application {
    @Override
    public void start(Stage listarUsuario) throws Exception {

        //Declaração da Table View
        TableView tableUsuario = new TableView();

        //Declaração das Colunas da minha TableView
        TableColumn<Cadastros, String> tcNome = new TableColumn<>("Nome");
        TableColumn<Cadastros, String> tcEmail = new TableColumn<>("Email");

        //Nome das Celulas de Controle ADICIONANDO
        tcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tcEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        //Vinculo entre TableView e a TableColumn
        tableUsuario.getColumns().add(tcNome);
        tableUsuario.getColumns().add(tcEmail);

        SQLite dbUsuario = new SQLite();
        for (Cadastros cad1 : dbUsuario.getUsuarios()){
            tableUsuario.getItems().add(cad1);
        }

        Scene scene = new Scene(tableUsuario);
        listarUsuario.setScene(scene);
        listarUsuario.show();
    }


    //Método para lista Produtos
    public void start2(Stage listarProduto) throws SQLException, ClassNotFoundException {

        //Declaração da Table View
        TableView tableProduto = new TableView();

        //Declaração das Colunas da minha TableView
        TableColumn<Produto, String> tcCodBarra = new TableColumn<>("Código Barra");
        TableColumn<Produto, String> tcNomeProduto = new TableColumn<>("Nome Produto");
        TableColumn<Produto, String> tcPreco = new TableColumn<>("Preço");

        //Nome das Celulas de Controle ADICIONANDO
        tcCodBarra.setCellValueFactory(new PropertyValueFactory<>("Código Barra"));
        tcNomeProduto.setCellValueFactory(new PropertyValueFactory<>("Nome Produto"));
        tcPreco.setCellValueFactory(new PropertyValueFactory<>("Preço"));

        //Vinculo entre TableView e a TableColumn
        tableProduto.getColumns().add(tcCodBarra);
        tableProduto.getColumns().add(tcNomeProduto);
        tableProduto.getColumns().add(tcPreco);

        SQLite dbProduto = new SQLite();
        for (Produto prod1 : dbProduto.getProduto()){
            tableProduto.getItems().add(prod1);
        }

        Scene scene = new Scene(tableProduto);
        listarProduto.setScene(scene);
        listarProduto.show();

    }

    public static void begin(){
        launch();
    }
}
