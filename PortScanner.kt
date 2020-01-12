import java.io.IOException
import java.net.InetAddress
import java.net.Socket

fun main() {
    val host = "localhost"
    val inetAddress = InetAddress.getByName(host)
    val hostName = inetAddress.hostName
    for (port in 0..65535) {
        try {
            val socket = Socket(hostName, port)
            val text = "$hostName is listening on port $port"
            println(text)
            socket.close()
        } catch (e: IOException) { // empty catch block
        }
    }
}
