import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();
        FileWriter escrita = new FileWriter("cep_" + endereco.cep() + ".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}