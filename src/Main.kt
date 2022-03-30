fun main() {
    var car = Car("Audi", "A3", "black", 6)
    car.carry(12)
    var bus = Bus("Minibus", "22Tr", "gold", 32)
    car.identity()

    var y = car.calculateParkingFee(2)
    println(y)

    bus.carry(48)
    bus.identity()

    var z = bus.calculateParkingFee(5)
    println(z)
    var b = bus.maxTripFare(22.5)
    println(b)

}

open class Car( var make: String,  var model: String,  var color: String, var capacity: Int) {
    fun carry(people: Int) {
        val x = people-capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        }
        else {
            println("Over capacity by $x ")
        }
    }
    open fun identity() {
        println("This is a $color $make $model")
    }

   open fun calculateParkingFee(hours: Int): Int {
        var multiplication = hours*200
        return multiplication

    }
}
class Bus(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        val x = people-capacity
        if (people <= capacity) {
            println("Carrying $people passengers")

        }
        else {
            println("Over capacity by $x ")
        }

    }
    open fun identity() {
        println("This is a $color $make $model")

    }


    fun calculateParkingFee(hours: Int): Int {
        var product = hours*20
        return product

    }
    fun maxTripFare(fare: Double): Double {
        var max = fare*capacity
        return max
    }

}
