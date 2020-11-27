package domain;

import javax.xml.crypto.Data;

public class Post {
    private int id;//id поста на стене
    private OwnerPost ownerPost;//информация о пользователе, разместившем пост
    private Data data;//дата размещения поста
    private String text;//текст поста
    private boolean yesMedia;//есть медиа в посте или нет
    private MediaPost mediaPost;//информация о размещенных медиа
    private ViewsInfo viewsInfo;//информация о просмотрах поста
    private CommentsInfo commentsInfo;//информация о комментариях к посту
    private ReportsInfo reportsInfo;//информация о репостах
    private LikesInfo likesInfo;//информация о лайках
    private boolean canFix;//можно закрепить запись
    private boolean canDelete;//можно удалить запись
    private boolean canEdit;//можно редактировать запись
    private boolean canCopy;//можно скопировать запись
    private int idOwnerGive;//id пользователей, которые поделились постом
    private int idOwnerLike;//id пользователей, которым понравился пост


}
