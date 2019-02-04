import scala.io.StdIn._
import com.sun.org.apache.bcel.internal.generic.SWITCH
import scala.util.control.Breaks

object Figuras {
  def areaCirculo(radio:Double):Double={
    val area=Math.PI*(Math.pow(radio,2))
    return area
  }
  
  def perimetroCirculo(diametro:Double):Double={
    val perimetro=Math.PI*(diametro)
    return perimetro
  }
  def perimetroTriangulo(lado1:Double,lado2:Double,lado3:Double):Double={
    val perimetro=lado1+lado2+lado3
    return perimetro
  }
  def areaTriangulo(base:Double,altura:Double):Double={
    val area=(base*altura)/2
    return area
  }
   def perimetroRectangulo(lado1:Double,lado2:Double):Double={
    val perimetro=(lado1+lado1)+(lado2+lado2)
    return perimetro
  }
  def areaRectangulo(base:Double,altura:Double):Double={
    val area=(base*altura)
    return area
  }
  def menu()={
    val fin=false
    val opcion=0
   
    while (!fin) {
      println("Ingrese una de las figuras: ")
      println("1) Circulo")
      println("2) Triangulo")
      println("3) Rectangulo")
      println("4)Salir")
     val opcion=readInt()
     
     if(opcion==1){
       var op1=false
        println("La figura seleccionada fue circulo: ")
       while(op1==false){
          println("¿Que desea obtener? ")
        
      println("1) Area")
      println("2) Perimetro")
      println("3) Salir")
      var opc1=readInt()
      if (opc1==1){
         println("Ingrese el radio del circulo ")
         var radio=readInt()
        println("El area es: "+ areaCirculo(radio))
      }else if (opc1==2){
        println("Ingrese el diametro del circulo ")
         var diametro=readInt()
              
        println("El perimetro es: "+ perimetroCirculo(diametro))
     }else if (opc1==3){
       op1=true
     }else{
        println("Opcion no válida ")
     }//CIRCULO
            
       } 
     
    }else if(opcion==2){
      
       var op1=false
        println("La figura seleccionada fue triangulo: ")
       while(op1==false){
          println("¿Que desea obtener? ")
        
      println("1) Area")
      println("2) Perimetro")
      println("3) Salir")
      var opc1=readInt()
      if (opc1==1){
         println("Ingrese base del triangulo ")
         var base=readInt()
         
         println("Ingrese Altura del triangulo ")
         var altura=readInt()
        println("El area es: "+ areaTriangulo(base, altura))
      }else if (opc1==2){
        println("Ingrese lado 1 ")
         var lado1=readInt()
         println("Ingrese lado 2 ")
         var lado2=readInt()
         println("Ingrese lado 3 ")
         var lado3=readInt()
              
        println("El perimetro es: "+ perimetroTriangulo(lado1, lado2, lado3))
     }else if (opc1==3){
       op1=true
     }else{
        println("Opcion no válida ")
     }
            
       }//TRIANGULO
    }else if(opcion==3){
      
      var op1=false
        println("La figura seleccionada fue rectangulo: ")
       while(op1==false){
          println("¿Que desea obtener? ")
        
      println("1) Area")
      println("2) Perimetro")
      println("3) Salir")
      var opc1=readInt()
      if (opc1==1){
         println("Ingrese base del rectangulo ")
         var base=readInt()
         
         println("Ingrese Altura del rectangulo ")
         var altura=readInt()
        println("El area es: "+ areaRectangulo(base, altura))
        
      }else if (opc1==2){
         println("Ingrese base del rectangulo ")
         var base=readInt()
         
         println("Ingrese Altura del rectangulo ")
         var altura=readInt()
              
        println("El perimetro es: "+ perimetroRectangulo(base, altura))
     }else if (opc1==3){
       op1=true
     }else{
        println("Opcion no válida ")
     }
            
       }//TRIANGULO
    }
  }
  
  }
  def main(args: Array[String]): Unit = {
    menu();
  }
}