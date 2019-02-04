
import scala.io.StdIn._
object Calificaciones {
   def lectura():Double={
    println("Ingrese la calificacion 1")
    var cal1=readInt()
    println("Ingrese la calificacion 2")
    var cal2=readInt()
    println("Ingrese la calificacion 3")
    var cal3=readInt()
    println("Ingrese la calificacion 4")
    var cal4=readInt()
    println("Ingrese la calificacion 5")
    var cal5=readInt()
    var suma=cal1+cal2+cal3+cal4+cal5
    return suma
  }
   def promedio():Double={
     var promedio=lectura()/5
     return promedio
   }
   def comparacion():Unit={
   var prom=promedio()
   
   if(prom<=100 &&prom>=90){
       println("El  promedio del alumno es: "+prom)
     println("El indicador del promedio del alumno es EXCELENTE ")
   }else if(prom<=89 &&prom>=80){
       println("El  promedio del alumno es: "+prom)
    
     println("El indicador del promedio del alumno es BIEN ")
   }else if(prom<=79 &&prom>=70){
       println("El  promedio del alumno es: "+prom)
    
     println("El indicador del promedio del alumno es BIEN ")
   }else if(prom<=69){
       println("El  promedio del alumno es: "+prom)
     
     println("El indicador del promedio del alumno es TERRIBLE ")
   }
     
     
   }
    def menu():Unit={
    var opcion=false
        println("BIENVENIDO AL INDICADOR DE EXCELENCIA PROMEDIAL")
    while(!opcion ){
    
        println("Escoja una opcion")
        println("1) Calcular promedio \n 2)Salir")
        var op=readInt()
        if (op==1){
          comparacion()
        }else if(op==2){
          opcion=true
        }else{
            println("OPCION NO VÁLIDA")
        }
    }
  }
   def main(args: Array[String]): Unit = {
   comparacion()
  }
}