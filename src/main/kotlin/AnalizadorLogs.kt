import java.io.File

class AnalizadorLogs {

        var listaLogs = mutableListOf<String>()

        fun logsToList(file: File) = file.readLines().forEach { listaLogs.add(it) }

        fun tipoOperaciones(): String {
            val listaOperaciones = mutableListOf<String>()
            listaLogs.forEach { listaOperaciones.add(it.split("||")[1]) }

            val operaciones = listOf("SELECT", "INSERT", "UPDATE", "DELETE_TABLE", "DELETE_REGISTRO")
            val numOp = mutableListOf(0,0,0,0,0)

            for (i in listaOperaciones.indices){
                when(listaOperaciones[i].trim()){
                    operaciones[0] -> numOp[0]++
                    operaciones[1] -> numOp[1]++
                    operaciones[2] -> numOp[2]++
                    operaciones[3] -> numOp[3]++
                    operaciones[4] -> numOp[4]++
                }
            }

            return "Operaciones: \n Select: ${numOp[0]} \n INSERT: ${numOp[1]} \n UPDATE: ${numOp[2]} \n" +
                    "DELETE TABLE: ${numOp[3]} \n DELETE REGISTRO: ${numOp[4]}"
        }

    fun opcionesErroneas(): String{
        val listaOperaciones = mutableListOf<String>()
        listaLogs.forEach { listaOperaciones.add(it.split("||")[1]) }
        var contErrorMenu = 0

        for (item in listaOperaciones) if (item.trim() == "ERROR") contErrorMenu++
        return "Numero de errores al elegir opcion del menu: $contErrorMenu"
    }

}