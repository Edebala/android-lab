import java.util.Base64

fun encode(msg: String): String = Base64.getEncoder().encodeToString(msg.toByteArray())
fun decode(msg: String): String = String(Base64.getDecoder().decode(msg))
fun messageCoding(msg: String, func: (String) -> String): String = func(msg)

fun main(){
    val msg = "Hello, World!"
    val msg_encoded = messageCoding(msg, ::encode)
    val msg_decoded = messageCoding(msg_encoded, ::decode)

    println("Original message: $msg")
    println("Encoded message: $msg_encoded")
    println("Decoded message: $msg_decoded")
}
