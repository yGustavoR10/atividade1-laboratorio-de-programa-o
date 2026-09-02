package exBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        // Conta criada conforme solicitado na atividade:
        // número 1, agência 100, nome "Sede", tipo 1 e saldo inicial 0.
        Conta c1 = new Conta(1, 100, "Sede", 1);

        try {
            while (op != 5 && c1.getTipo() != 4) {
                System.out.println("\n==============================");
                System.out.println("    SISTEMA BANCARIO");
                System.out.println("==============================");
                System.out.println("1 - Creditar");
                System.out.println("2 - Debitar");
                System.out.println("3 - Consultar Saldo");
                System.out.println("4 - Encerrar Conta");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opcao: ");

                try {
                    op = sc.nextInt();

                    if (op < 1 || op > 5) {
                        System.out.println("Erro: opcao invalida. Digite um numero de 1 a 5.");
                        continue;
                    }

                    switch (op) {
                        case 1:
                            if (c1.getTipo() == 4) {
                                System.out.println("Erro: a conta esta encerrada.");
                            } else {
                                System.out.print("Digite o valor a creditar: R$ ");
                                double valorCredito = sc.nextDouble();

                                if (valorCredito <= 0) {
                                    System.out.println("Erro: o valor deve ser maior que zero.");
                                } else {
                                    c1.creditar(valorCredito);
                                    System.out.printf("Credito realizado com sucesso. Novo saldo: R$ %.2f%n",
                                            c1.getSaldo());
                                }
                            }
                            break;

                        case 2:
                            if (c1.getTipo() == 4) {
                                System.out.println("Erro: a conta esta encerrada.");
                            } else {
                                System.out.print("Digite o valor a debitar: R$ ");
                                double valorDebito = sc.nextDouble();

                                if (valorDebito <= 0) {
                                    System.out.println("Erro: o valor deve ser maior que zero.");
                                } else {
                                    c1.debitar(valorDebito);
                                    System.out.printf("Débito realizado com sucesso. Novo saldo: R$ %.2f%n",
                                            c1.getSaldo());
                                }
                            }
                            break;

                        case 3:
                            System.out.println(c1.consultarSaldo());
                            break;

                        case 4:
                            if (c1.getSaldo() < 0) {
                                System.out.printf(
                                    "Nao e possível encerrar a conta. Saldo negativo: R$ %.2f%n",
                                    c1.getSaldo()
                                );
                                op = 0; // mantém o programa em execução
                            } else {
                                double saldoRetirado = c1.getSaldo();
                                c1.encerrarConta();
                                System.out.println(c1.textoEncerrar(saldoRetirado));
                            }
                            break;

                        case 5:
                            System.out.println("Programa encerrado pelo usuário.");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Erro: digite apenas valores numericos válidos.");
                    sc.nextLine(); // limpa a entrada inválida
                    op = 0;
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                    op = 0;
                }
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
