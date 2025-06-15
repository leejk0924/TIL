package com.example.redis.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class ChatService implements MessageListener {
    private final RedisMessageListenerContainer container;
    private final RedisTemplate<String, String> redisTemplate;
    public void enterCharRoom(String chatRoomName) {
        container.addMessageListener(this, new ChannelTopic(chatRoomName));
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if (line.equals("q")) {
                System.out.println("Quit...");
                break;
            }
            redisTemplate.convertAndSend(chatRoomName, line);
        }
        container.removeMessageListener(this);
    }
    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println("message = " + message.toString());
    }
}
