/*
En la escuela especializada en ingeniería ITCA-FEPADE se manejan un número grande de empleados,
recursos humanos proporciono la siguiente información. Todo empleado tiene nombre, código de empleado,
edad, dirección, área a la que pertenece, cargo que desempeña en el área, sueldo base, fecha de ingreso. Los
empleados pueden ser docentes o administrativos. El docente puede ser permanente o por servicio. El área
cuenta con código de área, nombre, cantidad de empleados, numero de edificio.
Al final se desea capturar la información del empleado, imprimir los datos personales y el área a la que
pertenece. Del edificio se conoce la ubicación, el nombre, cantidad de departamentos que alberga,
cantidad de pisos. Además, se desea saber el salario final del empleado tomando en cuenta todos los
descuentos de ley (ISSS, AFP Y RENTA), recordar que si es empleado por servicio solo se le debe
descontar renta.

 */
package practicasemana4java;





public class Info_Trabador extends Edificio{
    String nombre;
    int cod_Empleado;
    int edad;
    String direccion;
    String area_De_Trabajo;
    String cargoDesempeñado;
    double sueldoBase;
    boolean tipoContrato;

    public Info_Trabador() {
    }

    public Info_Trabador(String nombre, int cod_Empleado, int edad, String direccion, String area_De_Trabajo, String cargoDesempeñado, double sueldoBase, boolean tipoContrato) {
        this.nombre = nombre;
        this.cod_Empleado = cod_Empleado;
        this.edad = edad;
        this.direccion = direccion;
        this.area_De_Trabajo = area_De_Trabajo;
        this.cargoDesempeñado = cargoDesempeñado;
        this.sueldoBase = sueldoBase;
        this.tipoContrato = tipoContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_Empleado() {
        return cod_Empleado;
    }

    public void setCod_Empleado(int cod_Empleado) {
        this.cod_Empleado = cod_Empleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getArea_De_Trabajo() {
        return area_De_Trabajo;
    }

    public void setArea_De_Trabajo(String area_De_Trabajo) {
        this.area_De_Trabajo = area_De_Trabajo;
    }

    public String getCargoDesempeñado() {
        return cargoDesempeñado;
    }

    public void setCargoDesempeñado(String cargoDesempeñado) {
        this.cargoDesempeñado = cargoDesempeñado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public boolean isTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(boolean tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    
    
    String inforTrabajador(){
        String info = "";
        
        info +="El nombre es :"+nombre+"\n";
        info +="El codigo del empleado es :"+cod_Empleado+"\n";
        info +="La edad del empleado es :"+edad+"\n";
        info +="La direccion del empleado es :"+direccion+"\n";
        info +="El area de trabajo es :"+area_De_Trabajo+"\n";
        info +="El cargo a desempeñar es :"+cargoDesempeñado+"\n";
        info +="El sueldo base es : $"+sueldoBase+"\n";
        
        return info;
    }
    
    boolean tipoContrato(){
        if(this.tipoContrato == true){
            System.out.println("El contrato es permanente");
        }else{
            System.out.println("El contrato es Temporal ");
        }
        return tipoContrato;
    }
}
