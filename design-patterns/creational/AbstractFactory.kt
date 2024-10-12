package creational

interface Helm {}
interface Armor {}

interface Weapon {}

interface WarriorFactory {
    fun createHelm(): Helm
    fun createArmor(): Armor
    fun createWeapon(): Weapon
}

class ShopeeHelm : Helm {}
class AmazonArmor : Armor {}
class MercadoLivreWeapon : Weapon {}

class MySetFactory : WarriorFactory {
    override fun createHelm(): Helm {
       return ShopeeHelm()
    }

    override fun createArmor(): Armor {
        return AmazonArmor()
    }

    override fun createWeapon(): Weapon {
        return MercadoLivreWeapon()
    }
}
fun main(args: Array<String>) {
   val factory = MySetFactory()
    val helm = factory.createHelm()

}