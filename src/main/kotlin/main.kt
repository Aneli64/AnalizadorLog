import java.io.File

fun main(args: Array<String>){

    //Inicializamos variables y rellenamos lista
    val fileC = File("logControlador")
    val analizadorC = AnalizadorLogs()
    analizadorC.logsToList(fileC)
    //LOG CONTROLADOR

    //Contador de operaciones
    println(analizadorC.tipoOperaciones())

    //Inicializamos variables y rellenamos lista
    val fileV = File("logVista")
    val analizadorV = AnalizadorLogs()
    analizadorV.logsToList(fileV)
    //LOG VISTA

    //numero de opciones presionadas fuera de las posibles
    println(analizadorV.opcionesErroneas())
}