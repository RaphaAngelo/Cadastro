public class Cadastro {
    public static String validarNome(String nome) {
        return (nome == null || nome.trim().isEmpty()) ? "Nome não pode ser vazio" : null;
    }

    public static String validarCpf(String cpf) {
        return (cpf == null || !cpf.matches("\\d{11}")) ? "CPF inválido" : null;
    }

    public static String validarIdade(String idadeStr) {
        try {
            int idade = Integer.parseInt(idadeStr);
            return (idade < 0 || idade > 120) ? "Idade inválida" : null;
        } catch (NumberFormatException e) {
            return "Idade inválida";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF (11 dígitos): ");
        String cpf = sc.nextLine();
        System.out.print("Digite a idade: ");
        String idade = sc.nextLine();

        boolean erro = false;
        if (validarNome(nome) != null) {
            System.out.println(validarNome(nome));
            erro = true;
        }
        if (validarCpf(cpf) != null) {
            System.out.println(validarCpf(cpf));
            erro = true;
        }
        if (validarIdade(idade) != null) {
            System.out.println(validarIdade(idade));
            erro = true;
        }

        if (!erro) {
            System.out.println("Cadastro realizado com sucesso!");
            System.out.printf("Nome: %s%nCPF: %s%nIdade: %s%n", nome, cpf, idade);
        }

        sc.close();
    }
}