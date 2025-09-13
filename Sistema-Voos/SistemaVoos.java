import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaVoos {
    BufferedReader reader;

    Companhia c1;

    public static void main(String[] args) throws Exception{
        SistemaVoos sv = new SistemaVoos();
        sv.c1 = new Companhia();
        sv.reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Nome da Companhia: ");
        sv.c1.setNomeCompanhia(sv.reader.readLine());
        System.out.println("CNPJ: ");
        sv.c1.setCnpj(sv.reader.readLine());
        System.out.println("Telefone: ");
        sv.c1.setTelefone(sv.reader.readLine());
        System.out.println("Email da Companhia: ");
        sv.c1.setTelefone(sv.reader.readLine());
        sv.menu();
    }


    private void menu () throws Exception {
        String opcao = "";
        while (!opcao.equals("4")) {
            System.out.println("------------------------------------");
            System.out.println("[1] Cadastrar novo voo");
            System.out.println("[2] Listar Voos existentes");
            System.out.println("[3] Consultar um voo");
            System.out.println("[4] Sair");
            opcao = this.reader.readLine();

            switch (opcao) {
                case "1":
                    cadastrarVoo();
                    //Cadastrar um novo voo
                    break;
                
                case "2":
                    
                    listarVoos();
                    break;

                case "3":
                    
                    consultarVoo();
                    break;

                case "4":
                    
                    break;
            
                default:
                    break;
            }

        }
    }

    private void cadastrarVoo() throws Exception {
        Voo v = new Voo();
        System.out.println("TELA DE CADASTRO DE VOOS");
        System.out.println("Número do Voo: ");
        v.setNroVoo(Integer.parseInt(reader.readLine()));
        System.out.println("Código do Voo: ");
        v.setCodigoVoo(reader.readLine());
        System.out.println("Origem do Voo");
        v.setOrigem(reader.readLine());
        System.out.println("Destino do Voo");
        v.setDestino(reader.readLine());
        System.out.println("Data do Voo");
        v.setData(reader.readLine());

        System.out.println("---Cadastre os passageiros do Voo---");
        for(int i = 0; i < 50; i++){
            System.out.println("Insira o nome ou um espaço nulo caso queira sair dessa tela\nNome do passageiro: ");
            String nome  = reader.readLine();

            if (nome.equals("")){
                break;
            }

            Passageiro passageiro = new Passageiro();
            passageiro.setNome(nome);
            System.out.println("Insira o CPF: ");
            passageiro.setCpf(reader.readLine());
            System.out.println("Insira a data de nascimento: ");
            passageiro.setDataNascimento(reader.readLine());
            System.out.println("Insira o email: ");
            passageiro.setEmail(reader.readLine());
            System.out.println("Insira o telefone: ");
            passageiro.setTelefone(reader.readLine());
            System.out.println("Insira a nacionalidade: ");
            passageiro.setNacionalidade(reader.readLine());
            System.out.println("Insira o genero: ");
            passageiro.setGenero(reader.readLine());
            v.setPassageiro(passageiro);
            
        }
        c1.setVoo(v);
    }

    private void listarVoos(){
        System.out.println("------------------------------------");
        System.out.println("Relatório de Voos");
        for(int  i = 0; i < c1.getQtdeVoos(); i++){
            Voo v = c1.getVoo(i);
            System.out.println("Número: " + v.getNroVoo()
            + " - Código: " + v.getCodigoVoo()
            + "\nOrigem: " + v.getOrigem() 
            + "\nDestino: " + v.getDestino()
            + "\nData: " + v.getData() + 
            "\nQuantidade de passageiros: " + v.getQtdePassageiros()
            );
        }
    }

    private void consultarVoo() throws Exception {
        System.out.println("------------------------------------");
        System.out.println("Consulta de Voo");
        System.out.println("Insira o número do Voo: ");
        int numVoo = Integer.parseInt(reader.readLine());
        boolean find = false;
        
        for (int i = 0; i < c1.getQtdeVoos(); i++){
            Voo v = c1.getVoo(i);
            if (v.getNroVoo() == numVoo){
                System.out.println("[PASSAGEIROS DO VOO " + numVoo + "]");
                int posPassageiro = 0;
                while (v.getPassageiro(posPassageiro) != null){
                    String linha = "Nome: " + v.getPassageiro(posPassageiro).getNome();
                    linha += " - CPF: " + v.getPassageiro(posPassageiro).getCpf();
                    linha += " - Data de Nascimento: " + v.getPassageiro(posPassageiro).getData_nascimento();
                    linha += " - Email: " + v.getPassageiro(posPassageiro).getEmail();
                    linha += " - Telefone: " + v.getPassageiro(posPassageiro).getTelefone();
                    linha += " - Nacionalidade: " + v.getPassageiro(posPassageiro).getNacionalidade();
                    linha += " - Genero: " + v.getPassageiro(posPassageiro).getGenero();
                    System.out.println(linha);
                    posPassageiro++;
                }
                find = true;
                break;
            }
        }
        if(!find){
            System.out.println("Voo não encontrado");
        }

    }
}
