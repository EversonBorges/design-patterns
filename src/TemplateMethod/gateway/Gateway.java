package TemplateMethod.gateway;

import java.util.Random;

public class Gateway {

    public boolean cobrar(double valor){
        System.out.println("Valor -> " + valor);
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        return randomNumber != 0;
    }
}
