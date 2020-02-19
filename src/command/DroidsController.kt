package command

class DroidsController(d : Droid) {
    var commands : Array<Command> = arrayOf(
        DroidPowerCommand(d),
        DroidWeaponCommand(d),
        DroidNightVisionCommand(d)
    )
    var commandStack : MutableList<Command> = mutableListOf()
    fun activate(){
        commandStack.add(commands[0])
        commands[0].execute()
    }
    fun activateWeapon(){
        commandStack.add(commands[1])
        commands[1].execute()
    }
    fun activateNV(){
        commandStack.add(commands[2])
        commands[2].execute()
    }
    fun undo(){
        commandStack.last().undo()
        commandStack.remove(commandStack.last())
    }
}