package desafioBanco;

import java.util.Scanner;

public class contaEspecial {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char codigo1,codigo2,codigo3;
		int contador2=1;
		int y = 0, i = 0,c=0,d=0;
		char[] codigo =new char [2];
		String numeroConta;
		double Saldo[] = new double[10];
		String CNPJ;
		double Emprestimo = 15000.00;
		double credito[] = new double[10] ;
		double debito[] = new double[10] ;
		double saldo = 0;
		String CPF;
		double valorLimite = 800;
		int tipoDeConta ; //1 - conta poupança, 2 - conta corrente, 3 - conta especial 3- conta empresarial
		int tipo;
		double valor [] = new double [10];
		int contador = 0;
		char opcao;
		int Codigo;
		System.out.println("Digite o tipo de conta; 1 - conta poupança, 2 - conta corrente, 3 - conta especial 4- conta empresarial");
		tipoDeConta = leia.nextInt();
		
		//entradas
				if (tipoDeConta == 1) {
				System.out.println("Digite o numero da conta:");
				numeroConta= leia.nextLine();
				System.out.println("Digite seu CPF:");
				CPF=leia.nextLine();
				
				//processamento
				System.out.println("12/11/2020 É o aniversario da conta deseja receber seu bonus monetário? 1-SIM/2-NÂO ");
				Codigo=leia.nextInt();
				if (Codigo==1)
				{
					Saldo[y]= 100 + (Saldo[y]*0.05);
					System.out.println("Você ganhou um bonus de 0,5% sobre seu Saldo");
					System.out.printf("Saldo R$: %.2f ",Saldo[y]);
					
					for (x=0; x<10; x++)
					{
						System.out.println("\nDeseja 1-Creditar ou 2-Debitar?");
						codigo=leia.nextInt();
						if (codigo==1)
						{
							System.out.println("\nQuanto deseja creditar?:");
							
							credito=leia.nextDouble();
							Saldo[x]=Saldo[x]+credito;
							
						}
						else if (codigo ==2)
						{
							System.out.println("\nQuanto deseja debitar?");
							debito=leia.nextDouble();
							Saldo[x]=100-debito;
							
						}
						else
						{
							System.out.println("codigo digitado invalido!!");
						}
						System.out.printf("Seu saldo é: %.2f", Saldo[x]);
			
					
					} System.out.println("\nVOCÊ ATINGIU O LIMETE DE 10 MOVIMENTAÇÕES!");
				}
				
				System.out.print("\n-------------------------------\n");
				System.out.print("Conta: "+numeroConta+"\t"+"cpf: "+cpf);
				
				System.out.print("\n-------------------------------\n");
				
				for(x=0;x<10;x++)
				{
					System.out.printf("\nR$ %.2f",Saldo[x],"\n");
				
				}
				}
		if (tipoDeConta == 3)
		{
		System.out.println("Bem Vindo a Conta Especil");		
		System.out.println("Digite o numero da conta");
		numeroConta = leia.next();
		System.out.println("Digite o seu CPF:");
		CPF = leia.next();
		System.out.println("Você esta na conta " + numeroConta + " seu saldo é de " + 0);
	do {	
		System.out.println("Voce deseja 1- creditar ou 2- Debitar na conta? ");
		tipo = leia.nextInt();
		
		if(tipo == 1) 
		{	
			System.out.println("Digite o valor que deseja colocar na conta ");
			valor[contador] = leia.nextDouble();
			saldo = saldo + valor[contador];
				
			System.out.println("Seu saldo é de " + saldo + "Reais" + "e Valor especial de " + valorLimite);
		}
		double valorEscolhido;
	
		if(tipo == 2) 
		{
			System.out.println("Digite o valor que deseja retirar da conta ");
			valorEscolhido = leia.nextDouble();		
			//Saldo = Saldo - valorEscolhido;
			
			if(valorEscolhido < saldo)
			{
								
				//System.out.println("Voce entrou no Limite Especil de " + valorLimite);
				saldo = saldo - valorEscolhido;
				//valorLimite = valorLimite - valorEscolhido;
			//	valor[contador]+= valorEscolhido;
				//System.out.println("Voce aintem tem " + valorLimite + "Reais de limite especial");				
							
			}
			else if(valorEscolhido <= valorLimite) 
			{
				
				System.out.println("Voce entrou no Limite Especil de " + valorLimite);
				valorLimite-=valorEscolhido;
				valor[contador]+=valorEscolhido;
				System.out.println("Voce ainda tem " + valorLimite + "Reais de limite especial");
			}  else
			{
				System.out.println("Voce não tem esse Limite Disponivel");
			}
		
		}
		contador++;		
		if(contador == 10) 
		{
			System.out.println("Você atingiu seu limite de transações");
			break;
		}	
					System.out.println("Deseja continuar sim ou não?");
					opcao = leia.next().toUpperCase().charAt(0);
		} while (opcao == 'S' || opcao == 's');
	
		for(int x=0; x<10;x++) 
		{
			System.out.println("transação "+(x+1)+ " " + valor[x]);
		}
		
		System.out.println("seu saldo é "+ (saldo));
		System.out.println("seu limite de cretito especial é " + (valorLimite));
		/*if(Saldo > 0 || valorLimite < 800) 
		{
			//valorLimite+= Saldo;
			Saldo += (valorLimite - 800);
			valorLimite = 800;
			System.out.println("seu saldo é "+ (Saldo));
			System.out.println("seu limite de cretito especial é " + (valorLimite));
		}
		else if(valorLimite > 800) {
			Saldo += (valorLimite - 800);
			valorLimite = 800;
			System.out.println("seu saldo é "+ (Saldo));
			System.out.println("seu limite de cretito especial é " + (valorLimite));
		} else 
		{
			System.out.println("seu saldo é "+ (Saldo));
			System.out.println("seu limite de cretito especial é " + (valorLimite));
		}
		*/
		
	}
		if(tipoDeConta==4) {
			System.out.print("Digite o numero da sua conta empresarial:\n");
			numeroConta = leia.next();
			System.out.print("Digite o seu CNPJ: \n");
			CNPJ = leia.next();
			System.out.print("Bem vindo a Generation Bank\n");
			System.out.print("Olá Você gostaria de um emprestimo? Digite  S-im e N-ão\n");
			codigo1 =leia.next().toUpperCase().charAt(0);
			for(i = 0; i <10; i++) {
				
				    if(codigo1 =='S') {
				    System.out.printf("Seu saldo no momento é R$ %.2f.",Saldo[y]);
				    System.out.print("\nNo momento você tem o valor de R$ 15.000,00 disponivel para emprestimo!\n");
				    System.out.print("Digite o valor:\n");
				    credito[c] = leia.nextDouble();		
				    Saldo[y] = credito[c];
				    Emprestimo = Emprestimo - Saldo[y];
				          if(Saldo[y]>=Emprestimo) {
				        	
				        	
				        	  System.out.printf("Digite um valor dentro do limite\n");
				        	  credito[c]=leia.nextDouble();
				        	  Emprestimo =15000-credito[c];
				        	  Saldo[y]=credito[c];
				        	 
				          }
				   
				  
				    System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[y]);
				    System.out.printf("\nNo momento você tem o valor de R$ %.2f disponivel para emprestimo\n!",Emprestimo);
				   
				   
				    System.out.print("\nGostaria de fazer alguma movimentação na sua conta? ");
				    System.out.print("Digite 1 Sim e 2-Não\n");
				    codigo[y] =leia.next().toUpperCase().charAt(0);
				       
			
				    	if(codigo[y]=='1')  {
				    		
				    		for(i=0;i<10;i++) {
				    			
				    			System.out.printf("\nMovimentação "+ contador++);
				   	           System.out.print("\nDigite 1-Credito ou 2-debito: ");
					           codigo3 =leia.next().toUpperCase().charAt(0);
					        	  if( codigo3 == '1') {
					          	System.out.print("\nDigite o valor: ");
					        	credito[c]=leia.nextDouble();
					        	
								Saldo[y] = Saldo[y] +credito[c];
								
					        			        	
					        	System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[x]);
					                                 }
					             else if(codigo3=='2') {
					        	System.out.print("\nDigite o valor: ");
					        	debito[d]=leia.nextDouble();
					        	Saldo[y] = Saldo[y]-debito[d];
					        	
					        	System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[y]);
					        	
					       
					        	  }
					        		    		       
					        	else {
					        	System.out.print("Opção invalida!!\n");
						    	System.out.print("\nDigite 1-Credito ou 2-Debito: ");
						    	codigo3 =leia.next().toUpperCase().charAt(0);
					                	}
					        	
				    	}
				    		System.out.println(" ");
				    	}
				    	
				    	
				    	
				    	
				  
				   
				    }
				    else if(codigo1=='2') {
				    	 System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[y]);
				    }
				    else {
				    	System.out.print("Opção invalida!!\n");
			    	System.out.print("Digite S-im ou N-ão?");
			    	codigo1 =leia.next().toUpperCase().charAt(0);
				    }
				
				    System.out.print("Conta: "+numeroConta+"\t CNPJ: "+CNPJ+"\n");
				    System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[y]);
			
						  
					   }
				    }
			}	
		
}
	/*if (valorLimite > 800) 
	{valorLimite = valorLimite + valor[contador];
		valorLimite = 800;
	}*/
