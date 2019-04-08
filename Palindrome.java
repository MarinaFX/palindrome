Faça um programa que leia uma string e verifique se ela é palíndrome.
Palíndrome são aquelas palavras podem ser lidas tanto da esquerda para
direita ou da direita para esquerda. Exemplo: "arara". Crie um método
para verificar se a string é palíndrome.

O programa roda parcialmente e o problema é que as funções e algoritimo estão falhando para descobrir
quais palavras são de fato palíndromes. 

import java.util.Scanner;
public class Methods36
{
    public static StringBuffer palindrome(StringBuffer fraseUser)
    {
        
        
        
        //cria uma string para receber o valor do input do usario
        StringBuffer stringOriginal;
        stringOriginal = new StringBuffer(fraseUser);//string nova recebe o valor do usuario
        StringBuffer stringReverse;// cria uma nova string que irá inverter a original
        stringReverse = stringOriginal.reverse();//inverte a copia do input do usuario
        
        if(stringOriginal == stringReverse)//compara se são iguais
        {
            System.out.printf("%s é palíndrome\n", fraseUser);//imprime na tela se é palindrome
        }
        else
        {
            System.out.printf("%s não é palíndrome\n", fraseUser);//imprime se não for
        }
        
        return fraseUser;
    }
    
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        
        //cria uma string "modificável".
        StringBuffer fraseUser = new StringBuffer();
        int tamString = 0;
        //Lê a string do usuário.
        System.out.print("Digite uma palavra: ");
        fraseUser.append(in.nextLine());
        //chama o metodo.
        StringBuffer palindrome = new StringBuffer();
        palindrome = Methods36.palindrome(fraseUser);
        
        
    
    
    }
}