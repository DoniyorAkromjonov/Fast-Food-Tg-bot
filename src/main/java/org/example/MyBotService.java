package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
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

    public SendMessage menuButtonFunc(Long chatId) {

        InlineKeyboardButton burgerBtn = new InlineKeyboardButton("Burger");
        burgerBtn.setCallbackData("BURGER");

        InlineKeyboardButton snacksBtn = new InlineKeyboardButton("Snacks");
        snacksBtn.setCallbackData("SNACKS");

        InlineKeyboardButton sodaBtn = new InlineKeyboardButton("Soda");
        sodaBtn.setCallbackData("SODA");

        InlineKeyboardButton pizzaBtn = new InlineKeyboardButton("Pizza");
        pizzaBtn.setCallbackData("PIZZA");

        List<InlineKeyboardButton> row = List.of(burgerBtn, snacksBtn, sodaBtn, pizzaBtn);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup(List.of(row));

        return new SendMessage(chatId.toString(), "Choose button :") {{
            setReplyMarkup(markup);
        }};


    }


    public SendMessage changeLangButtonFunc(Long chatId) {

        InlineKeyboardButton englishBtn = new InlineKeyboardButton("English");
        englishBtn.setCallbackData("ENGLISH");

        InlineKeyboardButton englishagainBtn = new InlineKeyboardButton("English again");
        englishagainBtn.setCallbackData("ENGLISHAGAIN");

        List<InlineKeyboardButton> row = List.of(englishBtn, englishagainBtn);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup(List.of(row));

        return new SendMessage(chatId.toString(), "Choose button :") {{
            setReplyMarkup(markup);
        }};


    }


    public SendMessage filialButtonFunc(Long chatId) {

        InlineKeyboardButton englishBtn = new InlineKeyboardButton("Sergili");
        englishBtn.setCallbackData("SERGILI");

        InlineKeyboardButton englishagainBtn = new InlineKeyboardButton("Chilanzar");
        englishagainBtn.setCallbackData("CHILANZAR");

        List<InlineKeyboardButton> row = List.of(englishBtn, englishagainBtn);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup(List.of(row));

        return new SendMessage(chatId.toString(), "Choose button :") {{
            setReplyMarkup(markup);
        }};
    }


    public SendMessage ourContactButtonFunc(Long chatId) {

        InlineKeyboardButton englishBtn = new InlineKeyboardButton("Director");
        englishBtn.setCallbackData("DIRECTOR");

        InlineKeyboardButton englishagainBtn = new InlineKeyboardButton("Call center");
        englishagainBtn.setCallbackData("CALLCENTER");

        List<InlineKeyboardButton> row = List.of(englishBtn, englishagainBtn);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup(List.of(row));

        return new SendMessage(chatId.toString(), "Choose button :") {{
            setReplyMarkup(markup);
        }};
    }


    public SendMessage menuBurger(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("+1 Burger ");
        return sendMessage;
    }

    public SendMessage menuSnacks(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("+1 Snack ");
        return sendMessage;
    }

    public SendMessage menuSoda(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("+1 Soda ");
        return sendMessage;
    }

    public SendMessage menuPizza(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("+1 Pizza ");
        return sendMessage;
    }

    public SendMessage filianlSeregeli(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("filial sergeli ");
        return sendMessage;
    }

    public SendMessage filianlChilanzar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("filial chilanzar ");
        return sendMessage;
    }

    public SendMessage changelangEnglish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("changelang enlish ");
        return sendMessage;
    }

    public SendMessage changelangEnglishagain(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("changelang enlishagain ");
        return sendMessage;
    }

    public SendMessage contactDirector(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("contact director ");
        return sendMessage;
    }

    public SendMessage contactCallcenter(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("contact callcenter ");
        return sendMessage;
    }



}
