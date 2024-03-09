package telegram.reminderbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import telegram.reminderbot.model.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {
    List<NotificationTask> findAllByLocalDateTime(LocalDateTime localDateTime);
}
