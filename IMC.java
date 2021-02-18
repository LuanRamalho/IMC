import java.util.*;

public class IMC 
{
    void massa()
    {
        Scanner ler = new Scanner(System.in);
        
        float altura;
        float peso;
        float imc; 
        imc = (float) 0.0;
        
        System.out.println("Digite a altura da pessoa: ");
        altura = ler.nextFloat();
        
        System.out.println("Digite o peso da pessoa: ");
        peso = ler.nextFloat();
        
        imc = peso / (altura*altura);
        
        System.out.println("");
        
        if (imc > 16 && imc < 16.9)
        {
            System.out.println("IMC da pessoa: "+imc);
            System.out.println("A pessoa está muito abaixo do peso, em desnutrição crítica.");
        }
        
        else if (imc > 17 && imc < 18.4)
        {
            System.out.println("IMC da pessoa: "+imc);
            System.out.println("A pessoa está abaixo do peso, um pouco critica.");
        }
        
        else if (imc > 18.5 && imc < 24.9)
        {
            System.out.println("IMC da pessoa: "+imc);
            System.out.println("A pessoa está no peso normal.");
        }
        
        else if (imc > 25 && imc < 29.9)
        {
            System.out.println("IMC da pessoa: "+imc);
            System.out.println("A pessoa está acima do peso.");
        }
        
        else if (imc > 30 && imc < 34.9)
        {
            System.out.println("IMC da pessoa: "+imc);
            System.out.println("A pessoa está em obesidade grau 1.");
        }
        
        else if (imc > 35 && imc < 40)
        {
            System.out.println("IMC da pessoa: "+imc);
            System.out.println("A pessoa está em obesidade grau 2, que é um pouco grave");
        }
        
        else if (imc > 40)
        {
            System.out.println("IMC da pessoa: "+imc);
            System.out.println("A pessoa está em obesidade grau 3, que é extremamente grave");
        }
    }

    public static void main(String[] args)
    {
        IMC i = new IMC();
        i.massa();
    }
    
}
