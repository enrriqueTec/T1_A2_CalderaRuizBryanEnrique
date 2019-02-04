import scala.io.StdIn._

object Prestamo {
  
  def puntos(salario:Int,prestamos:Int,propiedad:Int):Int={
    
    var puntos=0
    if((salario*.50)<=prestamos){
      puntos=puntos+5
    }else if((salario*.25)>= prestamos && (salario*.50)<=prestamos){
      puntos=puntos+3
    }else if((salario*.10)>=prestamos && (salario*.25)<=prestamos){
      puntos=puntos+1
    }else if((propiedad*2)>=prestamos){
      puntos=puntos+5
    }else if(propiedad==prestamos&&(propiedad*2)<prestamos){
      puntos=puntos+3
    }
    return puntos
  }
  def datos():Unit={
    println("Ingrese los siguientes datos del solicitante")
     println("Ingrese Nombre")
    var nombre=readLine()
    println("Historia Crediticia (B) o (A)")
    var historia=readLine()
    println("Ingrese la cantidad a pedir")
    var cantidad=readInt()
    println("Ingrese Salario anual")
    var salario=readInt()
    println("Ingrese Valor de otras propiedades")
    var prop=readInt()
    
   if( (puntos(salario,cantidad,prop))==6){
     println("prestamo otorgado ")
     
   }else{
     println("prestamo denegado ")
     
   }
  }
  
   def menu():Unit={
    var opcion=false
        println("BIENVENIDO AL GESTIONADOR DE PRESTAMOS")
    while(!opcion ){
    
        println("Escoja una opcion")
        println("1) calcular Prestamo \n 2)Salir")
        var op=readInt()
        if (op==1){
          datos()
        }else if(op==2){
          opcion=true
        }else{
            println("OPCION NO VÁLIDA")
        }
    }
  }
def main(args: Array[String]): Unit = {
    menu();
  }
}