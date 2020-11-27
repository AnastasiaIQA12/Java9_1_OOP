package domain;

public class CommentsInfo {
    private int count;//количество комментариев
    private boolean canPost;//может ли пользователь оставить комментарий
    private int canGroupPost;//может ли сообщество оставить комментарий
    private boolean canClose;//может ли пользователь закрыть комментарий к записи
    private boolean canOpen;//может ли пользователь открыть комментарий к записи
    private Comments comments;//комментарий
}
