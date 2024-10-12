package structural

// O bridge faz a ponte entre uma interface e uma abstração

interface NotificationService {
    fun send()
}
class SMSNotificationServiceImpl : NotificationService {
    override fun send() {
        println("Sending...")
    }
}

class SMPTNotificationServiceImpl : NotificationService {
    override fun send() {
        println("Sending...")
    }
}

abstract class RequestService(private val notificationService: NotificationService) {
    open fun make() {
        println("Sending...")
        notificationService.send()
    }
}

class RequestServiceImpl(private val notificationService: NotificationService) : RequestService(notificationService) {
    override fun make() {
        super.make()
    }
}


fun main() {
    val notificationService: NotificationService = SMPTNotificationServiceImpl()
    val requestService: RequestService = RequestServiceImpl(notificationService)
    requestService.make()
}