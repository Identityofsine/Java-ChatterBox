package Commands.Runnable;

import Audio.LavaPlayer.PlayerManager;
import Commands.CommandBehavior;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.GenericMessageEvent;
import net.dv8tion.jda.api.events.role.GenericRoleEvent;
import net.dv8tion.jda.api.events.self.GenericSelfUpdateEvent;
import net.dv8tion.jda.api.events.user.GenericUserEvent;

public class Stop extends CommandBehavior {
    @Override
    public void action(GenericEvent event) {

    }

    @Override
    public void action(GenericSelfUpdateEvent<?> event) {

    }

    @Override
    public void action(GenericUserEvent event) {

    }

    @Override
    public void action(GenericMessageEvent event) {
        PlayerManager.get().stop(event.getGuild());
        event.getGuild().getAudioManager().closeAudioConnection();
    }

    @Override
    public void action(GenericRoleEvent event) {

    }
}