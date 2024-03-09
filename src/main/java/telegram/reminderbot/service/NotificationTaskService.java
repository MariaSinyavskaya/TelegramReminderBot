package telegram.reminderbot.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import telegram.reminderbot.listener.TelegramBotUpdatesListener;
import telegram.reminderbot.model.NotificationTask;
import telegram.reminderbot.repository.NotificationTaskRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class NotificationTaskService {
    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }


    public List<NotificationTask> findByLocalDateTime(LocalDateTime localDateTime) {
        return notificationTaskRepository.findAllByLocalDateTime(localDateTime);
    }

    public NotificationTask save(NotificationTask notificationTask) {
        return notificationTaskRepository.save(notificationTask);
    }

    public void delete(NotificationTask notificationTask) {
        notificationTaskRepository.delete(notificationTask);
    }
}
