
package info.coderqc.mc.bettermc.command;

@Mod.EventBusSubscriber
public class JokesCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("jokes").requires(s -> s.hasPermission(2))
						.then(Commands.argument("arguments", StringArgumentType.greedyString()).executes(JokesCommand::execute))
						.executes(JokesCommand::execute));
	}

	private static int execute(CommandContext<CommandSourceStack> ctx) {
		ServerLevel world = ctx.getSource().getLevel();

		double x = ctx.getSource().getPosition().x();
		double y = ctx.getSource().getPosition().y();
		double z = ctx.getSource().getPosition().z();

		Entity entity = ctx.getSource().getEntity();
		if (entity == null)
			entity = FakePlayerFactory.getMinecraft(world);

		HashMap<String, String> cmdparams = new HashMap<>();
		int[] index = {-1};
		Arrays.stream(ctx.getInput().split("\\s+")).forEach(param -> {
			if (index[0] >= 0)
				cmdparams.put(Integer.toString(index[0]), param);
			index[0]++;
		});

		JokesCommandExecutedProcedure.execute();

		return 0;
	}

}
