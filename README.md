# Consulta de CEP

Este projeto é um aplicativo Java que permite consultar informações de endereço a partir de um CEP (Código de Endereçamento Postal) usando a API pública do ViaCEP. Os dados retornados são exibidos no console e salvos em um arquivo JSON.

## Tecnologias Utilizadas

- **Linguagem**: Java 11+
- **Bibliotecas**:
    - Gson (para manipulação de JSON)
    - Java HTTP Client (para requisições HTTP)
- **Ferramentas**: Maven/Gradle (para gerenciamento de dependências - não incluído no código)

## Como Instalar e Rodar o Projeto

### Pré-requisitos
- JDK 11 ou superior instalado
- Biblioteca Gson adicionada ao classpath

### Passos:
1. Clone o repositório ou baixe os arquivos fonte
2. Compile as classes:
   ```bash
   javac -d bin -cp "lib/gson-2.13.1.jar" src/*.java
   ```
3. Execute o programa:
   ```bash
   java -cp "bin:lib/gson-2.13.1.jar" Principal
   ```

## Como Usar o Projeto

1. Ao iniciar o programa, digite um CEP de 8 dígitos quando solicitado
2. O sistema retornará as informações de endereço no formato:
   ```
   Endereco{cep='01001000', logradouro='Praça da Sé', complemento='lado ímpar', bairro='Sé', localidade='São Paulo', uf='SP'}
   ```
3. Um arquivo JSON será gerado no formato `cep_<numero>.json` com os dados completos

Exemplo de arquivo JSON gerado (`cep_01001000.json`):
```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP"
}
```