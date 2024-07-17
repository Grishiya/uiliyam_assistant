package ru.uilyam.and.kate.pub.stuff.staffassistant.configuration;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.commands.DeleteMyCommands;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.uilyam.and.kate.pub.stuff.staffassistant.service.Bot;

@Configuration
public class TelegramBotConfiguration {
    @Value("${telegram.bot.token}")
    private String token;

    @Bean
    public TelegramBotsApi telegramBot(Bot bot) throws TelegramApiException {
        var apiBot = new TelegramBotsApi(DefaultBotSession.class);
        apiBot.registerBot(bot);
        return apiBot;
    }
}