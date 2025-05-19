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


        try {
            if (update.hasMessage() && update.getMessage().hasText()) {
                String message = update.getMessage().getText();
                Long chatId = update.getMessage().getChatId();

                switch (message) {
                    case "/start":
                        execute(myBotService.sendMessage(chatId));
                        execute(myBotService.menu(chatId));
                        break;
                    case "Menu":
                        execute(myBotService.menuButtonFunc(chatId));
                        break;
                    case "Change lang":
                        execute(myBotService.changeLangButtonFunc(chatId));
                        break;
                    case "Filial":
                        execute(myBotService.filialButtonFunc(chatId));
                        break;
                    case "Our Contacts":
                        execute(myBotService.ourContactButtonFunc(chatId));
                        break;
                    default:
                        sendTextMessag(chatId, "Пожалуйста, выберите одну из кнопок.");
                }
            } else if (update.hasCallbackQuery()) {
                String callbackData = update.getCallbackQuery().getData();
                Long chatId = update.getCallbackQuery().getMessage().getChatId();

                switch (callbackData) {
                    case "BURGER":
                        execute(myBotService.menuBurger(chatId));
                        break;
                    case "SNACKS":
                        execute(myBotService.menuSnacks(chatId));
                        break;
                    case "SODA":
                        execute(myBotService.menuSoda(chatId));
                        break;
                    case "PIZZA":
                        execute(myBotService.menuPizza(chatId));
                        break;
                    case "SERGELI":
                        execute(myBotService.filianlSeregeli(chatId));
                        break;
                    case "CHILANZAR":
                        execute(myBotService.filianlChilanzar(chatId));
                        break;
                    case "ENGLISH":
                        execute(myBotService.changelangEnglish(chatId));
                        break;
                    case "ENGLISHAGAIN":
                        execute(myBotService.changelangEnglishagain(chatId));
                        break;
                    case "DIRECTOR":
                        execute(myBotService.contactDirector(chatId));
                        break;
                    case "CALLCENTER":
                        execute(myBotService.contactCallcenter(chatId));
                        break;
                    default:
                        sendTextMessag(chatId, "Неизвестная кнопка.");
                }
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
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
