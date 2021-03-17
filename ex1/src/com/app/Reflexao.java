package com.app;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflexao {
    public static void refletirObjeto(Object objeto, Class classe) throws IllegalAccessException {
        System.out.println("Nome da classe: " + classe.getName());
        System.out.println("Localizaçao da classe: " + classe.getResource(classe.getName()));
        System.out.println("Tipo da classe: " + classe.getTypeName());

        System.out.println("--------------------------------");

        Field[] atributos = classe.getDeclaredFields();
        for(Field F: atributos) {
            F.setAccessible(true);

            if(F.getType().getTypeName() == "double")
                F.set(objeto, 10);

            System.out.println(F.getName() + ": " + F.getType().getTypeName() + " " + F.get(objeto));
        }

        Method[] metodos = classe.getDeclaredMethods();
        for(Method M : metodos) {
            System.out.println(M.getName() + " - parametros: " + Arrays.toString(M.getParameterTypes()) + " - retornos: " + M.getReturnType().getSimpleName());
        }
    }
}
