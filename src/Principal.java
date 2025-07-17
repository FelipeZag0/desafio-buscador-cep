import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número de CEP para consulta:");
        var cep = leitura.nextLine();

        // Corrigido isBlack para isBlank
        if (cep.isBlank()) {
            System.out.println("CEP não pode ser vazio.");
            return;  // Substituído continue por return
        }

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        } finally {
            System.out.println("\nAplicação finalizada");
        }

        leitura.close();  // Movido para dentro do método main
    }
}