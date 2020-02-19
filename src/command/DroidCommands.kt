package command

class DroidPowerCommand(droid : Droid) : Command {
    var droid : Droid = droid
    override fun execute() {
        println("command.Droid activated")
        droid.power = true
    }
    override fun undo() {
        println("command.Droid deactivated")
        droid.power = false
    }
}
class DroidWeaponCommand(droid: Droid) : Command {
    var droid = droid
    override fun execute() {
        println("command.Droid ready to attack!")
        droid.weapon++
    }
    override fun undo() {
        println("command.Droid don't ready to attack!")
        droid.weapon--
    }
}

class DroidNightVisionCommand(droid: Droid) : Command {
    var droid = droid
    override fun execute() {
        println("command.Droid see you!")
        droid.nightVision = true
    }
    override fun undo() {
        println("command.Droid don't see you :(")
        droid.nightVision = false
    }
}