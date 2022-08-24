/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.tarea2_202100125_s2;

/**
 *
 * @author Lenovo
 */
public class Usuario_Tarea2 {
   
    String nombre; //Variable del nombre del usuario 
    String apellido; //Variable del apellido del usuario 
    String password; // contraseña del usuario
   
    //Contructor 
  Usuario_Tarea2(String nombre,String apellido, String password){
        
        this.nombre= nombre; 
        this.apellido= apellido;
        this.password = password;
        
  }
  //get and set
   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}
