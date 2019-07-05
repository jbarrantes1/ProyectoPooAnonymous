/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Login {

    private String user, psw;
    private boolean enter = true;
    private int nLine = 0;
    private static Scanner sc;
    private String line;
    private ArrayList<String> users = new ArrayList<>();
    private static int tries = 0;
    private String answ;
    public Scanner u = new Scanner(System.in);

    public Login() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public boolean isEnter() {
        return enter;
    }

    public void setEnter(boolean enter) {
        this.enter = enter;
    }


    public void validate() {
        System.out.println("ingrese usuario");
        user = u.nextLine();
        System.out.println("ingrese clave");
        psw = u.nextLine();
        if ((users.contains(user)) && (users.contains(psw))) {
            answ = "bienvenido " + user;
            enter = false;
        } else {
            tries++;
            answ = "usted a tenido " + tries + " intento/s fallidos";
        }
        System.out.println(answ);
        if (tries > 2) {
            System.exit(0);
        }
    }

    public void leer() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Documents\\universidades\\UNAL\\2019-i\\POO\\Proyecto\\ProyectoPooAnonymous\\datos.txt"));
            String brRead;
            while ((brRead = br.readLine()) != null) {
                
                users.add(brRead);
            }
        } catch (FileNotFoundException exp) {
            System.out.println("archivo no encontrado");
        }
    }
}
