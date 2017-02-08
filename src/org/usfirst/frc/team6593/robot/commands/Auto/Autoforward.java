package org.usfirst.frc.team6593.robot.commands.Auto;

import org.usfirst.frc.team6593.robot.commandsAutoDriveTrain.Forward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autoforward extends CommandGroup {

    public Autoforward() {
        // Add Commands here:
        addSequential(new Forward(10));
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
