/* 
 * Copyright 2019 mon-mode - 0mon.mode@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

//import java.util.Locale;
import java.util.Random;
//import java.util.Scanner;

/**
 *
 * @author mon-mode
 */
public class Main {
    /*Objeto Scanner, en estos ejercicios del Random no se utiliza.

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+"); */
    
    //Inicio Random
    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Variable
        int balance;

        //Generar dato
        balance = RND.nextInt();

        //Mensajes de salida, usamos Math.abs para que sean todos positivos.
        System.out.printf("Balance de circulación.........: %d%n", Math.abs(balance));
        //Para sacar un número de 0 a 9
        System.out.printf("Balance de circulación (max 10): %d%n", Math.abs(balance) % 10);

    }
}
