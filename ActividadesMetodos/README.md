"# ActividadesMetodos" 
Inicio
 
    // Método para mostrar un mensaje
    Definir procedimiento mostrarMensaje(mensaje)
        Escribir mensaje
    FinProcedimiento
 
    // Método para mostrar los días de la semana
    Definir procedimiento mostrarDiasSemana()
        Escribir "Lunes"
        Escribir "Martes"
        Escribir "Miércoles"
        Escribir "Jueves"
        Escribir "Viernes"
        Escribir "Sábado"
        Escribir "Domingo"
    FinProcedimiento
 
    // Método para imprimir la tabla de multiplicar
    Definir procedimiento imprimirTablaMultiplicar(numero)
 
        Para i ← 1 Hasta 10 Hacer
            Escribir numero, " x ", i, " = ", numero * i
        FinPara
 
    FinProcedimiento
 
    // Programa principal
    mostrarMensaje("Bienvenido al programa de métodos sin retorno")
 
    Escribir ""
 
    mostrarDiasSemana()
 
    Escribir ""
 
    imprimirTablaMultiplicar(5)
 
Fin
