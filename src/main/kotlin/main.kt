import java.io.File

fun main(){
    //Inicializamos variables y rellenamos lista
    val file = File("logControlador")
    val analizador = AnalizadorLogs()
    analizador.logsToList(file)

    //Contador de operaciones
    print(analizador.tipoOperaciones())
}