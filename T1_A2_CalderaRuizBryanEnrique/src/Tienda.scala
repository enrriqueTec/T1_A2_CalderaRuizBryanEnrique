
import scala.io.StdIn._
object Tienda {
  def datos():Int={
    println("Ingresa la cantidad de pantalones a comprar")
    var cantidad=readInt()
    return cantidad
    
  }
  def comparacion():Double={
    var precio=356.82
    var pago=0.0
    var desc=0.0
    var cant=datos()
    if(cant<5){
     pago=cant*precio
    }else if(cant>=5 && cant<=12){
      desc =precio*.85
      pago=cant*desc
    }else if(cant>12){
      desc =precio*.70
      pago=cant*desc
    }
    return pago
  }
  def menu():Unit={
         println("BIENVENIDO A LA CALCULADORA DE PAGOS DICKIES")
         var opcion=false
    while(!opcion ){
    
        println("Escoja una opcion")
        println("1) Calcular Monto a pagar \n2)Salir")
        var op=readInt()
        if (op==1){
         var total= comparacion()
            println("total a pagar es: "+total)
        }else if(op==2){
          opcion=true
        }else{
            println("OPCION NO VÁLIDA")
        }
    }
  }
  def main(args: Array[String]): Unit = {
  menu()
  }
}