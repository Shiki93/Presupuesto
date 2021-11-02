package Clases;

public class Logica {
    
    /*
    Logica para las transacciones
    */
    
    static Cuenta_Corriente cuenta = new Cuenta_Corriente();
    static Transaccion trans = new Transaccion();
    static int transaccionID = cuenta.getLista_Transacciones().size();
    
    public boolean add_Transaccion(Transaccion transaccion){
        try {
            transaccion.setId(transaccionID);
            cuenta.getLista_Transacciones().add(transaccion);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete_Transaccion(int id){
        for (int i = 0; i < cuenta.getLista_Transacciones().size(); i++){
            if (cuenta.getLista_Transacciones().get(i).getId() == id){
                cuenta.getLista_Transacciones().remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean edit_Transaccion(Transaccion transaccion){
        for (int i = 0; i < cuenta.getLista_Transacciones().size(); i++){
            if (cuenta.getLista_Transacciones().get(i).getId() == transaccion.getId()){
                cuenta.getLista_Transacciones().get(i).setDetalle(transaccion.getDetalle());
                cuenta.getLista_Transacciones().get(i).setCategoria(transaccion.getCategoria());
                cuenta.getLista_Transacciones().get(i).setFecha_Transaccion(transaccion.getFecha_Transaccion());
                cuenta.getLista_Transacciones().get(i).setMonto(transaccion.getMonto());
                cuenta.getLista_Transacciones().get(i).setTipo(transaccion.getTipo());
                return true;
            }
        }
        return false;
    }
}
