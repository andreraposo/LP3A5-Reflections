package com.app;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class classe = Class.forName("com.app.Aluno");
        Object objeto = classe.getConstructor().newInstance();

        Field F;
        F = objeto.getClass().getDeclaredField("nome");
        F.setAccessible(true);
        F.set(objeto, "Andre");

        F = objeto.getClass().getDeclaredField("codigo");
        F.setAccessible(true);
        F.set(objeto, 2);

        F = objeto.getClass().getDeclaredField("matricula");
        F.setAccessible(true);
        F.set(objeto, "12345");

        Reflexao.refletirObjeto(objeto, objeto.getClass());

    }
}
