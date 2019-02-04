import scala.io.StdIn._

object Meses {
  def meses(mes:Int):Unit={
    if(mes==2){
      println("El mes es febrero, tiene 28 días")
    }else if(mes==4||mes==6||mes==9||mes==11){
       println("El mes tiene 30 días")
    }else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
       println("El mes tiene 30 días")
    }
  }
  def menu():Unit={
    var opcion=false
        println("BIENVENIDO ")
    while(!opcion ){
    
        println("Escoja una opcion")
        println("1) Calcular numero de dias \n 2)Salir")
        var op=readInt()
        
        if (op==1){
         var op2=false
         while(!op2){
           println("Ingresa un numero del 1 al 12")
           var mes=readInt()
           if(mes==1||mes==2||mes==3||mes==4||mes==1||mes==5||mes==6||mes==7||mes==8||mes==9||mes==10||mes==11||mes==12){
             meses(mes)
           }else{
              println("MES NO VALIDO")
              op2=true
           }
       
         }
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