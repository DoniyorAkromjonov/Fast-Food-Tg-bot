package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService{
    public SendMessage sendMessage(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Wellcome to bot, where you can order fast food!");
        return sendMessage;
    }


    public SendMessage menu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose button!!!");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        // Первая строка
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Menu");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Change lang");
        row1.add(button1);
        row1.add(button2);
        rowList.add(row1);

        // Вторая строка
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Filial");
        row2.add(button3);
        rowList.add(row2);

        // Третья строка
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Our Contacts");
        row3.add(button4);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }



//    MENU BUTTONS
        public SendMessage menuButton(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("You choose menu");
        return sendMessage;
    }

    public SendMessage filialButton(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("You choose filial");
        return sendMessage;
    }


    public SendMessage menuChangeLang(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("You choose lang");
        return sendMessage;
    }

    public SendMessage menuOurContact(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("You choose contact");
        return sendMessage;
    }

//    BUTTON FUNCTIONS

    public SendMessage buttonMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        // Первая строка
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Burger");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Snacks");
        row1.add(button1);
        row1.add(button2);
        rowList.add(row1);

        // Вторая строка
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Soda");
        row2.add(button3);
        rowList.add(row2);

        // Третья строка
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Pizza");
        row3.add(button4);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage buttonMenuBurger(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("You choose Burger");
        return sendMessage;
    }



}
