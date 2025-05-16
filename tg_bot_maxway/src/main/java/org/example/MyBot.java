package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    private final MyBotService myBotService;
    public MyBot(MyBotService myBotService) {
        this.myBotService = myBotService;
    }


    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
            String message = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            if (message.equals("/start")){
                try {
                    execute(myBotService.sendMessage(chatId));
                    execute(myBotService.menu(chatId));
                }catch (TelegramApiException e){
                    throw new RuntimeException(e);
                }
            }

            if (update.hasMessage() && update.getMessage().hasText()) {
                String userMessage = update.getMessage().getText();

                switch (userMessage) {
                    case "Menu":
                        try {
                            execute(myBotService.menuButton(chatId));
                            execute(myBotService.buttonMenu(chatId));
                        }catch (TelegramApiException e){
                            throw new RuntimeException(e);
                        }
                        break;
                    case "Change lang":
                        try {
                            execute(myBotService.menuChangeLang(chatId));
                        }catch (TelegramApiException e){
                            throw new RuntimeException(e);
                        }
                        break;
                    case "Filial":
                        try {
                            execute(myBotService.filialButton(chatId));
                        }catch (TelegramApiException e){
                            throw new RuntimeException(e);
                        }
                        break;
                    case "Our Contacts":
                        try {
                            execute(myBotService.menuOurContact(chatId));
                        }catch (TelegramApiException e){
                            throw new RuntimeException(e);
                        }
                        break;
//                        Menu func
                    case "Burger":
                        try {
                            execute(myBotService.menuOurContact(chatId));
                        }catch (TelegramApiException e){
                            throw new RuntimeException(e);
                        }
                        break;


                    default:
                        sendTextMessag(chatId, "Пожалуйста, выберите одну из кнопок.");
                        break;
                }

            }

        }

    }

    private void sendTextMessag(Long chatId, String s) {
        System.out.println(chatId + " " + s);
    }

    @Override
    public String getBotUsername() {
        return "brand_in_java_bot";
    }

    @Override
    public String getBotToken(){
        return "7631569438:AAGItg0KAUO4Y1A7GeoiR8m5cphXFy39xqA";
    }

}
