package kz.fa.onlinekassa.persistense

fun main(args: Array<String>) {
    var vehicle = Aero()
    vehicle.run()
    vehicle.runAway()
}

interface DoneMone {
    var name: String
    var monet: String
    fun runAway() {
        println("run away")
    }

    fun run()
}

interface Bone {
    var Dorou: Int
}

class Aero : DoneMone, Bone {
    override var Dorou: Int = 5
    override var name: String = "Maero"
    override var monet: String = "Monaero"

    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}