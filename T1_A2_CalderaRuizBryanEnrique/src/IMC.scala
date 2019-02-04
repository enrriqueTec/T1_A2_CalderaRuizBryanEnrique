
import scala.io.StdIn._
object IMC {
  def datos():Double={
    var imc=0.0
    println("Ingrese su peso en Kg ejemplo 79")
    var peso=readDouble()
    println("Ingrese su estatura en metros ejemplo 1.70")
    var estatura=readDouble()
    imc=peso/(estatura*estatura)
    return imc
  }
  def indicador():Unit={
    var valor=datos()
    if(valor<16){
      println("Criterio de ingreso al hospital")
    }else if(valor>=16&&valor<=17){
      println("IMC considerado como INFRAPESO")
    }else if(valor>=17&&valor<=18){
      println("IMC considerado como BAJO PESO")
    }else if(valor>=18&&valor<=25){
      println("IMC considerado como SALUDABLE")
    }else if(valor>=25&&valor<=30){
      println("IMC considerado como SOBREPESO (OBESIDAD GRADO 1)")
    }else if(valor>=30&&valor<=35){
      println("IMC considerado como SOBREPESO CRÓNICO (OBESIDAD GRADO 2)")
      
    }else if(valor>=35&&valor<=40){
      println("IMC considerado como OBESIDAD PREMÓRBIDA (OBESIAD GRADO 3)")
    }else if(valor>40){
      println("IMC considerado como OBESIDAD MÓRBIDA (OBESIDAD GRADO 4)")
    }
  }
  def menu():Unit={
    var opcion=false
        println("BIENVENIDO A LA CALCULADORA DE IMC")
    while(!opcion ){
    
        println("Escoja una opcion")
        println("1) Calcular IMC \n 2)Salir")
        var op=readInt()
        if (op==1){
          indicador()
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