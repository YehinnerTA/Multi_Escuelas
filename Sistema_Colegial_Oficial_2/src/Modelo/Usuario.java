package Modelo;

public class Usuario extends Persona{
    private String usuario;
    private String contraseña;

    public String getUsuario()                      {   return usuario;                 }
    public void setUsuario(String usuario)          {   this.usuario = usuario;         }
    public String getContraseña()                   {   return contraseña;              }
    public void setContraseña(String contraseña)    {   this.contraseña = contraseña;   }
}