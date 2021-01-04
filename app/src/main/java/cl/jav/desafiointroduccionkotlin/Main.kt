package cl.jav.desafiointroduccionkotlin

/*
1.x Crear el proyecto Kotlin correctamente.
2.x Crear archivo “Main.kt” con la función main.
3.x Imprimir “Mi nombre es: {Nombre del alumno}.
4.x Declarar 3 variables numéricas con los valores “10”, “20” y “30”.
5.x Imprimir la suma de las 3 variables.
6. Declarar 1 variable String y otra variable Char.}
7. Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char.
8. Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable char a otro valor distinto.
9. Declarar una variable de tipo Float de forma explícita.
10. Asignar un valor a la variable Float.
11. Imprimir los valores máximos que pueden almacenar las variables Byte y Short.
12. Imprimir los valores mínimos que pueden almacenar las variables Int y Long.
13. Declarar una variable Boolean con true o false e imprimir su valor.
14. Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y
este imprime el total de caracteres de los dos parámetros.
15. Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%).
16. Desde la función main llamar a estas dos funciones de forma correcta
 */
fun main() {

   getImpresion()
   getVariables()
   getDeclarar()
   getExplicita()
   getMaximos()
   getMinimos()
   getBolean()
   imprimiendoParametros("dj","jav")
   obtieneIVA()

}
   //N3
fun getImpresion() {
      println("Mi nombre es Jorge Aguilar")
   }
   //4 & 5
fun getVariables() {
      val v1 = 10
      val v2 = 20
      val v3 = 30
      val result = v1 + v2 + v3
      println("$v1 + $v2 + $v3 = $result")
   }
   //6 & 7
fun getDeclarar() {

      val nombre = "Arataka Reigen"
      var codigo = 'A'

      //8
      val stringnombre = "el nombre contiene ${nombre.length} caracteres"
      codigo = 'B'
      println(stringnombre)
      println(codigo)
   }
   //9 & 10
fun getExplicita() {
      val muta = 15f
      println(muta)
   }
   //11
fun getMaximos() {
      val maximo = Byte.MAX_VALUE
      println(maximo)

      val max = Short.MAX_VALUE
      println(max)
   }
   //12
fun getMinimos() {
      val mini1 = Int.MIN_VALUE
      val mini2 = Long.MIN_VALUE
      println(mini1)
      println(mini2)
   }
   //13
fun getBolean(){
   val p = true
   println(p)
}
    //14
fun imprimiendoParametros(par1: String,par2: String){
       val result = par1.length + par2.length
       val stringpersona = ("${par1.length} + ${par2.length} = $result")
       println(stringpersona)

    }
fun obtieneIVA() {
      val precio = 12000
      val iva = 1.19F
      val result = precio * iva
      println(result)
   }
